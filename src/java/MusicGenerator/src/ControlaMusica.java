import org.jfugue.player.Player;

class ControlaMusica {
    public static void main(String[] args) {
        String musicString = "C D E F G A B";
        int bpm = 120;
        int instrumento = 24; // o valor padrão é 0, que é um piano

        Player player = new Player();
        player.play("T" + bpm + " I" + instrumento + " " + musicString);
    }
}

