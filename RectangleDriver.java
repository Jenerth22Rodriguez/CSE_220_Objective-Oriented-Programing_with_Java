
public class RectangleDriver {
    public static void main(String args[]) {
        System.out.println(
                "Press the 'N' key to create a new map\nPress the 'L' key to load an existing map.\nPress the 'Q' key to quit the application\nThe default map storage directory is C:\\MyMaps\n");
        Rectangle rect1 = new Rectangle(5, 4);
        Rectangle rect2 = new Rectangle(2);
        Rectangle rect3 = new Rectangle();
        rect1.printDims();
        rect1.printArea();
        rect2.printDims();
        rect2.printArea();
        rect3.printDims();
        rect3.printArea();
        rect1.printLargerSide();
        rect2.printLargerSide();
        rect3.printLargerSide();
    }
}
