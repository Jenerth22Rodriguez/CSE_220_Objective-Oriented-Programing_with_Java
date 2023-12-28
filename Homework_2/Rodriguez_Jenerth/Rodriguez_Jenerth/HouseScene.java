import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class HouseScene extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a Pane to hold the shapes
        Pane root = new Pane();

        // Set the background color
        root.setStyle("-fx-background-color: #87CEFA;");

        // Create the sun
        Circle sun = new Circle(100, 100, 50, Color.YELLOW);

        // Create the clouds
        Shape cloud1 = createCloud(200, 50, 70);
        Shape cloud2 = createCloud(400, 80, 50);
        Shape cloud3 = createCloud(500, 120, 60);
        
        
        Circle leaf = new Circle(640, 350, 85, Color.GREEN);

        // Create the house
        Rectangle houseBody = new Rectangle(250, 300, 300, 200);
        houseBody.setFill(Color.ORANGE);

        Polygon roof = new Polygon();
        roof.getPoints().addAll(new Double[]{
                250.0, 300.0,
                550.0, 300.0,
                400.0, 220.0
        });
        roof.setFill(Color.DARKBLUE);

        Rectangle door = new Rectangle(350, 400, 100, 100);
        door.setFill(Color.BROWN);
        Rectangle tree = new Rectangle(620, 400, 50, 100);
        tree.setFill(Color.BROWN);
        // Add the shapes to the Pane
        root.getChildren().addAll(sun, cloud1, cloud2, cloud3, houseBody, roof, door, tree, leaf);

        // Create the Scene
        Scene scene = new Scene(root, 800, 600);

        // Set the Scene on the Stage
        primaryStage.setScene(scene);

        // Show the Stage
        primaryStage.show();
    }

    private Shape createCloud(double x, double y, double size) {
        Circle c1 = new Circle(x, y, size / 3);
        Circle c2 = new Circle(x + size / 3, y, size / 3);
        Circle c3 = new Circle(x - size / 3, y, size / 3);
        Circle c4 = new Circle(x + size / 6, y - size / 6, size / 3);
        Circle c5 = new Circle(x - size / 6, y - size / 6, size / 3);
        Circle c6 = new Circle(x - size / 6, y - size / 6, size / 3);
        Shape cloud = Shape.union(c1, c2);
        cloud = Shape.union(cloud, c3);
        cloud = Shape.union(cloud, c4);
        cloud = Shape.union(cloud, c5);
        cloud = Shape.union(cloud, c6);

        cloud.setFill(Color.WHITE);

        return cloud;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
