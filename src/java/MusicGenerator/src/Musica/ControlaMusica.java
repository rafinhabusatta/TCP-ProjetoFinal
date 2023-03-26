package Musica;

import org.jfugue.player.Player;
import org.jfugue.pattern.Pattern;

<<<<<<< HEAD
public class ControlaMusica implements IControlaMusica {
    public Pattern TocaMusica(int bpm, int instrumento, String musicString) {

        Pattern pattern = new Pattern("T" + bpm + " I" + instrumento + " " + musicString); // Cria o pattern com a
                                                                                           // velocidade e instrumento
                                                                                           // definidos e adiciona a
                                                                                           // sequência de notas
=======

public class ControlaMusica implements IControlaMusica {
    public  Pattern TocaMusica(int bpm,int instrumento, String musicString) {

        Pattern pattern = new Pattern("T" + bpm + " I" + instrumento + " " + musicString); // Cria o pattern com a velocidade e instrumento definidos e adiciona a sequência de notas
>>>>>>> 0147756 (Adiciona Interfaces Para as Classes)
        Player player = new Player(); // Cria o objeto Player do JFugue para tocar o pattern
        player.play(pattern); // Toca o pattern usando o objeto Player

        return pattern;

    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 0147756 (Adiciona Interfaces Para as Classes)
