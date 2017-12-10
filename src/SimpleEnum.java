/**
 * Created by netli on 2017/10/23.
 */
public class SimpleEnum {

    public static void main(String[] args) {
        Spiciness howHot = Spiciness.MEDIUM;
        System.out.println("howHot " + howHot + howHot.toString());

        for ( Spiciness s : Spiciness.values()) {
            System.out.println(s + ", ordinal " + s.ordinal());
        }
    }

}
