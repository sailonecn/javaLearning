/**
 * Created by netli on 2017/10/16.
 */
public class Literals {
    public static void main(String[] args) {

        DecimalSystem fruit = new DecimalSystem();

        fruit.run();
        fruit.operLong();

        new Exponents().run();


    }
}

class DecimalSystem {
    void run() {
        int i = 0x9;
        float j = 0x9;
        double k = 0x9d;//d is part of the 0x9d , not double symbols
        double k1 = 0x9;
        double k2 = 9d;//d is the symbol of the Double .
        System.out.println("i value " + i);
        System.out.println("j value " + j);
        System.out.println("k value " + k);
        System.out.println("k1 value " + k1);
        System.out.println("k2 value " + k2);
    }
    void operLong() {
        long apple = 0x12;
        System.out.println("apple =  " + apple + " Binary:" + Long.toBinaryString(apple));

        apple = 07;
        System.out.println("apple = " + apple + " Binary:" + Long.toBinaryString(apple));
    }
}

class Exponents
{
    void run() {
        float f1 = 200;
        float f2 = 1e-43f;//: if the f is lost ,it will be error.

        System.out.println("hello " + f1 + f2);
    }
}
