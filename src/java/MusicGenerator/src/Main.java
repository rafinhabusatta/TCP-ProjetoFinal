import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) throws IOException {


        if (args.length < 1) {
            System.out.println("Usage: java Main <path/to/text/file>");
            System.exit(1);
        }
        String filePath = args[0];
        TextReader text = new TextReader(filePath);
        Path fileName = Paths.get(filePath);
        text.readText();

        System.out.print(text.getUserText());
    }
}