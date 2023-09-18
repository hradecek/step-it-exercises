package shapes;

import java.awt.Color;

public final class Square extends Shape {

    private final int sideLength;

    public Square(Color color, int sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    @Override
    public int getWidth() {
        return sideLength;
    }
}
