public class MusicGenerator {
    function constructor(instrument) {
        this.instrument = instrument;
    }

    generateMusic(text) {
        const notes = TextReader.parse(text);
        const music = [];

        for (let note of notes) {
            const sound = this.instrument.getSound(note);
            music.push(sound);
        }

        return music;
    }
}
