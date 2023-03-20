import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class TextReader	{

	private static String textReaderout;

	public static void main(String[] args)
	throws IOException{
		Path fileName = Path.of("./text/soundcraft.txt");

		textReaderout = Files.readString(fileName);
	}

	public String gettextReaderout(){
		return TextReader.textReaderout;
	}
}
