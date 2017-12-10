/**
 * Created by netli on 2017/11/5.
 * Inheritance & upcasting.
 */

class Instrument {
    public void play(){
        System.out.println("Playing.");
    }
    static void tune(Instrument i) {
        i.play();
    }
}

public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind wind = new Wind();
        try {
            Instrument.tune(wind);
        } finally {
            wind.dispose();
        }
    }

    private void dispose() {
        System.out.println("clean...");
    }
}
