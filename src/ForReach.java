/**
 * Created by netli on 2017/10/18.
 */

import java.util.*;

public class ForReach {

    public static void main(String[] args){

        Random rand = new Random(47);
        float f[];
        f = new float[10];

        for (int i = 0; i < 10; i ++)
            f[i] = rand.nextFloat();

        for (float x : f
             ) {
            System.out.println(x);

        }

        for (char c : "Hello Java !".toCharArray()
             ) {
            System.out.println(c);
        }
    }
}
