package RRusing;

/**
 * Created by netli on 2017/11/5.
 */
import static net.mindview.util.Print.*;

class Amphibian {
    Amphibian() {
        print("Amphibian Constructor.");
    }

    static void move(Amphibian amp) {
        print("Amphibian moving ");
    }
}

public class Frogh extends Amphibian {

    public static void main(String[] args) {
        Frogh frog = new Frogh();
        Amphibian.move(frog);
    }

    static void move(Frogh f) {
        print("frog is moving.");
    }
}
