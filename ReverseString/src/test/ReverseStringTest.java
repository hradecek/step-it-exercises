import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Tests for {@link ReverseString}.
 */
class ReverseStringTest {

    @ParameterizedTest
    @MethodSource
    void reverseString(String string, String expected) {
        final var actual = ReverseString.reverseString(string);

        assertNotNull(actual);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> reverseString() {
        return Stream.of(
                Arguments.of("", ""),
                Arguments.of("hello", "olleh"),
                Arguments.of("Hello", "olleH"),
                Arguments.of("Hello World!", "!dlroW olleH"),
                Arguments.of("Kobyla ma maly bok", "kob ylam am alyboK")
        );
    }
}

