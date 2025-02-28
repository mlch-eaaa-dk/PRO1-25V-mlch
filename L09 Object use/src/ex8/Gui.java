package ex8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Loops"); // may be changed
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(200, 200); // may be changed
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {
        int xLow = 16;
        int yLow = 160;
        int height = 80;
        for (int i = 0; i < 10; i++) {
            Line line = new Line(
                    xLow + i * 16, yLow - i * 12,
                    xLow + i * 16, yLow - i * 12 - height + i * 8);
            pane.getChildren().add(line);
        }
    }
}
