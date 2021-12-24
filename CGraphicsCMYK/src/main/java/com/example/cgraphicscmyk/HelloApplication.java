package com.example.cgraphicscmyk;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.FillRule;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();
        Canvas canvas = new Canvas(600, 600);
        Circlies circlies = new Circlies(canvas);
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                circlies.draw();
            }
        };
        circlies.draw();
        Timer timer = new Timer();
        timer.schedule(timerTask,0,20);
        pane.getChildren().add(canvas);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}