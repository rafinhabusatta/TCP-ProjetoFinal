package Texto;

import Constantes.Constantes;

public  class DecodificaTexto implements IDecodificaTexto {

    private int numeroInstrumento = Constantes.INSTRUMENTO_PADRAO;
    private int oitavaAtual = Constantes.OITAVA_PADRAO;
    private int volumeAtual = Constantes.VOLUME_PADRAO;

    public String processaTexto( String textoMusical){
        StringBuilder resultado = new StringBuilder();
        for(int i = 0; i < textoMusical.length(); i++) {
            char letra = textoMusical.charAt(i);
            char letraAnterior = ' ';
            if (ehNota(letra))
                resultado.append(qualNota(letra));
            else if (ehNotaMinuscula(letra) || ehConsoante(letra)) {
                if(i!=0)
                 letraAnterior = textoMusical.charAt(i-1);
                if (ehNota(letraAnterior))
                    resultado.append(qualNota(letraAnterior));
                else
                    resultado.append(" r");
            } else if (letra == ' ') {
                if (this.volumeAtual * 2 > Constantes.VOLUME_MAXIMO) {
                    this.volumeAtual = 60;
                } else
                    this.volumeAtual = this.volumeAtual * 2;
            } else if (letra == '!')
                resultado.append("I[Agogo] ");
            else if (ehVogal(letra))
                resultado.append("I[HARPISCHORD] ");
            else if (Character.isDigit(letra)) {
                numeroInstrumento += Character.getNumericValue(letra);
                String instrumento = "I[" + numeroInstrumento + "] ";
                resultado.append(instrumento);
            } else if (letra == '?') {
                if ((this.oitavaAtual + 1) > Constantes.OITAVA_MAXIMA)
                    this.oitavaAtual = 5;
                else
                    this.oitavaAtual++;

            } else if (letra == '\n')
                resultado.append("I[TUBULAR_BELLS] ");
            else if (letra == ';')
                resultado.append("I[PAN_FLUTE] ");
            else if (letra == ',')
                resultado.append("I[CHURCH_ORGAN] ");
            else {
                if (ehNota(letraAnterior))
                    resultado.append(qualNota(letraAnterior));
                else
                    resultado.append("  ");
            }
        }

        return resultado.toString();
    }

    public boolean ehConsoante(char letra){
        if(letra == 'H' || letra == 'h')
            return true;
        else if(letra == 'J' || letra == 'j')
            return true;
        else if(letra == 'K' || letra == 'k')
            return true;
        else if(letra == 'L' || letra == 'l')
            return true;
        else if(letra == 'M' || letra == 'm')
            return true;
        else if(letra == 'N' || letra == 'n')
            return true;
        else if(letra == 'P' || letra == 'p')
            return true;
        else if(letra == 'Q' || letra == 'q')
            return true;
        else if(letra == 'R' || letra == 'r')
            return true;
        else if(letra == 'S' || letra == 's')
            return true;
        else if(letra == 'T' || letra == 't')
            return true;
        else if(letra == 'V' || letra == 'v')
            return true;
        else if(letra == 'W' || letra == 'w')
            return true;
        else if(letra == 'X' || letra == 'x')
            return true;
        else if(letra == 'Y' || letra == 'y')
            return true;
        else return letra == 'Z' || letra == 'z';
    }

    public boolean ehNota(char letra){
        if(letra == 'A')
            return true;
        else if(letra == 'B')
            return true;
        else if(letra == 'C')
            return true;
        else if(letra == 'D')
            return true;
        else if(letra == 'E')
            return true;
        else if(letra == 'F')
            return true;
        else return letra == 'G';
    }

    public boolean ehNotaMinuscula(char letra){
        if(letra == 'a')
            return true;
        else if(letra == 'b')
            return true;
        else if(letra == 'c')
            return true;
        else if(letra == 'd')
            return true;
        else if(letra == 'e')
            return true;
        else if(letra == 'f')
            return true;
        else return letra == 'g';
    }

    public boolean ehVogal(char letra){
        if(letra == 'I' || letra == 'i')
            return true;
        else if(letra == 'O' || letra == 'o')
            return true;
        else return letra == 'U' || letra == 'u';
    }

    public String qualNota(char letra){
        if(letra == 'A')
            return "A" + this.oitavaAtual + "a" + this.volumeAtual + " ";
        else if(letra == 'B')
            return "B" + this.oitavaAtual + "a" + this.volumeAtual + " ";
        else if(letra == 'C')
            return "C" + this.oitavaAtual + "a" + this.volumeAtual + " ";
        else if(letra == 'D')
            return "D" + this.oitavaAtual + "a" + this.volumeAtual + " ";
        else if(letra == 'E')
            return "E" + this.oitavaAtual + "a" + this.volumeAtual + " ";
        else if(letra == 'F')
            return "F" + this.oitavaAtual + "a" + this.volumeAtual + " ";
        else
            return "G" + this.oitavaAtual + "a" + this.volumeAtual + " ";
    }

}
