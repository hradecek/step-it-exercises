package shapes;

import java.awt.Color;

/**
 * Abstract class representing geometric shape.
 */
public abstract class Shape {

    protected final Color color;

    /**
     * Constructor.
     *
     * @param color shape's color
     */
    public Shape(Color color) {
        this.color = color;
    }

    /**
     * Returns shape's color.
     *
     * @return shape's color
     */
    public Color getColor() {
        return color;
    }


    /**
     * Shape's width.
     *
     * @return shape's width
     */
    public abstract int getWidth();
}

