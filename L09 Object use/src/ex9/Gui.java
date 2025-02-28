package ex9;

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
        int y = 100;
        double x = 180;
        while ( x >= 5) {
            double y1 = y + x / 2.0;
            double y2 = y - x / 5.0;
            Line line = new Line(x, y1, x, y2);
            pane.getChildren().add(line);
            x = x * 3.0 / 4;
        }
    }
}
