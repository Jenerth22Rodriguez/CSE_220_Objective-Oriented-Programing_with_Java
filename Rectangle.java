
public class Rectangle {
    private double height, width;

    public Rectangle() {
        height = 1;
        width = 1;
    }

    public Rectangle(double x) {
        height = x;
        width = x;
    }

    public Rectangle(double x, double y) {
        height = x;
        width = y;
    }

    public void printDims() {
        if (height == width) {
            System.out.println("This square has height " + height + " and width " + width);
        } else {
            System.out.println("This rectangle has height " + height + " and width " + width);
        }
    }

    public void printArea() {
        if (height == width) {
            System.out.println("This square has area of " + height * width + " units squared.");
        } else {
            System.out.println("This rectangle has area of " + height * width + " units squared.");
        }
    }

    public void printLargerSide() {

        if ((height == width)) {
            System.out.println("Both sides are the same");
        } else if (height > width) {
            System.out.println("The rectangle's height is larger than its width");
        } else if (height < width) {
            System.out.println("The rectangle's width is larger than its height");
        } else {
            System.out.println("Error");
        }
    }
}