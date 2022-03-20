package com.techelevator;

public class Department {
    @Override
    public String toString() {
        return name;
    }

    private int departmentId;
    private String name;

    public Department(int departmentId, String name) {
        this.departmentId = departmentId;
        this.name = name;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getName() {
        return name;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public void setName(String name) {
        this.name = name;
    }
}
