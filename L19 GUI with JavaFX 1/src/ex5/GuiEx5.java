package ex5;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GuiEx5 extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Exercise 5");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfName = new TextField();
    private final TextArea txaNames = new TextArea();

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        // column 0
        pane.add(new Label("Name:"), 0, 0);
        pane.add(txfName, 0, 1);

        Button btnAdd = new Button("Add");
        pane.add(btnAdd, 0, 2);
        btnAdd.setDefaultButton(true);
        GridPane.setHalignment(btnAdd, HPos.CENTER);
        btnAdd.setOnAction(event -> this.addAction());

        pane.add(txaNames, 0, 3);
        txaNames.setPrefSize(200, 200);
        txaNames.setEditable(false);
    }

    private void addAction() {
        String name = txfName.getText().trim();
        txaNames.appendText(name + "\n");
        txfName.requestFocus();
        //txfName.selectAll();
        txfName.clear();
    }
}
