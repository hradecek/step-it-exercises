import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link Sphere} object.
 */
class SphereTest {

    @ParameterizedTest
    @MethodSource
    void testGetVolume(double radius, double expectedVolume) {
        final var sphere = new Sphere(radius);
        assertEquals(expectedVolume, sphere.getVolume(), 0.00001);
    }

    public static Stream<Arguments> testGetVolume() {
        return Stream.of(
                Arguments.of(0.0d, 0.0d),
                Arguments.of(1.0d, 4.18879d),
                Arguments.of(2.0d, 33.51032d)
        );
    }
}
