package HW.HW3_solution;


/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class Rectangle extends Polygon {
    public Rectangle(ArrayList<Integer> sides) throws IllegalArgumentException {
        super(sides);

        if (sides.size() != 4) {
            throw new IllegalArgumentException("Rectangle must have exactly 4 sides");
        }

        if (!sides.get(0).equals(sides.get(2)) || !sides.get(1).equals(sides.get(3))) {
            throw new IllegalArgumentException("Input does not represent a rectangle");
        }
    }

    public double computeArea() {
        int length = getSides().get(0);
        int width = getSides().get(1);
        return length * width;
    }
}
