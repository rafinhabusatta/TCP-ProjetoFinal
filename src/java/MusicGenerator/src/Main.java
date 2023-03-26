import org.jfugue.pattern.Pattern;
import Musica.ControlaMusica;
import Arquivo.ControlaArquivo;
import Texto.DecodificaTexto;
import Constantes.Constantes;

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

        String filePath =  args[0]; // "E:/Users/rafab/Documentos/UFRGS/2022-2/Tcp/TabalhoPratico/src/text/soundcraft.txt";
        TextReader text = new TextReader(filePath);
        text.readText();

        System.out.print("Texto do usuário retirado do arquivo ");
        System.out.println(text.getUserText()+'\n');

        ControlaMusica musica = new ControlaMusica();

        ControlaArquivo arquivo = new ControlaArquivo();

        DecodificaTexto texto = new DecodificaTexto();

        int BPM = Constantes.BPM_PADRAO;

        int Instrumento = Integer.parseInt(args[1]);

        String textoDecodificado = texto.processaTexto(text.getUserText());

        System.out.print("Texto decodificado: ");
        System.out.println(textoDecodificado);

        Pattern pattern = musica.TocaMusica(BPM, Instrumento, textoDecodificado);

        arquivo.SalvarArquivo(pattern);
    }
}