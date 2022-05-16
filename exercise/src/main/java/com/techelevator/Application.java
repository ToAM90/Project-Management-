package com.techelevator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    List<Department> departments = new ArrayList<>();
    List<Employee> employees = new ArrayList<>();
    Map<String, Project> projects = new HashMap<>();
    List<Employee> deptEngineering = new ArrayList<>();
    List<Employee> deptMarketing = new ArrayList<>();
    List<Employee> deptSales = new ArrayList<>();

    private LocalDate today = LocalDate.now();

    /**
     * The main entry point in the application
     * @param args
     */

    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }



    private Department getDepartmentByName(String name){
        Department theDepartment;
        for (Department names : departments){
            if (names.getName().equals(name)){
                return names;
            }
        } return null;
    }


    private void run() {


        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();


        // create the Marketing Landing Page Project
        createLandingPageProject();
        
        // print each project name and the total number of employees on the project
        printProjectsReport();

    }

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {
        Department marketing = new Department(1, "Marketing");
        Department sales = new Department(2, "Sales");
        Department engineering = new Department(3, "Engineering");

        departments.add(marketing);
        departments.add(sales);
        departments.add(engineering);
    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        for (Department name : departments){
            System.out.println(name);
        }
    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {
        Employee employee1 = new Employee();
        employee1.setEmployeeId(1);
        employee1.setFirstName("Dean");
        employee1.setLastName("Johnson");
        employee1.setEmail("djohnson@teams.com");
        employee1.setDepartment(departments.get(2));
        employee1.setHireDate("2020-08-21");
        employee1.setSalary(60000.00);
        Employee employee2 = new Employee(2, "Angie", "Smith", "asmith@teams.com", getDepartmentByName("Engineering"), "8/21/2020");
        Employee employee3 = new Employee(3, "Margaret", "Thompson", "mthompson@teams.com", departments.get(0), "8/21/2020");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        // give Angie a 10% raise, she is doing a great job!

        employee2.raiseSalary(0.10);

    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
        for (Employee name : employees){
            System.out.println(name);
        }
    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {
        Project one = new Project("TEams", "Project Management Software");
        one.setStartDate(today, 0);
        one.setDueDate(today, 30);
        for (Employee employee : employees){
            if(employee.getDepartment().getName().equals("Engineering")){;
                deptEngineering.add(employee); }
        }

        one.setTeamMembers(deptEngineering);
        projects.put(one.getName(), one);

    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {
        Project two = new Project("Marketing Landing Page","Lead Capture Landing Page for Marketing", today.plusDays(31) , today.plusDays(38));
        for (Employee employee : employees){
            if(employee.getDepartment().getName().equals("Marketing")){;
                deptMarketing.add(employee); }}
        two.setTeamMembers(deptMarketing);
        projects.put(two.getName(), two);

    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");
        System.out.println("TEams: " + deptEngineering.size());
        System.out.println("Marketing Landing Page: " + deptMarketing.size());
    }

}
