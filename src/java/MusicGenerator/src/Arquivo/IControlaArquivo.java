package Arquivo;

import org.jfugue.pattern.Pattern;

public interface IControlaArquivo {

    String EscolheLocalENomedoArquivo();

    void SalvarArquivo(Pattern pattern);

}
