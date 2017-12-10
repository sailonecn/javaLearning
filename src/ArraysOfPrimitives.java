/**
 * Created by netli on 2017/10/22.
 */
public class ArraysOfPrimitives {

    public static void main(String[] args) {
        int a1[] = { 1, 2, 3, 4};
        int[] a2 = a1;
        for (int i = 0; i < a2.length; i ++) {
            a2[i] = 10;
            System.out.println("a1[" + i + "] = " + a1[i]);
        }

        int i = 10;
        int i_length = ((Integer)i).toString().length();
        System.out.println("Length of i : " + i_length);

    }
}
