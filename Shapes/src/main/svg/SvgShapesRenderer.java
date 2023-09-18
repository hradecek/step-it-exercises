package svg;

import org.jfree.graphics2d.svg.SVGGraphics2D;
import shapes.Circle;
import shapes.Shape;
import shapes.Square;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Collection;

/**
 * Class responsible for rendering provided collection of {@link Shape}s in SVG format.
 */
public class SvgShapesRenderer {

    private static final int PADDING = 20;

    /**
     * Render {@code shapes} in SVG format.
     *
     * @param shapes shapes to be rendered
     * @return rendered shapes
     */
    public SVGGraphics2D render(Collection<Shape> shapes) {
        final var boundingBox = getBoundingBox(shapes);

        int width = (int) Math.ceil(boundingBox.width()) + PADDING;
        int height = (int) Math.ceil(boundingBox.height()) + PADDING;

        final var graphics = new SVGGraphics2D(width, height);

        int xPosition = PADDING / 2;
        int yPosition = (int) boundingBox.height() + PADDING / 2;

        for (var shape : shapes) {
            graphics.setColor(shape.getColor());
            render(shape, graphics, xPosition, yPosition);
            xPosition += shape.getWidth() + PADDING;
        }

        return graphics;
    }

    protected void render(Shape shape, Graphics2D graphics, int x, int y) {
        if (shape instanceof Circle circle) {
            final var width = circle.getWidth();
            graphics.fill(new Ellipse2D.Double(x, y - width, width, width));
        } else if (shape instanceof Square square) {
            final var width = square.getWidth();
            graphics.fillRect(x, y - width, width, width);
        } else {
            throw new RuntimeException("Unsupported shape " + shape.getClass().getSimpleName());
        }
    }

    private BoundingBox getBoundingBox(Collection<Shape> shapes) {
        double width = 0.0d;
        double height = 0.0d;

        for (var shape : shapes) {
            // Shape and Circle have same bounding box
            if (shape instanceof Circle || shape instanceof Square) {
                width += shape.getWidth() + PADDING;
                height = Math.max(height, shape.getWidth());
            } else {
                throw new RuntimeException("Unsupported shape " + shape.getClass().getSimpleName());
            }
        }

        return new BoundingBox(width - PADDING, height);
    }

    private record BoundingBox(double width, double height) {  }
}
