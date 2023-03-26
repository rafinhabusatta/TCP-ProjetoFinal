package Arquivo;

import org.jfugue.pattern.Pattern;

public interface IControlaArquivo {

    String EscolheLocalENomeDoArquivo();

    void SalvarArquivo(Pattern pattern);

}
