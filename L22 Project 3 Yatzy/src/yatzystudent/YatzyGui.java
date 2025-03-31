package yatzystudent;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class YatzyGui extends Application {
    private YatzyDice dice = new YatzyDice();

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Yatzy");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        // stage.setResizable(false);
        stage.show();
    }

    // -------------------------------------------------------------------------

    // txfValues shows the face values of the 5 dice.
    private final TextField[] txfValues = new TextField[5];
    // cbxHolds shows the hold status of the 5 dice.
    private final CheckBox[] cbxHolds = new CheckBox[5];
    // txfResults shows the obtained results.
    // For results not set yet, the possible result of 
    // the actual face values of the 5 dice are shown.
    private final ArrayList<TextField> txfResults = new ArrayList<>(15);
    // Shows points in sums, bonus and total.
    private final TextField txfSumSame = new TextField();
    private final TextField txfBonus = new TextField();
    private final TextField txfSumOther = new TextField();
    private final TextField txfTotal = new TextField();

    private final Label lblThrowCount = new Label();
    private final Button btnThrow = new Button(" Throw ");

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);

        // ---------------------------------------------------------------------
        // dicePane

        GridPane dicePane = new GridPane();
        pane.add(dicePane, 0, 0);
        dicePane.setGridLinesVisible(false);
        dicePane.setPadding(new Insets(10));
        dicePane.setHgap(10);
        dicePane.setVgap(10);
        dicePane.setStyle("-fx-border-color: black");

        // add txfValues, chbHolds
        // TODO
        // add lblThrowCount and btnThrow
        // TODO

        // ---------------------------------------------------------------------
        // scorePane

        GridPane scorePane = new GridPane();
        pane.add(scorePane, 0, 1);
        scorePane.setGridLinesVisible(false);
        scorePane.setPadding(new Insets(10));
        scorePane.setVgap(5);
        scorePane.setHgap(10);
        scorePane.setStyle("-fx-border-color: black");
        int width = 50; // width of the text fields

        // add labels for results
        // add txfResults
        // TODO

        // add labels and text fields for sums, bonus and total.
        // TODO

    }

    // Create an action method for btnThrow's action.
    // TODO

    // Create a method for mouse click on one of the text fields in txfResults.
    // TODO

    // Reset all Hold checkboxes to false and enabled.
    private void resetCbxHolds() {
        // TODO
    }

    // Return the status of Hold checkboxes.
    private boolean[] readCbxHolds() {
        // TODO
        return null;
    }

    // Fill the text fields that show the dice values.
    private void fillTxfValues() {
        // TODO
    }

    // Fill the text fields that show the results.
    private void fillTxfResults() {
        // TODO
    }

    // Enable result text fields not used yet.
    private void enableTxfResults() {
        // TODO
    }

    // Clear result text fields not used yet.
    private void clearUnusedTxfResults() {
        // TODO
    }

    // Make result text fields not used yet mouse transparent.
    private void disableUnusedTxfResults() {
        // TODO
    }

    // Disable the Hold check boxes.
    private void disableCbxHolds() {
        // TODO
    }

    // Update the sum, bonus and total text fields.
    private void updateSums() {
        // TODO
    }
}
