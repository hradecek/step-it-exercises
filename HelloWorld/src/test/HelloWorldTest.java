import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Test class for {@link HelloWorld}.
 */
class HelloWorldTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void sayHelloWorld() {
        HelloWorld.printHelloWorld();

        final var expected = "Hello World!\n";
        final var actual = outputStreamCaptor.toString();
        assertNotNull(actual);
        if (!actual.endsWith("\n")) {
            fail("Chybí zalomení řádku - println() vs. print()");
        }

        if (actual.charAt(actual.length() - 2) != '!') {
            fail("Chybí znak '!' na konci");
        }
        if (expected.equalsIgnoreCase(actual)) {
            if (!expected.equals(actual)) {
                fail("Pozor na velikost písmen.\n" + getDifferenceInfoMessage(expected, actual));
            }
        } else {
            fail("Řetězce jsou jiné.\n" + getDifferenceInfoMessage(expected, actual));
        }
    }

    private static String getDifferenceInfoMessage(String expected, String actual) {
        return "Očekávaný řetězec:\t" + expected.trim() + "\nVrácený řetězec:\t" + actual.trim();
    }
}
