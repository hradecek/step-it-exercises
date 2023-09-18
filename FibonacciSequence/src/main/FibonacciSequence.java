import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {

    public static void main(String[] args) {
        for (int i = -20; i < 20; ++i) {
            System.out.println(generateFibonacciSequence(i));
        }
    }

    public static List<Integer> generateFibonacciSequence(int n) {
        if (n <= 0) {
            return List.of();
        }
        if (n == 1) {
            return List.of(0);
        }
        final var fibonacciNumbers = new ArrayList<>(List.of(0, 1));

        for (int i = 2; i < n; i++) {
            fibonacciNumbers.add(fibonacciNumbers.get(i - 1) + fibonacciNumbers.get(i - 2));
        }

        return fibonacciNumbers;
    }

    public static List<Integer> generateFibonacciSequenceWhile(int n) {
        if (n <= 0) {
            return List.of();
        }
        if (n == 1) {
            return List.of(0);
        }

        final var fibonacciNumbers = new ArrayList<>(List.of(0, 1));

        int i = 2;
        while (i < n) {
            fibonacciNumbers.add(fibonacciNumbers.get(i - 1) + fibonacciNumbers.get(i - 2));
            i++;
        }
        return fibonacciNumbers;
    }
}

