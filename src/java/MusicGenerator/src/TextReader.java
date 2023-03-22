import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextReader {

	private String userText;

	public TextReader() {
		this.userText = "";
	}

	public TextReader(String userText) {
		this.userText = userText;
	}

	public void readText() throws IOException {
		Path fileName = Path.of("../../../text/soundcraft.txt");
		this.userText = Files.readString(fileName);
	}

	public String getUserText() {
		return this.userText;
	}
}
