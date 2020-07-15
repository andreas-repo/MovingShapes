package org.example.animation.pauseTransition;

import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MovingPauseCollisionTransitionExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Circle circle = new Circle();

        circle.setCenterX(300.0f);
        circle.setCenterY(130.0f);

        circle.setRadius(25.0f);

        circle.setFill(Color.FORESTGREEN);

        circle.setStrokeWidth(20);

        PauseTransition pauseTransition = new PauseTransition();

        pauseTransition.setDuration(Duration.millis(1000));

        TranslateTransition translateTransition = new TranslateTransition();

        translateTransition.setDuration(Duration.millis(1000));

        translateTransition.setNode(circle);

        translateTransition.setByY(300);

        translateTransition.setCycleCount(1);

        translateTransition.setAutoReverse(false);

        /**
         * move circle left
         */

        TranslateTransition translateTransitionMoveLeft = new TranslateTransition();

        translateTransitionMoveLeft.setDuration(Duration.millis(1000));

        translateTransitionMoveLeft.setNode(circle);

        translateTransitionMoveLeft.setByX(300);

        translateTransitionMoveLeft.setCycleCount(1);

        translateTransitionMoveLeft.setAutoReverse(false);

        /**
         * move circle up
         */

        TranslateTransition translateTransitionMoveUp = new TranslateTransition();

        translateTransitionMoveUp.setDuration(Duration.millis(1000));

        translateTransitionMoveUp.setNode(circle);

        translateTransitionMoveUp.setByY(-300);
        translateTransitionMoveUp.setByX(100);

        translateTransitionMoveUp.setCycleCount(1);

        translateTransitionMoveUp.setAutoReverse(false);


        /**
         * obstacle
         */
        Circle circle2 = new Circle();

        circle2.setCenterX(300.0f);
        circle2.setCenterY(260.0f);

        circle2.setRadius(50.0f);

        circle2.setFill(Color.BLUE);

        circle2.setStrokeWidth(20);

        PauseTransition pauseTransition2 = new PauseTransition();

        pauseTransition2.setDuration(Duration.millis(1000));

        TranslateTransition translateTransition2 = new TranslateTransition();

        translateTransition2.setDuration(Duration.millis(1000));

        translateTransition2.setNode(circle);

        translateTransition2.setByY(300);
        translateTransition2.setByY(130);

        translateTransition2.setCycleCount(1);

        translateTransition2.setAutoReverse(false);





        SequentialTransition sequentialTransition2 = new SequentialTransition(circle2, translateTransition2);



        //Applying Sequential transition to the circle
        SequentialTransition sequentialTransition = new SequentialTransition(
                circle, translateTransition, pauseTransition, translateTransitionMoveLeft, translateTransitionMoveUp);

        //Playing the animation
        sequentialTransition.play();
        sequentialTransition2.play();

        Bounds objA = circle.localToScene(circle.getBoundsInLocal());
        Bounds objB = circle2.localToScene(circle2.getBoundsInLocal());

        if (objA.intersects(objB)) {
            System.out.println("INTERSECTING!!!");
        }

        //Creating a Group object
        Group root = new Group(circle, circle2);

        //Creating a scene object
        Scene scene = new Scene(root, 600, 600);

        //Setting title to the Stage
        stage.setTitle("Pause transition example");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
