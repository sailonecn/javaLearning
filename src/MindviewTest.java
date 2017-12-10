/**
 * Created by netli on 2017/10/25.
 */

import static net.mindview.util.Print.*;

public class MindviewTest {
    public static void main(String[] args) {
        print("hello net jar.!");
        Bath bath1 = new Bath();
        Bath bath2 = new Bath();
        print(bath1);

    }
}


class Soap {
    private String s;
    Soap() {
        print("Soap !");
        s = "Constructed.";
    }
    public String toString() {
        return s;
    }
}

class Bath {
    private String s1 = "happy", s2 = "happy", s3, s4;
    private Soap castille;
    private static int i;
    private float toy;
    public Bath() {
        print("Inside Bath()");
        s3 = "toy";
        toy = 3.14f;
        castille = new Soap();

    }

    //instance initialization
    {
        i = 47;
        print("initialize the value of i.");
    }

    //execute it first and only once, then execute the front code block.
    static {
        i = 20;
        print("explicit static initialize.");
    }

    public String toString() {
        if (s4 == null)
            s4 = "toy";
        return
                "s1 = " + s1 + "\n" +
                        "s2 = " + s2 + "\n" +
                        "s3 = " + s3 + "\n" +
                        "s4 = " + s4 + "\n" +
                        "i = " + i + "\n" +
                        "toy = " + toy + "\n" +
                        "castille = " + castille;
    }

}