package view;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;

public class SplashController {

    @FXML
    private Label lblIcon, lblTitle, lblWelcome;

    @FXML
    private Pane loadPane, rootPane;

    private void openMenu() {
        AnchorPane anchorPane = null;
        try {
            anchorPane = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(anchorPane);
        Stage stage = new Stage();
        stage.getIcons().add(new Image("img/icon.png"));
        stage.setTitle("Home menu");
        stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();
    }

    public void initialize() {

        TranslateTransition translateTransition = new TranslateTransition(
                Duration.seconds(0.1), lblIcon);
        translateTransition.setByY(700);
        translateTransition.play();

        TranslateTransition translateTransition0 = new TranslateTransition(
                Duration.seconds(0.1), lblTitle);
        translateTransition0.setByY(700);
        translateTransition0.play();

        TranslateTransition translateTransition00 = new TranslateTransition(
                Duration.seconds(0.1), lblWelcome);
        translateTransition00.setByY(700);
        translateTransition00.play();

        translateTransition
                .setOnFinished(event -> {


                    TranslateTransition translateTransition1 = new TranslateTransition(
                            Duration.seconds(1), lblIcon);
                    translateTransition1.setByY(-700);

                    translateTransition1.play();

                    translateTransition1.setOnFinished(event1 -> {

                        lblTitle.setVisible(true);

                        TranslateTransition translateTransition11 = new TranslateTransition(
                                Duration.seconds(1), lblTitle);
                        translateTransition11.setByY(-700);
                        translateTransition11.play();

                        translateTransition11.setOnFinished(event2 -> {

                            lblWelcome.setVisible(true);
                            TranslateTransition translateTransition111 = new TranslateTransition(
                                    Duration.seconds(1), lblWelcome);
                            translateTransition111.setByY(-700);
                            translateTransition111.play();

                            translateTransition111.setOnFinished(event3 -> {
                                loadPane.setVisible(true);

                                FadeTransition fadeTransition = new FadeTransition(
                                        Duration.seconds(3), loadPane);
                                fadeTransition.setFromValue(0);
                                fadeTransition.setToValue(1);
                                fadeTransition.play();

                                fadeTransition.setOnFinished(event4 -> {

                                    FadeTransition fadeTransition1 = new FadeTransition(
                                            Duration.seconds(2), rootPane);
                                    fadeTransition1.setFromValue(1);
                                    fadeTransition1.setToValue(0.1);
                                    fadeTransition1.play();

                                    fadeTransition1.setOnFinished(event5 -> {
                                        Stage thisStage = (Stage) rootPane.getScene().getWindow();
                                        thisStage.close();
                                        openMenu();
                                    });

                                });

                            });

                        });
                    });

                });

    }

}
