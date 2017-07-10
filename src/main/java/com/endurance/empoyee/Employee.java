package com.endurance.empoyee;

import javax.persistence.*;

/**
 * Created by harish on 14/6/17.
 */
@Entity
@Table(name = "Employee_table")
public class Employee {
    @Id
    private String id;
    @Column(name="name")
    private String name;
    @Column(name="address")
    private String address;

    public Employee(){

    }
    public Employee(String id, String name, String address) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
