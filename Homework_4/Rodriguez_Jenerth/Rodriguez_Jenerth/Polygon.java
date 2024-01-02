package HW.HW3_solution;


/**
 * Write a description of class polygon here.
 *
 * @author (Jenerth Rodriguez)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public abstract class Polygon {
    private ArrayList<Integer> sides;

    public Polygon(ArrayList<Integer> sides) {
        this.sides = sides;
    }

    protected ArrayList<Integer> getSides() {
        return sides;
    }

    public int computePerimeter() {
        int perimeter = 0;
        for (int side : sides) {
            perimeter += side;
        }
        return perimeter;
    }

    public abstract double computeArea();
}
