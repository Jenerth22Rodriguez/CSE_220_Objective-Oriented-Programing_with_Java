package HW.HW3_solution;


/**
 * Write a description of class RightTriangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class RightTriangle extends Polygon {
    public RightTriangle(ArrayList<Integer> sides) throws IllegalArgumentException {
        super(sides);

        if (sides.size() != 3) {
            throw new IllegalArgumentException("RightTriangle must have exactly 3 sides");
        }

        int a = sides.get(0);
        int b = sides.get(1);
        int c = sides.get(2);

        if (a * a + b * b != c * c) {
            throw new IllegalArgumentException("Input does not satisfy the Pythagorean theorem");
        }
    }

    @Override
    public double computeArea() {
        int a = getSides().get(0);
        int b = getSides().get(1);
        return a * b / 2.0;
    }
}
