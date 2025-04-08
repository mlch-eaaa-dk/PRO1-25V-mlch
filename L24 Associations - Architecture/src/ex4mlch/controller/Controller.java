package ex4mlch.controller;

import ex4mlch.model.Company;
import ex4mlch.model.Employee;
import ex4mlch.storage.Storage;

import java.util.ArrayList;

public abstract class Controller {
    /**
     * Create a new Company.
     * Pre: name not empty, hours >= 0.
     */
    public static Company createCompany(String name, int hours) {
        Company company = new Company(name, hours);
        Storage.storeCompany(company);
        return company;
    }

    /**
     * Delete the company.
     * Pre: The company has no employees.
     */
    public static void deleteCompany(Company company) {
        Storage.deleteCompany(company);
    }

    /**
     * Update the company.
     * Pre: name not empty, hours >= 0.
     */
    public static void updateCompany(Company company, String name, int hours) {
        company.setName(name);
        company.setHours(hours);
    }

    public static ArrayList<Company> getCompanies() {
        return Storage.getCompanies();
    }

    /**
     * Create a new employee.
     * Pre: name not empty, wage >= 0.
     */
    public static Employee createEmployee(String name, int wage) {
        Employee employee = new Employee(name, wage);
        Storage.storeEmployee(employee);
        return employee;
    }

    public static ArrayList<Employee> getEmployees() {
        return Storage.getEmployees();
    }

    /**
     * Add the employee to the company.
     * If the employee is connected to another company, this connection is removed.
     */
    public static void addEmployeeToCompany(Company company, Employee employee) {
        Company oldCompany = employee.getCompany();
        if (oldCompany != null) {
            oldCompany.removeEmployee(employee);
        }
        employee.setCompany(company);
        company.addEmployee(employee);
    }

    public static void updateEmployee(Employee employee, String name, int wage) {
        employee.setName(name);
        employee.setWage(wage);
    }

    public static void deleteEmployee(Employee employee) {
        Company company = employee.getCompany();
        if (company != null) {
            employee.getCompany().removeEmployee(employee);
        }
        Storage.deleteEmployee(employee);
    }
}
