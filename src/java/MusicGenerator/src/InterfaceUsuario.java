public class InterfaceUsuario {
    constructor() {
        this.musicGenerator = new MusicGenerator(new Instrument());
    }

    setText(text) {
        this.text = text;
    }

    setInstrument(instrument) {
        this.musicGenerator.instrument = instrument;
    }

    generateMusic() {
        const music = this.musicGenerator.generateMusic(this.text);
        // reproduz a música
    }
}
