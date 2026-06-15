package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {

    public static void main(String[] args) {

        // Part A
        Veena veena = new Veena();
        veena.play();

        // Part B
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        // Part C
        Playable instrument;

        instrument = new Veena();
        instrument.play();

        instrument = new Saxophone();
        instrument.play();
    }
}
