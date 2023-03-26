package Teste;

import Texto.DecodificaTexto;
import org.junit.Assert;
import org.junit.Test;

public class TestProcessaTexto {

    @Test
    public void testProcessaTexto() {
        DecodificaTexto texto = new DecodificaTexto();

        String textoMusical = "C D E F Ga A B ??  !C D E F Ga A B";
        String resultadoEsperado = "C5a60 D5a120 E5a60 F5a120 G5a60 G5a60 A5a120 B5a60 I[Agogo] C7a120 D7a60 E7a120 F7a60 G7a120 G7a120 A7a60 B7a120 ";
        String resultadoObtido = texto.processaTexto(textoMusical);
        Assert.assertEquals(resultadoEsperado, resultadoObtido);
    }
}