import java.util.Scanner;

public class GreetingsAdvanced {

    /**
     * Main program.
     *
     * <p>Greets user after getting his username.
     *
     * @param args arguments
     */
    public static void main(String[] args) {
        System.out.print("Username: ");
        try (final var input = new Scanner(System.in)) {
            final var username = input.nextLine().trim();
            if (username.isBlank()) {
                System.err.println("Username cannot be blank.");
                System.exit(1);
            }
            greet(username);
        }
    }

    /**
     * Greets a person whose name is specified by argument {@code name}.
     *
     * @param name name
     */
    public static void greet(String name) {
        System.out.println("Hello " + name + "!");
    }
}
