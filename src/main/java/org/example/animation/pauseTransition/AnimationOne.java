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
        Circle yellowCircleNr2 = new Circle();
        Circle yellowCircleNr3 = new Circle();

        Circle blueCircleNr1 = new Circle();
        Circle blueCircleNr2 = new Circle();

        Circle greenCircleNr1 = new Circle();

        Circle violetCircleNr1 = new Circle();

        /**
         * Yellow circle
         */
        TranslateTransition yCircleNr1PathOne = new TranslateTransition();
        TranslateTransition yCircleNr1PathTwo = new TranslateTransition();
        TranslateTransition yCircleNr1PathThree = new TranslateTransition();
        TranslateTransition yCircleNr1PathFour = new TranslateTransition();
        TranslateTransition yCircleNr1PathFive = new TranslateTransition();
        TranslateTransition yCircleNr1PathSix = new TranslateTransition();

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

        yCircleNr1PathFive.setDuration(Duration.millis(1000.0f));
        yCircleNr1PathFive.setNode(yellowCircleNr1);
        //yCircleNr1PathFive.fromXProperty().setValue(100);
        //yCircleNr1PathFive.fromYProperty().setValue(100);
        yCircleNr1PathFive.toXProperty().setValue(300);
        yCircleNr1PathFive.toYProperty().setValue(300);
        yCircleNr1PathFive.setCycleCount(1);
        yCircleNr1PathFive.setAutoReverse(false);

        yCircleNr1PathSix.setDuration(Duration.millis(1000.0f));
        yCircleNr1PathSix.setNode(yellowCircleNr1);
        //yCircleNr1PathSix.fromXProperty().setValue(300);
        //yCircleNr1PathSix.fromYProperty().setValue(300);
        yCircleNr1PathSix.toXProperty().setValue(150);
        yCircleNr1PathSix.toYProperty().setValue(-200);
        yCircleNr1PathSix.setCycleCount(1);
        yCircleNr1PathSix.setAutoReverse(false);


        /**
         * Green Circle
         */
        TranslateTransition yCircleNr2PathOne = new TranslateTransition();
        TranslateTransition yCircleNr2PathTwo = new TranslateTransition();
        TranslateTransition yCircleNr2PathThree = new TranslateTransition();
        TranslateTransition yCircleNr2PathFour = new TranslateTransition();

        greenCircleNr1.setCenterX(200.0f);
        greenCircleNr1.setCenterY(150.0f);
        greenCircleNr1.setRadius(25.0f);
        greenCircleNr1.setFill(Color.GREEN);
        greenCircleNr1.setStrokeWidth(20);

        yCircleNr2PathOne.setDuration(Duration.millis(1000.0f));
        yCircleNr2PathOne.setNode(greenCircleNr1);
        yCircleNr2PathOne.setByX(150.0f);
        yCircleNr2PathOne.setByY(90.0f);
        yCircleNr2PathOne.setCycleCount(1);
        yCircleNr2PathOne.setAutoReverse(true);

        yCircleNr2PathTwo.setDuration(Duration.millis(1000.0f));
        yCircleNr2PathTwo.setNode(greenCircleNr1);
        yCircleNr2PathTwo.setByX(-120.0f);
        yCircleNr2PathTwo.setByY(250.0f);
        yCircleNr2PathTwo.setCycleCount(1);
        yCircleNr2PathTwo.setAutoReverse(false);

        yCircleNr2PathThree.setDuration(Duration.millis(1000.0f));
        yCircleNr2PathThree.setNode(greenCircleNr1);
        yCircleNr2PathThree.setByX(-120.0f);
        yCircleNr2PathThree.setByY(-250.0f);
        yCircleNr2PathThree.setCycleCount(1);
        yCircleNr2PathThree.setAutoReverse(false);

        yCircleNr2PathFour.setDuration(Duration.millis(1000.0f));
        yCircleNr2PathFour.setNode(greenCircleNr1);
        yCircleNr2PathFour.setByX(400.0f);
        yCircleNr2PathFour.setByY(0.0f);
        yCircleNr2PathFour.setCycleCount(1);
        yCircleNr2PathFour.setAutoReverse(false);

        /**
         * Violet circle
         */
        TranslateTransition vCircleNr1PathOne = new TranslateTransition();
        TranslateTransition vCircleNr1PathTwo = new TranslateTransition();
        TranslateTransition vCircleNr1PathThree = new TranslateTransition();
        TranslateTransition vCircleNr1PathFour = new TranslateTransition();
        TranslateTransition vCircleNr1PathFive = new TranslateTransition();

        violetCircleNr1.setCenterX(300.0f);
        violetCircleNr1.setCenterY(300.0f);
        violetCircleNr1.setRadius(25.0f);
        violetCircleNr1.setFill(Color.VIOLET);
        violetCircleNr1.setStrokeWidth(20);

        vCircleNr1PathOne.setDuration(Duration.millis(1000.0f));
        vCircleNr1PathOne.setNode(violetCircleNr1);
        vCircleNr1PathOne.toXProperty().setValue(-270.0f);
        vCircleNr1PathOne.toYProperty().setValue(-270.0f);
        vCircleNr1PathOne.setCycleCount(1);
        vCircleNr1PathOne.setAutoReverse(false);

        vCircleNr1PathTwo.setDuration(Duration.millis(2000.0f));
        vCircleNr1PathTwo.setNode(violetCircleNr1);
        vCircleNr1PathTwo.toXProperty().setValue(0.0f);
        vCircleNr1PathTwo.toYProperty().setValue(200.0f);
        vCircleNr1PathTwo.setCycleCount(1);
        vCircleNr1PathTwo.setAutoReverse(false);

        vCircleNr1PathThree.setDuration(Duration.millis(1500.0f));
        vCircleNr1PathThree.setNode(violetCircleNr1);
        vCircleNr1PathThree.toXProperty().setValue(200.0f);
        vCircleNr1PathThree.toYProperty().setValue(-300.0f);
        vCircleNr1PathThree.setCycleCount(1);
        vCircleNr1PathThree.setAutoReverse(false);

        vCircleNr1PathFour.setDuration(Duration.millis(1500.0f));
        vCircleNr1PathFour.setNode(violetCircleNr1);
        vCircleNr1PathFour.toXProperty().setValue(-200);
        vCircleNr1PathFour.toYProperty().setValue(-200);
        vCircleNr1PathFour.setCycleCount(1);
        vCircleNr1PathFour.setAutoReverse(false);

        vCircleNr1PathFive.setDuration(Duration.millis(1000.0f));
        vCircleNr1PathFive.setNode(violetCircleNr1);
        vCircleNr1PathFive.toXProperty().setValue(0.0f);
        vCircleNr1PathFive.toYProperty().setValue(0.0f);
        vCircleNr1PathFive.setCycleCount(1);
        vCircleNr1PathFive.setAutoReverse(false);




        //////////////////////////////////////////////////////////////////////////////////
        SequentialTransition sequentialTransition = new SequentialTransition(
                yellowCircleNr1, yCircleNr1PathOne, yCircleNr1PathTwo, yCircleNr1PathThree, yCircleNr1PathFour, yCircleNr1PathFive, yCircleNr1PathSix
                );

        SequentialTransition sequentialTransition2 = new SequentialTransition(
                greenCircleNr1, yCircleNr2PathOne, yCircleNr2PathTwo, yCircleNr2PathThree, yCircleNr2PathFour
        );

        SequentialTransition sequentialTransition3 = new SequentialTransition(
                violetCircleNr1, vCircleNr1PathOne, vCircleNr1PathTwo, vCircleNr1PathThree, vCircleNr1PathFour, vCircleNr1PathFive
        );

        sequentialTransition.play();
        sequentialTransition2.play();
        sequentialTransition3.play();
        /**
        while(yCircleNr1PathOne.getByX() <= )
        System.out.println(yCircleNr1PathOne.getByX());
         */
        Group root = new Group(yellowCircleNr1, greenCircleNr1, violetCircleNr1);
        Scene scene = new Scene(root, 600, 600);
        stage.setTitle("Animation Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
