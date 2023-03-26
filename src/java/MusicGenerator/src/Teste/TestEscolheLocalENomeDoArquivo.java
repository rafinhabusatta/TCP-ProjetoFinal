package Teste;

import Arquivo.ControlaArquivo;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestEscolheLocalENomeDoArquivo{

    @Test
    public void testEscolheLocalENomeDoArquivo() {
        ControlaArquivo arquivo = new ControlaArquivo();

        String caminhoArquivo = arquivo.EscolheLocalENomeDoArquivo();

        assertNotNull(caminhoArquivo);
        assertTrue(caminhoArquivo.endsWith(".mid"));
    }

}