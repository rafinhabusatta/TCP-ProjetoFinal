import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextReader {

	private String userText;
	private String filePath;

	public TextReader() {
		//this.userText = "";
		this.filePath = "";
	}

	public TextReader(String filePath) {
		//this.userText = userText;
		this.filePath = filePath;
	}

	public void readText() throws IOException {
		Path fileName = Path.of(this.filePath);
		this.userText = Files.readString(fileName);
	}

	public String getUserText() {
		return this.userText;
	}
}
