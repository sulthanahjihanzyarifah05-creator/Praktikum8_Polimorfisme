
package latihan2;

import java.util.ArrayList;
import java.util.List;

public class MainShape {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(5));        // radius = 5
        shapes.add(new Rectangle(4, 6));  // width = 4, height = 6
        shapes.add(new Circle(3));        // radius = 3

        double totalArea = 0;

        for (Shape s : shapes) {
            totalArea += s.area();
        }

        System.out.println("Total luas semua shape = " + totalArea);
    }
}
