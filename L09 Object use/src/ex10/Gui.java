package ex10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
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
        drawRing(pane, 50, 50);
        drawRing(pane, 150, 50);
        drawRing(pane, 50, 150);
        drawRing(pane, 150, 150);
    }

    private void drawRing(Pane pane, int x, int y) {
        int r1 = 25;
        int r2 = 20;
        int r3 = 6;
        Circle c1 = new Circle(x, y, r1);
        c1.setStroke(Color.BLACK);
        c1.setFill(Color.GOLD);
        Circle c2 = new Circle(x, y, r2);
        c2.setStroke(Color.BLACK);
        c2.setFill(Color.WHITE);
        Ellipse ellipse = new Ellipse(x, y - r1, 2 * r3, r3);
        //ellipse.setStroke(null);
        ellipse.setFill(Color.RED);
        pane.getChildren().addAll(c1, c2, ellipse);
    }
}
