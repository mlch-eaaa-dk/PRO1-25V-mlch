package ex1;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GuiEx1 extends Application {
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

    private final TextField txfFirstName = new TextField();
    private final TextField txfLastName = new TextField();
    private final TextField txfFullName = new TextField();

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        // column 0
        pane.add(new Label("First name:"), 0, 0);
        pane.add(txfFirstName, 0, 1, 2, 1);

        Button btnCombine = new Button("Combine");
        pane.add(btnCombine, 0, 2, 3, 1);
        GridPane.setHalignment(btnCombine, HPos.CENTER);
        btnCombine.setDefaultButton(true);
        btnCombine.setOnAction(event -> this.combineAction());

        pane.add(new Label("Full name:"), 0, 3);

        // column 1
        pane.add(txfFullName, 1, 3, 2, 1);
        txfFullName.setEditable(false);
        txfFullName.setMouseTransparent(true);
        txfFullName.setFocusTraversable(false);

        // column 2
        pane.add(new Label("Last name:"), 2, 0);
        pane.add(txfLastName, 2, 1);
    }

    private void combineAction() {
        String firstName = txfFirstName.getText().trim();
        String lastName = txfLastName.getText().trim();
        String fullName = firstName + " " + lastName;
        txfFullName.setText(fullName);
    }
}
