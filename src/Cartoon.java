/**
 * Created by netli on 2017/10/31.
 */

import static net.mindview.util.Print.*;

class Art {
    Art() {
        print("Art constructor.");
    }
}

class Drawing extends Art {
    Drawing() {
        print("Drawing constructor.");
    }
}

public class Cartoon extends Drawing {
    /*if not define the constructor manually, the Base-Class Constructor will always be called.
    public Cartoon() {
        print("Cartoon Constructor.");
    }
    */
    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
