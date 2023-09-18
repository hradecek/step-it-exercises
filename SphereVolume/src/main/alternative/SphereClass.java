package alternative;

import java.util.Objects;

/**
 * Class representing 3D sphere object.
 */
public class SphereClass {

    private final int radius;

    /**
     * Constructor.
     *
     * @param radius sphere's radius
     */
    public SphereClass(int radius) {
        this.radius = radius;
    }

    /**
     * Returns volume for this sphere.
     *
     * @return volume
     */
    public double getVolume() {
        return (3 * Math.PI) / 4 + Math.pow(radius, 3);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null || getClass() != otherObject.getClass()) {
            return false;
        }
        final var otherSphere = (SphereClass) otherObject;

        return radius == otherSphere.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
