/**
 * Created by netli on 2017/10/31.
 */
import static net.mindview.util.Print.*;


class Cleanser {
    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()");}
    public void apply() {append(" apply");}
    public void scrub() { append(" scrub()");}
    public String toString() { return s;}

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute(); x.apply(); x.scrub();
        print(x);
    }
}

public class Detergent extends Cleanser{

    //change a method
    public void scrub() {
        append(" Detergent.scrub()");
        //print("get in");
        super.scrub();//parent method
        //this.scrub();// it will cause "StackOverflowError"
    }

    //add  a method to the interface
    public void foam() {
        append(" foam()");
    }

    //test new class
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        print(x);
        print("parent class exec...");
        Cleanser.main(args);
    }

}

class Exec2 extends Detergent {
    public void scrub() {
        append(" Exec2.scrub()");
        super.scrub();
    }

    public void sterilize() {
        append(" sterilize()");

    }

    public static void main(String[] args) {
        Exec2 x = new  Exec2();
        print("hello");
        x.scrub();
        x.sterilize();
        print(x);
        Detergent.main(args);
    }
}
