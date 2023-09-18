import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StdInputNumbersReader implements NumbersReader {

    @Override
    public List<Integer> readNumbers() {
        final var numbers = new ArrayList<Integer>();
        try (var input = new Scanner(System.in)) {
            while (input.hasNextLine()) {
                final var line = input.nextLine();
                if (line.isBlank()) {
                    break;
                }
                try {
                    numbers.add(Integer.parseInt(line));
                } catch (NumberFormatException ex) {
                    System.err.println("Skip. Entered " + line + " is not a number.");
                }
            }
        }
        return numbers;
    }
}
