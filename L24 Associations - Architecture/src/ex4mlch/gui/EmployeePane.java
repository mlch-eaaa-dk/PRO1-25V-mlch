package ex4mlch.gui;

import ex4mlch.controller.Controller;
import ex4mlch.model.Employee;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import java.util.Optional;

public class EmployeePane extends GridPane {
    private final TextField txfName = new TextField();
    private final TextField txfWage = new TextField();
    private final TextField txfCompany = new TextField();
    private final TextField txfSalary = new TextField();
    private final ListView<Employee> lvwEmployees = new ListView<>();

    public EmployeePane() {
        this.setPadding(new Insets(20));
        this.setHgap(20);
        this.setVgap(10);
        this.setGridLinesVisible(false);

        // column 0
        Label lblComp = new Label("Employees");
        this.add(lblComp, 0, 0);

        this.add(lvwEmployees, 0, 1, 1, 5);
        lvwEmployees.setPrefWidth(200);
        lvwEmployees.setPrefHeight(200);
        lvwEmployees.getItems().setAll(Controller.getEmployees());
        lvwEmployees.getSelectionModel().selectedItemProperty().addListener(
                (ov, o, n) -> this.selectedEmployeeChanged()
        );

        // column 1
        this.add(new Label("Name:"), 1, 1);
        this.add(new Label("Hourly wage:"), 1, 2);
        this.add(new Label("Company:"), 1, 3);
        this.add(new Label("Weekly salary:"), 1, 4);

        // column 2
        this.add(txfName, 2, 1);
        txfName.setEditable(false);
        this.add(txfWage, 2, 2);
        txfWage.setEditable(false);
        this.add(txfCompany, 2, 3);
        txfCompany.setEditable(false);
        this.add(txfSalary, 2, 4);
        txfSalary.setEditable(false);

        // column 0
        HBox hbxButtons = new HBox(40);
        this.add(hbxButtons, 0, 6, 3, 1);
        hbxButtons.setPadding(new Insets(10, 0, 0, 0));
        hbxButtons.setAlignment(Pos.BASELINE_CENTER);

        Button btnCreate = new Button("Create");
        hbxButtons.getChildren().add(btnCreate);
        btnCreate.setOnAction(event -> this.createAction());

        Button btnUpdate = new Button("Update");
        hbxButtons.getChildren().add(btnUpdate);
        btnUpdate.setOnAction(event -> this.updateAction());

        Button btnDelete = new Button("Delete");
        hbxButtons.getChildren().add(btnDelete);
        btnDelete.setOnAction(event -> this.deleteAction());

        if (!lvwEmployees.getItems().isEmpty()) {
            lvwEmployees.getSelectionModel().select(0);
        }
    }

    private void createAction() {
        EmployeeWindow dialog = new EmployeeWindow("Create Employee", null);
        dialog.showAndWait();

        // Wait for the modal dialog to close

        lvwEmployees.getItems().setAll(Controller.getEmployees());
        int index = lvwEmployees.getItems().size() - 1;
        lvwEmployees.getSelectionModel().select(index);
    }

    private void updateAction() {
        Employee employee = lvwEmployees.getSelectionModel().getSelectedItem();
        if (employee == null)
            return;

        EmployeeWindow dialog = new EmployeeWindow("Update Employee", employee);
        dialog.showAndWait();

        // Wait for the modal dialog to close

        int index = lvwEmployees.getSelectionModel().getSelectedIndex();
        lvwEmployees.getItems().setAll(Controller.getEmployees());
        lvwEmployees.getSelectionModel().select(index);
    }

    private void deleteAction() {
        Employee employee = lvwEmployees.getSelectionModel().getSelectedItem();
        if (employee == null)
            return;

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.initOwner(this.getScene().getWindow());
        alert.setTitle("Delete Employee");
        alert.setHeaderText("Are you sure?");
        Optional<ButtonType> result = alert.showAndWait();

        // wait for the modal dialog to close

        if (result.isPresent() && (result.get() == ButtonType.OK)) {
            Controller.deleteEmployee(employee);
            lvwEmployees.getItems().setAll(Controller.getEmployees());
            this.updateControls();
        }
    }

    private void selectedEmployeeChanged() {
        this.updateControls();
    }

    public void updateControls() {
        Employee employee = lvwEmployees.getSelectionModel().getSelectedItem();
        if (employee != null) {
            txfName.setText(employee.getName());
            txfWage.setText("" + employee.getWage());
            if (employee.getCompany() != null) {
                txfCompany.setText("" + employee.getCompany());
                txfSalary.setText("kr " + employee.calcSalary());
            } else {
                txfCompany.clear();
                txfSalary.clear();
            }
        } else {
            txfName.clear();
            txfWage.clear();
            txfCompany.clear();
            txfSalary.clear();
        }
    }
}
