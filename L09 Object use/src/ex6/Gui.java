package ex6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
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
        int y = 175;
        int x1 = 5;
        int x2 = 180;
        Line line = new Line(x1, y, x2, y);
        Line arrowUp = new Line(x2 - 5, y - 3, x2, y);
        Line arrowDn = new Line(x2 - 5, y + 3, x2, y);
        pane.getChildren().addAll(line, arrowUp, arrowDn);
        for (int i = 0; i < 11; i++) {
            int xStroke = 15 + i * 15;
            if (i % 5 != 0) {
                Line stroke = new Line(xStroke, y - 3, xStroke, y + 3);
                pane.getChildren().addAll(stroke);
            } else {
                Line stroke = new Line(xStroke, y - 6, xStroke, y + 6);
                Text text = new Text(xStroke, y + 20, i+"");
                pane.getChildren().addAll(stroke, text);
            }
        }
    }
}
