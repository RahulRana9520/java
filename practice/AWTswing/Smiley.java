// File: Smiley.java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class Smiley extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        // Face
        Circle face = new Circle(150, 150, 100);
        face.setFill(Color.YELLOW);
        face.setStroke(Color.BLACK);

        // Left Eye
        Circle leftEye = new Circle(110, 120, 10);
        leftEye.setFill(Color.BLACK);

        // Right Eye
        Circle rightEye = new Circle(190, 120, 10);
        rightEye.setFill(Color.BLACK);

        // Smile
        Arc smile = new Arc(150, 160, 50, 30, 180, 180);
        smile.setType(ArcType.OPEN);
        smile.setStroke(Color.BLACK);
        smile.setFill(Color.TRANSPARENT);
        smile.setStrokeWidth(3);

        pane.getChildren().addAll(face, leftEye, rightEye, smile);

        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("Smiley Face");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
