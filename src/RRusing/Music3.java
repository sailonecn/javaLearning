package RRusing;

/**
 * Created by netli on 2017/11/8.
 */

import java.util.Random;

import static net.mindview.util.Print.*;

class Instrument {
    void play(NOTE n) {
        print("Instrument.play() " + n);

        print("toSting " + new Instrument());
    }
    String what() {
        return "Instrument";
    }
    void adjust() {
        print("Adjusting Instrument.");
    }
    public String toString() {
        return "Instrument";
    }
}

class Wind extends Instrument {
    void play (NOTE n) {
        print("Wind.play() " + n);
    }
    String what() {
        return "Wind";
    }
    void adjust() {
        print("Adjusting Wind.");
    }
}

class Percussion extends Instrument {
    void play(NOTE n) {
        print("Percussion.play()" + n);
    }
    String what() {
        return "Percussion";
    }
    void adjust() {
        print("Adjusting Percussion.");
    }
}

class Brass extends Wind {
    void play(NOTE n) {
        print("Brass.play()" +n);
    }
    void adjust() {
        print("Adjusting Brass.");
    }
}

 class RandomInst {
    private Random rand = new Random();
    public Instrument next() {
        switch(rand.nextInt(3)) {
            case 0: return new Instrument();
            case 1: return new Wind();
            case 2: return new Percussion();
            case 3: return new Brass();
            default:
                print("nothing create.");
                return null;
        }
    }
 }



public class Music3 {

    private static RandomInst inst = new RandomInst();

    public static void tune(Instrument i) {
        i.play(NOTE.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
            new Instrument(),
                new Wind(),
                new Percussion(),
                new Brass(),
        };
        print("Array length: " + orchestra.length);

        tuneAll(orchestra);

        System.out.println(orchestra[0]);

        print("-----");
        Instrument[]  superOrch = new Instrument[20];
        for (int i = 0; i < 20 ; i++) {
            superOrch[i] = inst.next();
            print("-" + superOrch[i]);
        }
    }
}
