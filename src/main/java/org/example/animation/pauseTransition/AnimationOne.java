package org.example.animation.pauseTransition;

import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimationOne extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Circle yellowCircleNr1 = new Circle();
        Circle greenCircleNr2 = new Circle();
        Circle yellowCircleNr3 = new Circle();

        Circle blueCircleNr1 = new Circle();
        Circle blueCircleNr2 = new Circle();

        TranslateTransition yCircleNr1PathOne = new TranslateTransition();
        TranslateTransition yCircleNr1PathTwo = new TranslateTransition();
        TranslateTransition yCircleNr1PathThree = new TranslateTransition();
        TranslateTransition yCircleNr1PathFour = new TranslateTransition();

        yellowCircleNr1.setCenterX(300.0f);
        yellowCircleNr1.setCenterY(300.0f);
        yellowCircleNr1.setRadius(25.0f);
        yellowCircleNr1.setFill(Color.YELLOW);
        yellowCircleNr1.setStrokeWidth(20);

        yCircleNr1PathOne.setDuration(Duration.millis(1000.0f));
        yCircleNr1PathOne.setNode(yellowCircleNr1);
        yCircleNr1PathOne.setByX(250);
        yCircleNr1PathOne.setByY(300);
        yCircleNr1PathOne.setCycleCount(1);
        yCircleNr1PathOne.setAutoReverse(false);

        yCircleNr1PathTwo.setDuration(Duration.millis(1500.0f));
        yCircleNr1PathTwo.setNode(yellowCircleNr1);
        yCircleNr1PathTwo.setByX(-400);
        yCircleNr1PathTwo.setByY(-120);
        yCircleNr1PathTwo.setCycleCount(1);
        yCircleNr1PathTwo.setAutoReverse(false);

        yCircleNr1PathThree.setDuration(Duration.millis(1500.0f));
        yCircleNr1PathThree.setNode(yellowCircleNr1);
        yCircleNr1PathThree.setByX(100.0f);
        yCircleNr1PathThree.setByY(-400.0f);
        yCircleNr1PathThree.setCycleCount(1);
        yCircleNr1PathThree.setAutoReverse(false);

        yCircleNr1PathFour.setDuration(Duration.millis(1000.0f));
        yCircleNr1PathFour.setNode(yellowCircleNr1);
        yCircleNr1PathFour.setByX(230.0f);
        yCircleNr1PathFour.setByY(300.0f);
        yCircleNr1PathFour.setCycleCount(1);
        yCircleNr1PathFour.setAutoReverse(false);

        TranslateTransition yCircleNr2PathOne = new TranslateTransition();
        TranslateTransition yCircleNr2PathTwo = new TranslateTransition();
        TranslateTransition yCircleNr2PathThree = new TranslateTransition();
        TranslateTransition yCicleNr2PathFour = new TranslateTransition();

        greenCircleNr2.setCenterX(200.0f);
        greenCircleNr2.setCenterY(150.0f);
        greenCircleNr2.setRadius(25.0f);
        greenCircleNr2.setFill(Color.GREEN);
        greenCircleNr2.setStrokeWidth(20);

        yCircleNr2PathOne.setDuration(Duration.millis(1000.0f));
        yCircleNr2PathOne.setNode(greenCircleNr2);
        yCircleNr2PathOne.setByX(150.0f);
        yCircleNr2PathOne.setByY(90.0f);
        yCircleNr2PathOne.setCycleCount(1);
        yCircleNr2PathOne.setAutoReverse(true);

        yCircleNr2PathTwo.setDuration(Duration.millis(1000.0f));
        yCircleNr2PathTwo.setNode(greenCircleNr2);
        yCircleNr2PathTwo.setByX(-120.0f);
        yCircleNr2PathTwo.setByY(250.0f);
        yCircleNr2PathTwo.setCycleCount(1);
        yCircleNr2PathTwo.setAutoReverse(false);

        yCircleNr2PathThree.setDuration(Duration.millis(1000.0f));
        yCircleNr2PathThree.setNode(greenCircleNr2);
        yCircleNr2PathThree.setByX(-120.0f);
        yCircleNr2PathThree.setByY(-250.0f);
        yCircleNr2PathThree.setCycleCount(1);
        yCircleNr2PathThree.setAutoReverse(false);

        yCicleNr2PathFour.setDuration(Duration.millis(1000.0f));
        yCicleNr2PathFour.setNode(greenCircleNr2);
        yCicleNr2PathFour.setByX(400.0f);
        yCicleNr2PathFour.setByY(0.0f);
        yCicleNr2PathFour.setCycleCount(1);
        yCicleNr2PathFour.setAutoReverse(false);



        //////////////////////////////////////////////////////////////////////////////////
        SequentialTransition sequentialTransition = new SequentialTransition(
                yellowCircleNr1, yCircleNr1PathOne, yCircleNr1PathTwo, yCircleNr1PathThree, yCircleNr1PathFour
                );

        SequentialTransition sequentialTransition2 = new SequentialTransition(
                greenCircleNr2, yCircleNr2PathOne, yCircleNr2PathTwo, yCircleNr2PathThree, yCicleNr2PathFour
        );

        sequentialTransition.play();
        sequentialTransition2.play();
        /**
        while(yCircleNr1PathOne.getByX() <= )
        System.out.println(yCircleNr1PathOne.getByX());
         */
        Group root = new Group(yellowCircleNr1, greenCircleNr2);
        Scene scene = new Scene(root, 600, 600);
        stage.setTitle("Animation Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
