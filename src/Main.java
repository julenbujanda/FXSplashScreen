import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
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
        Font.loadFont(Main.class.getResource("fonts/ChakraPetch-Regular.ttf").toExternalForm(), 20);
        Font.loadFont(Main.class.getResource("fonts/Quicksand-Regular.ttf").toExternalForm(), 20);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
