package ex11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
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
        int x = 50; // center: (x,y)
        int y = 100;
        int r = 40; // radius: r
        while (x <= 150) {
            Circle circle = new Circle(x, y, r);
            circle.setStroke(Color.BLACK);
            circle.setFill(null);
            pane.getChildren().add(circle);
            drawCross(pane, x, y, 10);
            x += 25;
        }
    }

    private void drawCross(Pane pane, int x, int y, int w) {
        Line line1 = new Line(x - w / 2.0, y, x + w / 2.0, y);
        Line line2 = new Line(x, y - w / 2.0, x, y + w / 2.0);
        pane.getChildren().addAll(line1, line2);
    }
}
