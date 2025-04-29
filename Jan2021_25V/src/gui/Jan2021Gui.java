package gui;

import controller.Controller;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Deltagelse;
import model.DeltagerStatus;
import model.Fag;
import model.Lektion;

public class Jan2021Gui extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Fraværssystem");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------
    private final ListView<Fag> lvwFag = new ListView<>();
    private final ListView<Lektion> lvwLektion = new ListView<>();
    private final ListView<Deltagelse> lvwDeltagelse = new ListView<>();
    private final RadioButton rbtTilstede = new RadioButton("Tilstede");
    private final RadioButton rbtFravær = new RadioButton("Fravær");
    private final RadioButton rbtSyg = new RadioButton("Syg");
    private final RadioButton rbtAfbud = new RadioButton("Afbud");
    private final ToggleGroup group = new ToggleGroup();

    private void initContent(GridPane pane) {
        // pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        // column 0
        pane.add(new Label("Fag"), 0, 0);

        pane.add(lvwFag, 0, 1, 1, 6);
        lvwFag.setPrefHeight(200);
        lvwFag.getItems().setAll(Controller.getAlleFag());
        lvwFag.getSelectionModel().selectedItemProperty().addListener(
                (ov, o, n) -> selectedFagChanged()
        );

        // column 1
        pane.add(new Label("Lektion"), 1, 0);

        pane.add(lvwLektion, 1, 1, 1, 6);
        lvwLektion.setPrefHeight(200);
        lvwLektion.getSelectionModel().selectedItemProperty().addListener(
                (ov, o, n) -> selectedLektionChanged()
        );

        // column 2
        pane.add(new Label("Deltagelse"), 2, 0);

        pane.add(lvwDeltagelse, 2, 1, 1, 6);
        lvwDeltagelse.setPrefHeight(200);

        // column 3
        pane.add(new Label("Fraværsårsager"), 3, 0);
        pane.add(rbtTilstede, 3, 1);
        rbtTilstede.setToggleGroup(group);
        pane.add(rbtFravær, 3, 2);
        rbtFravær.setToggleGroup(group);
        pane.add(rbtSyg, 3, 3);
        rbtSyg.setToggleGroup(group);
        pane.add(rbtAfbud, 3, 4);
        rbtAfbud.setToggleGroup(group);

        Button btnFravær = new Button("Fravær");
        pane.add(btnFravær, 3, 5);
        btnFravær.setOnAction(event -> fraværAction());

        rbtTilstede.setSelected(true);
    }

    private void fraværAction() {
        Deltagelse selectedDeltagelse = lvwDeltagelse.getSelectionModel().getSelectedItem();
        RadioButton selectedRbn = (RadioButton) group.getSelectedToggle();
        Lektion selectedLektion = lvwLektion.getSelectionModel().getSelectedItem();
        if (selectedLektion != null && selectedDeltagelse != null ) {
            DeltagerStatus status  = DeltagerStatus.valueOf(selectedRbn.getText().toUpperCase());
            Controller.updateDeltagelse(selectedDeltagelse, true, status);

            lvwDeltagelse.getItems().setAll(selectedLektion.getDeltagelser());
        }
    }

    private void selectedFagChanged() {
        Fag selectedFag = lvwFag.getSelectionModel().getSelectedItem();
        if (selectedFag != null) {
            lvwLektion.getItems().setAll(selectedFag.getLektioner());
        }
    }

    private void selectedLektionChanged() {
        Lektion selectedLektion = lvwLektion.getSelectionModel().getSelectedItem();
        if (selectedLektion != null) {
            lvwDeltagelse.getItems().setAll(selectedLektion.getDeltagelser());
        }
    }

}
