package com.payroll;

import java.util.Objects;

import io.micrometer.observation.annotation.Observed;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity         // JPA annotation to make this object ready for storage in a JPA-based data store
public class Employee {
    
    private @Id @GeneratedValue Long id;    // more JPA annotations to indicate it’s the primary key and automatically populated by the JPA provider.
    private String name;
    private String role;

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // getters
    public Long getId() {
        return this.id;
    }
    public String getname() {
        return this.name;
    }
    public String getRole() {
        return this.role;
    }

    // setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }

        if(!(o instanceof Employee)) {
            return false;
        }

        Employee employee = (Employee) o;
        return Objects.equals(this.id, employee.id) && Objects.equals(this.name, employee.name) && Objects.equals(this.role, employee.role)
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.role);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", role='" + this.role + '\'' + '}';
    }
}
