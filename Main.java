//M05 Programming Assignment (2)
//Ivy Tech Community College
//SDEV 200 - Java
//Professor Bumgardner
//Nativida Muhammad
// 21 April 2024

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle(100, Color.WHITE); // This code creates a white circle
        circle.setStroke(Color.BLACK); // This code adds black strokes for visibility

        circle.setOnMousePressed(event -> {
            if (event.getButton() == MouseButton.PRIMARY) { //This code checks if left mouse button is pressed
                circle.setFill(Color.BLACK); // This code changes circle color to black
            }
        });

        circle.setOnMouseReleased(event -> {
            if (event.getButton() == MouseButton.PRIMARY) { // This code checks if left mouse button is released
                circle.setFill(Color.WHITE); // This code changes circle color to white
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(circle);

        Scene scene = new Scene(root, 200, 200);

        primaryStage.setTitle("Circle Color Change");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
