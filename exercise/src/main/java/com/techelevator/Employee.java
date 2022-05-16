package com.techelevator;

import java.text.NumberFormat;
import java.time.LocalDate;

public class Employee {
    @Override
    public String toString() {
        return getFullName() + " (" + currency.format(salary) + ") " + department;
    }

    private long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private double salary;
    private Department department;
    private LocalDate hireDate = LocalDate.now();

    public NumberFormat currency = NumberFormat.getCurrencyInstance();

    private static final double STARTING_SALARY = 60000.00;

    public Employee(long employeeId, String firstName, String lastName,
                    String email, Department department, String hireDate) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.hireDate = LocalDate.now();
        this.salary = STARTING_SALARY;
    }

    public Employee(){
    }

    public String getFullName(){
        return lastName + ", " + firstName;
    }

    public double raiseSalary(double percent){
        salary = salary + (salary * percent);
        return this.salary;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {

        this.hireDate = LocalDate.parse(hireDate);
    }
}
