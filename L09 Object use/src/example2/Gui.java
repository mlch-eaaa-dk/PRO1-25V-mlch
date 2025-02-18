package example2;

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
        // draw an arrowhead at (50,30)
        int x = 50;
        int y = 30;
        Line line1 = new Line(x, y, x + 10, y - 4);
        Line line2 = new Line(x, y, x + 10, y + 4);
        pane.getChildren().addAll(line1,line2);

        // draw an arrowhead at (25,140)
        x = 25;
        y = 140;
        Line line3 = new Line(x, y, x + 10, y - 4);
        Line line4 = new Line(x, y, x + 10, y + 4);
        pane.getChildren().addAll(line3, line4);
    }
}
