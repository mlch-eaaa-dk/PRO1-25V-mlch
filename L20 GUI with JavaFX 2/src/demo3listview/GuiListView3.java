package demo3listview;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class GuiListView3 extends Application {
    private final ArrayList<Person> persons = new ArrayList<>(List.of(
            new Person("Jens", "Jensen"),
            new Person("Hans", "Hansen"),
            new Person("Pia", "Peters")
    ));

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("ListView Demo3");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final ListView<Person> lvwPersons = new ListView<>();
    private final TextField txfName = new TextField();

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        // column 0
        pane.add(new Label("Name:"), 0, 0);

        Label lblNames = new Label("Names:");
        pane.add(lblNames, 0, 1);
        GridPane.setValignment(lblNames, VPos.TOP);

        // column 1
        pane.add(txfName, 1, 0);

        pane.add(lvwPersons, 1, 1);
        lvwPersons.setPrefWidth(200);
        lvwPersons.setPrefHeight(200);
        lvwPersons.getItems().setAll(persons);

        ChangeListener<Person> listener = (ov, o, n) -> this.selectionChanged();
        lvwPersons.getSelectionModel().selectedItemProperty().addListener(listener);

        // column 2
        Button btnAdd = new Button("Add");
        pane.add(btnAdd, 2, 0);
       // btnAdd.setDefaultButton(true);
        btnAdd.setOnAction(event -> this.addAction());

        Button btnDelete = new Button("Delete");
        pane.add(btnDelete, 2, 1);
        btnDelete.setOnAction(event -> this.deleteAction());
    }

    private void selectionChanged() {
        Person selected = lvwPersons.getSelectionModel().getSelectedItem();
        if (selected != null) {
            txfName.setText(selected.toString());
        } else {
            txfName.clear();
        }
    }

    private void addAction() {
        String name = txfName.getText().trim();
        if (!name.isEmpty()) {
            int index = name.lastIndexOf(" ");
            String firstName, lastName;
            if (index != -1) {
                firstName = name.substring(0, index);
                lastName = name.substring(index+1);
            } else {
                firstName = name;
                lastName = "";
            }
            Person p = new Person(firstName, lastName);
            persons.add(p);
            lvwPersons.getItems().setAll(persons);
        }
    }

    private void deleteAction() {
        int index = lvwPersons.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            persons.remove(index);
            txfName.clear();
            lvwPersons.getItems().setAll(persons);
        }
    }
}
