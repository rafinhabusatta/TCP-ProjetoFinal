import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        TextReader text = new TextReader();
        text.readText();

        System.out.print(text.getUserText());
    }
}