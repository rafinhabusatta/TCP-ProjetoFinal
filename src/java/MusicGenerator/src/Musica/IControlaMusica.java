package Musica;

import org.jfugue.pattern.Pattern;

public interface IControlaMusica {

    Pattern TocaMusica(int bpm, int instrumento, String musicString);
}