package com.endurance.empoyee;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.hibernate.boot.jaxb.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

/**
 * Created by harish on 14/6/17.
 */
@RestController
@EnableAutoConfiguration
@CrossOrigin(origins = "*",maxAge = 3600)
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    /*@RequestMapping(value="/employees",method= RequestMethod.GET)
    public Iterable<Employee> getAllEmployees( HttpSession httpSession){
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("http://google.com")
                .queryParam("auth-userid", 1)
                .queryParam("api-key",2)
                .queryParam("domain-name", "lol");
        System.out.println(builder.toUriString());
        httpSession.setAttribute("user","karthik");
        httpSession.setMaxInactiveInterval(0);
        return employeeService.getAllEmployees();
    }*/

    @RequestMapping(value="/employees",method= RequestMethod.GET)
    public Iterable<Employee> getAllEmployees( HttpSession httpSession) throws Exception{
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("http://google.com")
                .queryParam("auth-userid", 1)
                .queryParam("api-key",2)
                .queryParam("domain-name", "lol");
        System.out.println(builder.toUriString());
        httpSession.setAttribute("user","karthik");
        httpSession.setMaxInactiveInterval(0);
        return employeeService.getAllEmployees();
        //return "yes";
    }

    @RequestMapping(value="/employees",method= RequestMethod.POST)
    public void createEmployee(@RequestBody Employee employee)
    {
        employeeService.createEmployee(employee);
    }

    @RequestMapping(value="/employees/{id}",method=RequestMethod.GET)
    public Employee searchById(@PathVariable String id, HttpSession httpSession){

        //System.out.println(httpSession.getAttribute("user"));
        return employeeService.searchById(id);
    }

    @RequestMapping(value="/employees/{id}",method=RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable String id){
        employeeService.deleteEmployee(id);
    }

    @RequestMapping(value = "/employees/{id}", method = RequestMethod.PUT)
    public @ResponseBody void updateStudent(@RequestBody Employee employee){
        employeeService.updateEmployee(employee);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody String login(@RequestBody String s, HttpServletResponse response) throws IOException {
        //System.out.println(s);
        return "Yes";
    }

    @RequestMapping(value = "/todo", method = RequestMethod.GET)
    public @ResponseBody String todo(@RequestBody String s, HttpServletResponse response) throws IOException {
        //System.out.println(s);
        return "Yes";
    }
    /*@RequestMapping(value="/employee",method=RequestMethod.GET)
    public List<Employee> deleteEmployee(@PathVariable String id){
        return employeeService.searchByName();
    }*/
}
