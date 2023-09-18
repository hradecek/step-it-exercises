package svg;

import org.jfree.graphics2d.svg.SVGUtils;
import shapes.Shape;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

/**
 * Class responsible for writing {@link Shape}s to file.
 */
public class SvgFileWriter {

    protected final SvgShapesRenderer renderer = new SvgShapesRenderer();

    /**
     * Writes {@link Shape}s into a file specified by {@code path}.
     *
     * @param path output file
     * @param shapes shapes to be written
     * @throws IOException thrown if shapes cannot be written
     */
    public void write(String path, Collection<Shape> shapes) throws IOException {
        SVGUtils.writeToSVG(new File(path), renderer.render(shapes).getSVGElement());
    }
}
