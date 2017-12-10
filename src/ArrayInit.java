/**
 * Created by netli on 2017/10/22.
 */

import java.util.*;

public class ArrayInit {

    public static void main(String[] args) {
        Integer[] a = {
                1,
                2,
                3,
        };

        Integer[] b = new Integer[]{1, 2, 3};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        String[] str = new String[] { "hello", "world", "!"};
        for (String s : str) {
            System.out.println( s + " ");
        }

        Exec17[] myexec;
        System.out.println("Begin init...");
        myexec = new Exec17[] {new Exec17("1"), new Exec17("2")};
    }


}



class Exec17 {
    Exec17() {
        System.out.println("Default init..");
    }
    Exec17(String input) {
        System.out.println("input var :" + input);
    }
}
