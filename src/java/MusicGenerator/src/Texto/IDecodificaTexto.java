package Texto;

public interface IDecodificaTexto {

     String processaTexto(String textoMusical);

     boolean ehConsoante(char letra);

     boolean ehNota(char letra);

     boolean ehNotaMinuscula(char letra);

     boolean ehVogal(char letra);

     String qualNota(char letra);

}
