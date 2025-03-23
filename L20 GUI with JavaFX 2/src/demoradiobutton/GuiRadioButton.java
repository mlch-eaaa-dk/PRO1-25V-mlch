package demoradiobutton;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GuiRadioButton extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Radiobutton Demo");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final Label lblTxt = new Label("RadioButton example");
    private final ToggleGroup group = new ToggleGroup();

    private void initContent(GridPane pane) {
//        pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        // column 0
        HBox box = new HBox();
        pane.add(box, 0, 0);

        String[] colorStrings = { "Red", "Blue", "Green", "Magenta" };
        Color[] colors = { Color.RED, Color.BLUE, Color.GREEN, Color.MAGENTA };

        // add 4 radio buttons to the box
        for (int i = 0; i < colors.length; i++) {
            RadioButton rbn = new RadioButton();
            box.getChildren().add(rbn);
            rbn.setText(colorStrings[i]);
            rbn.setPrefWidth(80);
            // make the radio button remember its color
            rbn.setUserData(colors[i]);
            // ensure that only one radio button is in selected state
            rbn.setToggleGroup(group);
            // set the method to execute when a radio button is selected
            rbn.setOnAction(event -> this.setLabelColor());
        }

        pane.add(lblTxt, 0, 1);
        GridPane.setHalignment(lblTxt, HPos.CENTER);
    }

    private void setLabelColor() {
        RadioButton rb = (RadioButton) group.getSelectedToggle();
        Color color = (Color) rb.getUserData();
        lblTxt.setTextFill(color);
    }
}
