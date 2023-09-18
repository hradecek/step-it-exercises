import shapes.Circle;
import shapes.Shape;
import shapes.Square;
import svg.SvgFileWriter;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Main class.
 */
public class Main {

    public static final String OUTPUT_FILE_SVG = "shapes.svg";

    /**
     * Main method.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        final var shapes = new ArrayList<Shape>(generateSquares());
        shapes.addAll(generateCircles());

        final var writer = new SvgFileWriter();

        try {
            writer.write(OUTPUT_FILE_SVG, shapes);
        } catch (IOException ex) {
            System.err.println("Cannot create SVG file.");
            ex.printStackTrace();
            System.exit(1);
        }
    }

    /**
     * Generates some "random" squares.
     *
     * @return squares
     */
    private static List<Square> generateSquares() {
        final var squares = new ArrayList<Square>();
        final var squareColors = new Color[]{Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.PINK};
        for (int i = 0; i < 5; ++i) {
            squares.add(new Square(squareColors[i], 100 + (50 * i)));
        }

        return squares;
    }

    /**
     * Generates some "random" circles.
     *
     * @return circles
     */
    private static List<Circle> generateCircles() {
        final var circles = new ArrayList<Circle>();
        for (int i = 0; i < 3; ++i) {
            circles.add(new Circle(Color.BLACK, 100 + (50 * i)));
        }

        return circles;
    }
}
