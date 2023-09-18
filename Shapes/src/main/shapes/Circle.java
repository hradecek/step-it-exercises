package shapes;

import java.awt.Color;

public final class Circle extends Shape {

    private final int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public int getWidth() {
        return 2 * radius;
    }
}
