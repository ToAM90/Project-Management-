package com.techelevator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Project {

    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate dueDate;
    private List<Employee> teamMembers = new ArrayList<>();

    public Project(String name, String description, LocalDate startDate, LocalDate dueDate) {
        this.name = name;
        this.description = description;
        this.startDate = LocalDate.now();
        this.dueDate = dueDate;
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate, int days) {
        this.startDate = startDate.plusDays(days);
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate, int days) {
        this.dueDate = this.startDate.plusDays(days);
    }

    public List<Employee> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(List<Employee> teamMembers) {
        this.teamMembers = teamMembers;
    }
}
