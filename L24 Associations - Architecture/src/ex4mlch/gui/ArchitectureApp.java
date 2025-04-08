package ex4mlch.gui;

import ex4mlch.controller.Controller;
import ex4mlch.model.Company;
import ex4mlch.model.Employee;
import javafx.application.Application;

public class ArchitectureApp {

    public static void main(String[] args) {
        initStorage();
        Application.launch(ArchitectureGui.class);
    }

    public static void initStorage() {
        Company ibm = Controller.createCompany("IBM", 37);
        Company amd = Controller.createCompany("AMD", 40);
        Company sled = Controller.createCompany("SLED", 45);
        Controller.createCompany("Vector", 32);

        Employee bob = Controller.createEmployee("Bob Dole", 210);
        Employee alice = Controller.createEmployee("Alice Schmidt", 250);
        Employee george = Controller.createEmployee("George Down", 150);
        Employee rita = Controller.createEmployee("Rita Uphill", 300);
        Controller.createEmployee("John Doe", 100);

        Controller.addEmployeeToCompany(ibm, bob);
        Controller.addEmployeeToCompany(amd, alice);
        Controller.addEmployeeToCompany(sled, george);
        Controller.addEmployeeToCompany(ibm, rita);
    }
}
