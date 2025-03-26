package ex4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GuiEx4 extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Exercise 4");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfFromC = new TextField();
    private final TextField txfToF = new TextField();
    private final TextField txfFromF = new TextField();
    private final TextField txfToC = new TextField();

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(20));
        pane.setHgap(50);
        pane.setVgap(10);

        // column 0
        pane.add(new Label("From Celsius:"), 0, 0);

        pane.add(txfFromC, 0, 1);
        txfFromC.setText("0");
        txfFromC.setPrefWidth(125);

        Button btnToF = new Button("To Fahrenheit");
        pane.add(btnToF, 0, 2);
        btnToF.setPrefWidth(125);
        btnToF.setOnAction(event -> this.toFahrenheitAction());

        pane.add(new Label("Fahrenheit:"), 0, 3);

        pane.add(txfToF, 0, 4);
        txfToF.setPrefWidth(125);
        txfToF.setEditable(false);

        // column 1
        pane.add(new Label("From Fahrenheit:"), 1, 0);

        pane.add(txfFromF, 1, 1);
        txfFromF.setText("0");
        txfFromF.setPrefWidth(125);

        Button btnToC = new Button("To Celsius");
        pane.add(btnToC, 1, 2);
        btnToC.setPrefWidth(125);
        btnToC.setOnAction(event -> this.toCelsiusAction());

        pane.add(new Label("Celsius:"), 1, 3);

        pane.add(txfToC, 1, 4);
        txfToC.setPrefWidth(50);
        txfToC.setEditable(false);
    }

    // -------------------------------------------------------------------------

    private void toFahrenheitAction() {
        String strCelsius = txfFromC.getText().trim();
        double celsius = Double.parseDouble(strCelsius);
        double fahrenheit = 9.0 / 5 * celsius + 32;
        txfToF.setText(String.format("%.1f °F", fahrenheit));
    }

    private void toCelsiusAction() {
        String strFahrenheit = txfFromF.getText().trim();
        double fahrenheit = Double.parseDouble(strFahrenheit);
        double celsius = (fahrenheit - 32) * 5 / 9;
        txfToC.setText(String.format("%.1f °C", celsius));
    }
}

