package classwork.lesson13;

import java.util.Objects;

public class Box {

    public double width;
    public double height;
    public double depth;
    static String color = "red";
   static final int WARRANTY_YEAR = 1;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Double.compare(box.width, width) == 0 && Double.compare(box.height, height) == 0 && Double.compare(box.depth, depth) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, depth);
    }

    public double volume() {
        return width * height * depth;
    }

    static void printColor() {
        System.out.println(color);
    }
}
