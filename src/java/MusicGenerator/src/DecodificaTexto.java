
public class DecodificaTexto {

    private int numeroInstrumento = 0;
    private int oitavaAtual = 5;
    private int volumeAtual = 60;

    private final int oitavaMaxima = 10;
    private final int volumeMaximo = 127;

    private String textoMusical;

    public DecodificaTexto(String textoMusical) {
        this.textoMusical = textoMusical;
    }

    public void setTextoMusical(String textoMusical) {
        this.textoMusical = textoMusical;
    }

    public String processaTexto(){
        String resultado = "";
        for(int i = 0; i < textoMusical.length(); i++){
            string letra = textoMusical.charAt(i);
            if(ehNota(letra))
                resultado.append(qualNota(letra));
            else if(ehNotaMinuscula(letra) || ehConsoante(letra)){
                string letraAnterior = textoMusical.charAt(i-1);
                if(ehNota(letraAnterior))
                    resultado.append(qualNota(letraAnterior));
                else
                    resultado.append("  ");
            }
            else if(letra == ' ') {
                if(this.volume_Atual*2 > volumeMaximo) {
                    this.volumeAtual = 60;
                }
                else
                    this.volumeAtual = this.volumeAtual * 2;
            }
            else if(letra == '!')
                result.append("I[Agogo] ");
            else if(ehVogal(letra))
                resultado.append("I[HARPISCHORD] ");         
            else if(Character.isDigit(letra)){
                numeroInstrumento += Character.getNumericValue(letra);
                String instrumento = "I["+numeroInstrumento +"] ";
                resultado.append(instrumento);
            }
            else if(letra == '?'){
                if((this.oitavaAtua + 1) > this.oitavaMaxima)
                    this.oitavaAtual = 5;
                else
                    this.oitavaAtual++;

            }
            else if(letra == '\n')
                resultado.append("I[TUBULAR_BELLS] ");
            else if(letra == ';')
                resultado.append("I[PAN_FLUTE] ");
            else if(letra == ',')
                resultado.append("I[CHURCH_ORGAN] ");
            else{
                if(ehNota(letraAnterior))
                    resultado.append(qualNota(letraAnterior));
                else
                    resultado.append("  ");
            }   
        }

        return result;
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
        else if(letra == 'Z' || letra == 'z')
            return true;
        else
            return false;
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
        else if(letra == 'G')
            return true;
        else
            return false;
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
        else if(letra == 'g')
            return true;
        else
            return false;
    }

    public boolean ehVogal(char letra){
        if(letra == 'I' || letra == 'i')
            return true;
        else if(letra == 'O' || letra == 'o')
            return true;
        else if(letra == 'U' || letra == 'u')
            return true;
        else
            return false;
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
