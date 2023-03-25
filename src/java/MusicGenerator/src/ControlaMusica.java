import org.jfugue.player.Player;
import org.jfugue.pattern.Pattern;
import java.io.File;
import org.jfugue.midi.MidiFileManager;


public class ControlaMusica extends SalvarArquivo{
    public static void main(String[] args) {
        String musicString = "A5a63 A5a110 A5a127 A5a40 A5a70 ";
        int bpm = 120; // Define o andamento da música em batidas por minuto
        int instrumento = 0; // Define o instrumento utilizado para tocar a música. Neste caso, o valor 24 representa um violão nylon.

        Pattern pattern = new Pattern("T" + bpm + " I" + instrumento + " " + musicString); // Cria o pattern com a velocidade e instrumento definidos e adiciona a sequência de notas
        Player player = new Player(); // Cria o objeto Player do JFugue para tocar o pattern
        player.play(pattern); // Toca o pattern usando o objeto Player

        try {
            // Tenta salvar o pattern em um arquivo MIDI
            File midiFile = new File(EscolheLocaleNomedoArquivo()); // Cria um objeto File com o nome do arquivo MIDI a ser salvo 
            MidiFileManager.savePatternToMidi(pattern, midiFile); // Salva o pattern em um arquivo MIDI usando a classe MidiFileManager do JFugue
            System.out.println("Padrão salvo com sucesso em um arquivo MIDI."); // Imprime uma mensagem de sucesso no console se o pattern for salvo corretamente
        } catch (Exception e) {
            System.out.println("Erro ao salvar padrão em arquivo MIDI: " + e.getMessage()); // Imprime uma mensagem de erro no console se ocorrer algum problema durante o processo de salvamento
        }


    }
}
