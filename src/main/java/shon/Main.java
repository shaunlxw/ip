package shon;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * A GUI for Duke using FXML.
 */
public class Main extends Application {

    private Shon shon = new Shon();

    /**
     * Loads FXML, sets the stage, and show stage.
     * @param stage the primary stage for this application, onto which the
     *     application scene can be set. Applications may create other stages,
     *     if needed, but they will not be primary stages.
     */
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/MainWindow.fxml"));
            AnchorPane ap = fxmlLoader.load();
            Scene scene = new Scene(ap);
            stage.setScene(scene);
            fxmlLoader.<MainWindow>getController().setShon(shon);
            stage.setTitle("Shon");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
