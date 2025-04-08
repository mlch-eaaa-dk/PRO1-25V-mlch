package ex4mlch.gui;

import ex4mlch.controller.Controller;
import ex4mlch.model.Company;
import ex4mlch.model.Employee;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class EmployeeWindow extends Stage {
    private final Employee employee; // nullable

    /** Note: Nullable param employee. */
    public EmployeeWindow(String title, Employee employee) {
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setResizable(false);

        this.employee = employee;

        this.setTitle(title);
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }

    // -------------------------------------------------------------------------

    private final TextField txfName = new TextField();
    private final TextField txfWage = new TextField();
    private final CheckBox chbCompany = new CheckBox("Company");
    private final ComboBox<Company> cbbCompany = new ComboBox<>();
    private final Label lblError = new Label();

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setGridLinesVisible(false);

        // column 0
        pane.add(new Label("Name"), 0, 0);
        pane.add(txfName, 0, 1);
        pane.add(new Label("Hourly wage"), 0, 2);
        pane.add(txfWage, 0, 3);

        pane.add(chbCompany, 0, 4);
        chbCompany.selectedProperty().addListener(
                (ov, o, newValue) -> this.selectedCompanyChanged(newValue)
        );

        pane.add(cbbCompany, 0, 5);
        cbbCompany.getItems().setAll(Controller.getCompanies());
        cbbCompany.setDisable(true);

        Button btnCancel = new Button("Cancel");
        pane.add(btnCancel, 0, 6);
        GridPane.setHalignment(btnCancel, HPos.LEFT);
        btnCancel.setOnAction(event -> this.cancelAction());

        Button btnOK = new Button("OK");
        pane.add(btnOK, 0, 6);
        GridPane.setHalignment(btnOK, HPos.RIGHT);
        btnOK.setOnAction(event -> this.okAction());

        pane.add(lblError, 0, 7);
        lblError.setStyle("-fx-text-fill: red");

        this.initControls();
    }

    private void selectedCompanyChanged(boolean checked) {
        cbbCompany.setDisable(!checked);
    }

    // -------------------------------------------------------------------------

    private void initControls() {
        if (employee != null) {
            txfName.setText(employee.getName());
            txfWage.setText("" + employee.getWage());
            Company company = employee.getCompany();
            if (company != null) {
                chbCompany.setSelected(true);
                cbbCompany.getSelectionModel().select(company);
            } else {
                cbbCompany.getSelectionModel().select(0);
            }
        } else {
            txfName.clear();
            txfWage.clear();
            cbbCompany.getSelectionModel().select(0);
        }
    }

    // -------------------------------------------------------------------------

    private void cancelAction() {
        this.hide();
    }

    private void okAction() {
        String name = txfName.getText().trim();
        if (name.isEmpty()) {
            lblError.setText("Name is empty");
            return;
        }

        int wage = -1;
        try {
            wage = Integer.parseInt(txfWage.getText().trim());
        } catch (NumberFormatException ex) {
            // do nothing
        }
        if (wage < 0) {
            lblError.setText("Hourly wage is not a positive number");
            return;
        }

        if (employee != null) {
            // update existing employee
            Controller.updateEmployee(employee, name, wage);
            if (chbCompany.isSelected()) {
                Company company = cbbCompany.getSelectionModel().getSelectedItem();
                Controller.addEmployeeToCompany(company, employee);
            }
        } else {
            // create new employee
            Employee newEmployee = Controller.createEmployee(name, wage);
            if (chbCompany.isSelected()) {
                Company company = cbbCompany.getSelectionModel().getSelectedItem();
                Controller.addEmployeeToCompany(company, newEmployee);
            }
        }

        this.hide();
    }
}
