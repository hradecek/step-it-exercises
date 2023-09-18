import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileNumbersReader implements NumbersReader {

    protected final Path numbersFilePath;

    public FileNumbersReader(String numbersFilePath) {
        this(Path.of(numbersFilePath));
    }

    public FileNumbersReader(Path numbersFilePath) {
        this.numbersFilePath = numbersFilePath;
        System.out.println(numbersFilePath.toAbsolutePath().toString());
    }

    @Override
    public List<Integer> readNumbers() {
        final var numbers = new ArrayList<Integer>();
        try {
            for (var line : Files.readAllLines(numbersFilePath)) {
                try {
                    numbers.add(Integer.parseInt(line));
                } catch (NumberFormatException exception) {
                    // Skip non-numeric line
                }
            }
        } catch (IOException ex) {
            throw new RuntimeException("Cannot read file " + numbers, ex);
        }
        return numbers;
    }
}
