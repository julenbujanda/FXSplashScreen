import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    private AnchorPane anchorPane;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        anchorPane = FXMLLoader.load(getClass().getResource("view/Splash.fxml"));
        Scene scene = new Scene(anchorPane);
        // Añadir fuentes
        scene.getStylesheets().add("https://fonts.googleapis.com/css?family=Chakra+Petch");
        scene.getStylesheets().add("https://fonts.googleapis.com/css?family=Quicksand");
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
