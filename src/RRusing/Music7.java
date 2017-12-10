package RRusing;

/**
 * Created by netli on 2017/11/8.
 */
import static net.mindview.util.Print.*;

class Instrument7 {
    void play(NOTE n) { print("Instrument7.play() " + n); }
    public String toString() { return "Instrument7"; }
    void adjust() { print("Adjusting Instrument7"); }
}

class Wind7 extends Instrument7 {
    void play(NOTE n) { print("Wind7.play() " + n); }
    public String toString() { return "Wind7"; }
    void adjust() { print("Adjusting Wind7"); }
}

class Percussion7 extends Instrument7 {
    void play(NOTE n) { print("Percussion7.play() " + n); }
    public String toString() { return "Percussion7"; }
    void adjust() { print("Adjusting Percussion7"); }
}

class Stringed extends Instrument7 {
    void play(NOTE n) { print("Stringed.play() " + n); }
    public String toString() { return "Stringed"; }
    void adjust() { print("Adjusting Stringed"); }
}

class Keyboard extends Instrument7 {
    void play(NOTE n) { print("Keyboard.play() " + n); }
    public String toString() { return "Keyboard"; }
    void adjust() { print("Adjusting Keyboard"); }
}

class Brass7 extends Wind7 {
    void play(NOTE n) { print("Brass7.play() " + n); }
    public String toString() { return "Brass7"; }
    void adjust() { print("Adjusting Brass7"); }
}

class Woodwind extends Wind7 {
    void play(NOTE n) { print("Woodwind.play() " + n); }
    public String toString() { return "Woodwind"; }
}

class Piano extends Keyboard {
    void play(NOTE n) { print("Piano.play() " + n); }
    public String toString() { return "Piano"; }
}

public class Music7 {
    // Doesn't care about type, so new types
    // added to the system still work right:
    public static void tune(Instrument7 i) {
        //...
        i.play(NOTE.MIDDLE_C);
    }
    public static void tuneAll(Instrument7[] e) {
        for(Instrument7 i : e)
            tune(i);
    }
    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument7[] orchestra = {
                new Wind7(),
                new Percussion7(),
                new Stringed(),
                new Brass7(),
                new Woodwind(),
                new Piano()
        };
        tuneAll(orchestra);
        for(Instrument7 i : orchestra)
            System.out.println(i);
    }
}