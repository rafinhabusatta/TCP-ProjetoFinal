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

        String filePath = args[0];
        TextReader text = new TextReader(filePath);
        Path fileName = Paths.get(filePath);
        text.readText();

        System.out.print(text.getUserText());

        ControlaMusica musica = new ControlaMusica();
        ControlaArquivo arquivo = new ControlaArquivo();
        DecodificaTexto texto = new DecodificaTexto();

        int BPM = Constantes.BPM_PADRAO;

        int Instrumento = Integer.parseInt(args[1]);

        String textoDecodificado = texto.processaTexto(text.getUserText());

        System.out.println(textoDecodificado);

        Pattern pattern = musica.TocaMusica(BPM, Instrumento, textoDecodificado);

        // arquivo.SalvarArquivo(pattern);
    }
}