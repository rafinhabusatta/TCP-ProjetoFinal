import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextReader	{
	public static void main(String[] args)
	throws IOException{
		Path fileName = Path.of("./teste/soundcraft.txt");

		String textReaderout = Files.readString(fileName);

		System.out.println(textReaderout);

	}
}