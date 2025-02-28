package ex12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
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
        int h = 81;
        int x = 20;
        int y = 100;
        // draw outer triangle
        drawTriangle(pane, x, y, h);
        // draw inner triangles in the outer triangle
        drawInnerTriangles(pane, x, y, h);
        // draw inner triangles in the 3 inner triangles in the outer triangle
        drawInnerTriangles(pane, x, y, h / 3);
        drawInnerTriangles(pane, x + (2 * h) * 2 / 3, y, h / 3);
        drawInnerTriangles(pane, x + (2 * h) * 1 / 3, y - h * 2 / 3, h / 3);
    }

    private void drawTriangle(Pane pane, int x, int y, int h) {
        Polygon triangle = new Polygon(x, y, x + (2 * h), y, x + h, y - h);
        triangle.setStroke(Color.BLACK);
        triangle.setFill(null);
        pane.getChildren().add(triangle);
    }

    private void drawInnerTriangles(Pane pane, int x, int y, int h) {
        int xLeft = x;
        int yLeft = y;
        drawTriangle(pane, xLeft, yLeft, h / 3);
        int xRight = xLeft + (2 * h) * 2 / 3;
        int yRight = yLeft;
        drawTriangle(pane, xRight, yRight, h / 3);
        int xTop = xLeft + (2 * h) * 1 / 3;
        int yTop = y - h * 2 / 3;
        drawTriangle(pane, xTop, yTop, h / 3);
    }
}
