package com.endurance.empoyee;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by harish on 15/6/17.
 */
@Repository
public class EmployeeDao {
    @PersistenceContext
    private EntityManager entityManager;


    public void createEmployee(Employee employee) {
        entityManager.persist(employee);

    }
    public Employee getAllEmployees(String id) {
        return entityManager.find(Employee.class, id);
    }

}
