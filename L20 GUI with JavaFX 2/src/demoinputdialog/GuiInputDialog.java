package demoinputdialog;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Optional;

public class GuiInputDialog extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Gui Demo InputDialog");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextArea txaDescription = new TextArea();

    private void initContent(GridPane pane) {
        // pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(20));
        pane.setHgap(20);
        pane.setVgap(10);

        // column 0
        Label lblName = new Label("TextArea:");
        pane.add(lblName, 0, 0);

        pane.add(txaDescription, 0, 1);
        txaDescription.setPrefRowCount(7);
        txaDescription.setPrefWidth(270);
        txaDescription.setEditable(false);

        // column 1
        Button btnFill = new Button("Add text line");
        pane.add(btnFill, 1, 1);
        btnFill.setOnAction(event -> this.fillAction());
    }

    private void fillAction() {
        Dialog<String> dialog = new TextInputDialog();
        dialog.setTitle("Input text");
        dialog.setHeaderText("Enter some text:");
        Optional<String> result = dialog.showAndWait();

        // wait for the modal dialog to close

        if (result.isPresent()) {
            String input = result.get().trim();
            if (!input.isEmpty()) {
                txaDescription.setText(txaDescription.getText() + input + "\n");
            }
        }
    }
}
