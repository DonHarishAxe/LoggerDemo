package com.endurance.empoyee;

/**
 * Created by harish on 15/6/17.
 */
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface EmployeeServiceCrud extends CrudRepository<Employee,String> {
    public List<Employee> findByName(String name);
    public List<Employee> findByAddress(String address);
}
