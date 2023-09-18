/**
 * Record representing 3D sphere object.
 *
 * @param radius sphere's radius
 */
public record Sphere(double radius) {

    /**
     * Returns volume for this sphere.
     *
     * @return volume
     */
    public double getVolume() {
        return 4.0d / 3.0d * Math.PI * Math.pow(radius, 3);
    }
}

