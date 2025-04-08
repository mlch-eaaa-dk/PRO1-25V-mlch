package ex4mlch.storage;

import ex4mlch.model.Company;
import ex4mlch.model.Employee;

import java.util.ArrayList;

public abstract class Storage {
    private static final ArrayList<Company> companies = new ArrayList<>();
    private static final ArrayList<Employee> employees = new ArrayList<>();

    public static ArrayList<Company> getCompanies() {
        return companies;
    }

    public static void storeCompany(Company company) {
        companies.add(company);
    }

    public static void deleteCompany(Company company) {
        companies.remove(company);
    }

    public static ArrayList<Employee> getEmployees() {
        return employees;
    }

    public static void storeEmployee(Employee employee) {
        employees.add(employee);
    }

    public static void deleteEmployee(Employee employee) {
        employees.remove(employee);
    }
}
