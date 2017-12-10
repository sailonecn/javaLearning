/* IfElse.java
 * Using the primary procedure to practice the Java Condition Control.
 */


public class IfElse{

    public static void main(String[] args){
        System.out.println("the program is running ...");

        new IfElse().foolExe();

        new WhileTest().run();

    }


    static void foolExe(){

        int a = 1;
        int b = 2;
        if (a > b)
            System.out.println("" + a + " > " + b);
        else if (a < b)
            System.out.println("" + a + " > " + b);
        else
            System.out.println("" + a + " > " + b);

    /* format Output. */
        System.out.printf("a = %d.", a);
        System.out.format("b = %d.", b);
    }
}


class WhileTest{
    static boolean condition(){
        double num = Math.random();
        System.out.println("num = " + num);
        boolean result = num < 0.99;
        System.out.println(result + ",");
        return result;
    }

    static void run(){
        while(condition()){
            System.out.println("Not found.");
        }
        System.out.println("exit...");
    }
}