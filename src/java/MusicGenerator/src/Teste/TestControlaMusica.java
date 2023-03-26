package Teste;

import Musica.ControlaMusica;
import org.jfugue.pattern.Pattern;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestControlaMusica {

    @Test
    public void testTocaMusica() {
        ControlaMusica controlaMusica = new ControlaMusica();
        int bpm = 120;
        int instrumento = 0;
        String musicString = "C D E F G A B";
        String stringEsperada = "T120 I0 C D E F G A B";

        Pattern pattern = controlaMusica.TocaMusica(bpm, instrumento, musicString);
        String textoDoPattern = pattern.toString();

        assertEquals(stringEsperada, textoDoPattern);
    }
}