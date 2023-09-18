import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link FibonacciSequence}.
 */
class FibonacciSequenceTest {

    @ParameterizedTest
    @MethodSource
    void generateFibonacciSequence(int number, List<Integer> expected) {

        final var actual = FibonacciSequence.generateFibonacciSequence(number);

        assertEquals(expected, actual);
    }

    public static Stream<Arguments> generateFibonacciSequence() {
        return Stream.of(
                Arguments.of(-20, List.of()),
                Arguments.of(-10, List.of()),
                Arguments.of(0, List.of()),
                Arguments.of(1, List.of(0)),
                Arguments.of(2, List.of(0, 1)),
                Arguments.of(6, List.of(0, 1, 1, 2, 3, 5)),
                Arguments.of(11, List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55)),
                Arguments.of(15, List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377))
        );
    }
}
