package ex4.storage;

import ex4.model.Company;

import java.util.ArrayList;

public abstract class Storage {
    private static final ArrayList<Company> companies = new ArrayList<>();

    public static ArrayList<Company> getCompanies() {
        return new ArrayList<>(companies);
    }

    public static void storeCompany(Company company) {
        companies.add(company);
    }

    public static void deleteCompany(Company company) {
        companies.remove(company);
    }
}
