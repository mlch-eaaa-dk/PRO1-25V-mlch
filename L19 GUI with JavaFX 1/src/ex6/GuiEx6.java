package ex6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class GuiEx6 extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Exercise 1");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private Student student = null;

    private final TextArea txaInfo = new TextArea();
    private final TextField txfName = new TextField();
    private final TextField txfAge = new TextField();
    private final CheckBox cbxActive = new CheckBox();
    private final Button btnCreate = new Button("Create");
    private final Button btnReset = new Button("Reset");
    private final Button btnInc = new Button("Inc");
    private final Button btnUpdate = new Button("Update");
    private final Button btnDelete = new Button("Delete");

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        // column 0
        pane.add(new Label("Student info:"), 0, 0, 2, 1);

        pane.add(txaInfo, 0, 1, 4, 1);
        txaInfo.setPrefWidth(300);
        txaInfo.setEditable(false);

        pane.add(new Label("Name:"), 0, 2);
        pane.add(new Label("Age:"), 0, 3);
        pane.add(new Label("Active: "), 0, 4);

        HBox buttonBox = new HBox(25);
        pane.add(buttonBox, 0, 5, 4, 1);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setPadding(new Insets(10, 0, 0, 0));

        buttonBox.getChildren().add(btnCreate);
        btnCreate.setOnAction(event -> this.createAction());
        buttonBox.getChildren().add(btnUpdate);
        btnUpdate.setDisable(true);
        btnUpdate.setOnAction(event -> this.updateAction());
        buttonBox.getChildren().add(btnDelete);
        btnDelete.setDisable(true);
        btnDelete.setOnAction(event -> this.deleteAction());

        // column 1
        pane.add(txfName, 1, 2, 2, 1);

        pane.add(txfAge, 1, 3);
        txfAge.setPrefWidth(100);

        pane.add(cbxActive, 1, 4);

        // column 2
        pane.add(btnInc, 2, 3);
        btnInc.setDisable(true);
        btnInc.setOnAction(event -> this.incAction());

        // column 3
        pane.add(btnReset, 3, 3);
        btnReset.setDisable(true);
        btnReset.setOnAction(event -> this.resetAction());
    }

    // -------------------------------------------------------------------------

    private void createAction() {
        String name = txfName.getText().trim();
        int age = Integer.parseInt(txfAge.getText().trim());
        boolean active = cbxActive.isSelected();
        student = new Student(name, age, active);
        this.updateTextArea();

        btnReset.setDisable(false);
        btnInc.setDisable(false);
        btnCreate.setDisable(true);
        btnUpdate.setDisable(false);
        btnDelete.setDisable(false);
    }

    private void updateAction() {
        String name = txfName.getText().trim();
        int age = Integer.parseInt(txfAge.getText().trim());
        boolean active = cbxActive.isSelected();
        this.updateStudent(name, age, active);
        this.updateTextArea();
    }

    public void deleteAction() {
        this.clearInput();
        txaInfo.clear();
        student = null;
        btnDelete.setDisable(true);
        btnCreate.setDisable(false);
        btnUpdate.setDisable(true);
        btnInc.setDisable(true);
        btnReset.setDisable(true);
    }

    private void incAction() {
        int age = Integer.parseInt(txfAge.getText().trim());
        txfAge.setText("" + (age + 1));
    }

    private void resetAction() {
        txfName.setText(student.getName());
        txfAge.setText("" + student.getAge());
        cbxActive.setSelected(student.isActive());

    }

    private void updateStudent(String name, int age, boolean active) {
        student.setName(name);
        student.setAge(age);
        student.setActive(active);
    }

    private void clearInput() {
        txfName.clear();
        txfAge.clear();
        cbxActive.setSelected(false);
    }

    private void updateTextArea() {
        txaInfo.clear();
        txaInfo.appendText("Name: " + student.getName() + "\n");
        txaInfo.appendText("Age: " + student.getAge() + "\n");
        String strActive = "No";
        if (student.isActive())
            strActive = "Yes";
        txaInfo.appendText("Active: " + strActive);
    }
}
