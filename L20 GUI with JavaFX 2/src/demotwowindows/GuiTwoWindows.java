package demotwowindows;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GuiTwoWindows extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Gui Demo input window");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

        movieWindow = new MovieInputDialog("Create a movie", stage);
    }

    // -------------------------------------------------------------------------

    private final TextField txfResult = new TextField();
    private MovieInputDialog movieWindow;

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        // column 0
        pane.add(new Label("Movie:"), 0, 0);

        // column 1
        pane.add(txfResult, 1, 0, 2, 1);
        txfResult.setEditable(false);
        txfResult.setPrefWidth(300);

        Button btnCreateMovie = new Button("Create movie");
        pane.add(btnCreateMovie, 1, 1);
        GridPane.setMargin(btnCreateMovie, new Insets(10, 10, 0, 10));
        btnCreateMovie.setOnAction(event -> this.createMovieAction());
    }

    private void createMovieAction() {
        movieWindow.showAndWait();

        // wait for modal window to close

        if (movieWindow.getActualMovie() != null) {
            Movie movie = movieWindow.getActualMovie();
            txfResult.setText(movie.toString());
        }
    }
}
