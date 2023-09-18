import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Tests for {@link Greetings}.
 */
class GreetingsTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "Albert",
            "Richard Feynman",
            "R-2-D-2",
            "R3411y str4ng3 n4m3 - L0L  ;)",
            "     \n   \n   \t"
    })
    void greetings(String name) {
        Greetings.greet(name);

        final var expected = "Hello " + name + "!\n";
        final var actual = outputStreamCaptor.toString();
        assertNotNull(actual);
        assertEquals(expected, actual);
    }
}
