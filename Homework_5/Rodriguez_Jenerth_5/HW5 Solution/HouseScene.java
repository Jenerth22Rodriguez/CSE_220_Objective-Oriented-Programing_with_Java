import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
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
        Pane root = new Pane();

        root.setStyle("-fx-background-color: #87CEFA;");

        Circle sun = new Circle(100, 100, 50, Color.YELLOW);

        Shape cloud1 = createCloud(200, 50, 70);
        Shape cloud2 = createCloud(400, 80, 50);
        Shape cloud3 = createCloud(500, 120, 60);
        
        
        Circle leaf = new Circle(640, 350, 85, Color.GREEN);

       
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
        
        Rectangle window1 = new Rectangle(270, 360, 60, 60);
        window1.setFill(Color.RED);

        Rectangle window2 = new Rectangle(475, 360, 60, 60);
        window2.setFill(Color.RED);
        
        Rectangle tree = new Rectangle(620, 400, 50, 100);
        tree.setFill(Color.BROWN);
        
        root.getChildren().addAll(sun, cloud1, cloud2, cloud3, houseBody, roof, window1,window2, door, tree, leaf);

        Scene scene = new Scene(root, 800, 600);

        primaryStage.setScene(scene);

        primaryStage.show();
        
        Slider slider = new Slider(50, 400, 200);
        slider.setLayoutX(650);
        slider.setLayoutY(510);
        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue) {
                double width = newValue.doubleValue();
                double height = width / 1.5; 
                houseBody.setWidth(width);
                houseBody.setHeight(height);
            }
        });
        root.getChildren().add(slider);
    }

   private Shape createCloud(double x, double y, double size) {
    Circle c1 = new Circle(x + size / 6, y + size / 6, size / 3);
    Circle c2 = new Circle(x + size / 3, y + size / 6, size / 3);
    Circle c3 = new Circle(x + size / 2, y + size / 6, size / 3);
    Circle c4 = new Circle(x + size / 1.5, y + size / 6, size / 3);
    Circle c5 = new Circle(x + size / 1.2, y + size / 6, size / 3);
    Circle c6 = new Circle(x + size, y + size / 6, size / 3);

    Shape cloud = Shape.union(c1, c2);
    cloud = Shape.union(cloud, c3);
    cloud = Shape.union(cloud, c4);
    cloud = Shape.union(cloud, c5);
    cloud = Shape.union(cloud, c6);
    cloud.setFill(Color.WHITE);

    return cloud;
}
}

