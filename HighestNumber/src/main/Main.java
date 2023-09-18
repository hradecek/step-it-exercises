import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        final var numbersReader = new StdInputNumbersReader();
//        final var numbersReader = new FileNumbersReader("HighestNumber/resources/numbers.txt");

        run(numbersReader);
    }

    private static void run(NumbersReader numbersReader) {
        final var numbers = numbersReader.readNumbers();
        System.out.println(findHighestNumber(numbers));
    }

    private static int findHighestNumber(Collection<Integer> numbers) {
        final var maybeHighestNumber = numbers.stream().mapToInt(integer -> integer).max();
        if (maybeHighestNumber.isEmpty()) {
            System.err.println("No highest number has been found");
            System.exit(1);
        }
        return maybeHighestNumber.getAsInt();
    }
}
