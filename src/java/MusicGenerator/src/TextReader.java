import	java.io.File;
import	java.io.FileNotFoundException;
import	java.util.Scanner;

public class TextReader	{
	public static void main(String[] args) throws FileNotFoundException	{
		//File file = new File("C:\Users\rsb_\TCP\TCP-ProjetoFinal\src\java\MusicGenerator\src\textodeteste.txt");
		File file = new File("teste.txt");
		Scanner scan = new Scanner(file);
		while(scan.hasNextLine()){
			System.out.println(scan.nextLine());
			}
			scan.close();
		}
}