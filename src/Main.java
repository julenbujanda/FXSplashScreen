import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
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
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        scene.setFill(Color.TRANSPARENT);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        Rectangle rect = new Rectangle(700, 500);
        rect.setArcHeight(60.0);
        rect.setArcWidth(60.0);
        anchorPane.setClip(rect);
        primaryStage.getIcons().add(new Image("img/icon.png"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
