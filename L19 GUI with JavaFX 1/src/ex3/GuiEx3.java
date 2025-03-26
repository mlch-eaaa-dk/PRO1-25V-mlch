package ex3;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GuiEx3 extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Exercise 3");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfInvestment = new TextField();
    private final TextField txfYears = new TextField();
    private final TextField txfInterest = new TextField();
    private final TextField txfFutureValue = new TextField();

    private void initContent(GridPane pane) {
        //Locale.setDefault(Locale.GERMANY);
        //pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        // column 0
        pane.add(new Label("Investment:"), 0, 0);
        pane.add(new Label("Years:"), 0, 1);
        pane.add(new Label("Yearly Interest (%):"), 0, 2);
        pane.add(new Label("Future value:"), 0, 4);

        // column 1
        pane.add(txfInvestment, 1, 0);
        pane.add(txfYears, 1, 1);
        pane.add(txfInterest, 1, 2);

        Button btnCalculate = new Button("Calculate");
        pane.add(btnCalculate, 1, 3);
        GridPane.setHalignment(btnCalculate, HPos.CENTER);
        btnCalculate.setOnAction(event -> this.calculateAction());

        pane.add(txfFutureValue, 1, 4);
        txfFutureValue.setEditable(false);
    }

    private void calculateAction() {
        String strInvestment = txfInvestment.getText().trim();
        String strYears = txfYears.getText().trim();
        String strInterest = txfInterest.getText().trim();

        double investment = Double.parseDouble(strInvestment);
        double years = Double.parseDouble(strYears);
        double yearlyInterest = Double.parseDouble(strInterest);

        double futureValue = investment * (Math.pow(1 + yearlyInterest / 100, years));
        String strFutureValue = String.format("%.2f", futureValue);
        txfFutureValue.setText(strFutureValue);
    }
}
