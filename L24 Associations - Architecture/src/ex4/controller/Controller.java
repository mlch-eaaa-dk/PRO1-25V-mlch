package ex4.controller;

import ex4.model.Company;
import ex4.storage.Storage;

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
}
