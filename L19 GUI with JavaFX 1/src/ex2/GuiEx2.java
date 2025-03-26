package ex2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GuiEx2 extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Exercise 2");
        GridPane pane = new GridPane();
        this.initContent(pane);
        stage.setResizable(false);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfNumber = new TextField();

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        // column 0
        Label lblFirstName = new Label("Number:");
        pane.add(lblFirstName, 0, 0, 1, 2);

        // column 1
        pane.add(txfNumber, 1, 0, 1, 2);
        txfNumber.setText("0");
//        txfNumber.setEditable(false);
//        txfNumber.setFocusTraversable(false);
//        txfNumber.setMouseTransparent(true);
        txfNumber.setPrefWidth(50);
        txfNumber.setAlignment(Pos.CENTER);

        // column 2
        Button btnIncrement = new Button("Increment");
        pane.add(btnIncrement, 2, 0);
        btnIncrement.setOnAction(event -> this.incrementAction());

        Button btnDecrement = new Button("Dec");
        pane.add(btnDecrement, 2, 1);
        btnDecrement.setOnAction(event -> this.decrementAction());
    }

    private void incrementAction() {
        String s = txfNumber.getText().trim();
        int number = Integer.parseInt(s) + 1;
        txfNumber.setText("" + number);
    }

    private void decrementAction() {
        String s = txfNumber.getText().trim();
        int number = Integer.parseInt(s) - 1;
        txfNumber.setText("" + number);
    }
}
