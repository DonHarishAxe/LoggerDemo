package com.endurance.empoyee;

import org.hibernate.boot.jaxb.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

/**
 * Created by harish on 14/6/17.
 */
@Transactional
@Service
public class EmployeeService {
    /*@Autowired
    private EmployeeDao employeeDao;
    public Employee getAllEmployees(){
        return employeeDao.getAllEmployees("1");
    }

    public void createEmployee(Employee employee){
        employeeDao.createEmployee(employee);
    }*/
    @Autowired
    private EmployeeServiceCrud employeeServiceCrud;
    public Iterable<Employee> getAllEmployees() throws Exception{
        if(2==2){
            System.out.println("Here in exception");
            //throw new Exception("waste exception");
        }
        return employeeServiceCrud.findAll();

    }
    public List<Employee> searchByName(String name,HttpServletRequest request){
        return employeeServiceCrud.findByName(name);
    }
    public Employee searchById(String id){

        return employeeServiceCrud.findOne(id);
    }

    public void createEmployee(Employee employee){
        System.out.println(employee.getAddress());
        employeeServiceCrud.save(employee);
        System.out.println(employeeServiceCrud.findByAddress("Mumbai"));
    }
    public void deleteEmployee(String id){
        employeeServiceCrud.delete(id);
    }
    public void updateEmployee(Employee employee){
        System.out.println(employee.getAddress());
        employeeServiceCrud.save(employee);

    }
    /*
    public Employee getEmployee(String id){
        return employees.stream().filter(employee -> employee.getId().equals(id)).findFirst().get();
    }

    public Employee deleteEmployee(String id){
        for(int i=0;i<2;i++){
            if(employees.get(i).getId().equals(id)){
                return employees.get(i);
                //System.out.println(employees.get(i).getName());
                //employees.remove(i);
            }
        }
        return employees.get(0);
    }
    */
}
