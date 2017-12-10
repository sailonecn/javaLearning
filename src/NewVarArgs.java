/**
 * Created by netli on 2017/10/22.
 */
public class NewVarArgs {


    static void  printArry(Object ... args)  {
        for (Object i : args) {
            System.out.println(i + " ");
        }
    }


    void printString(String ... str) {
        int i = 0;
        System.out.println("class : " + str.getClass());
        for (String s : str) {
            System.out.printf("%d %s\n", i++, s);

        }
    }
    public static void main(String[] args) {
        printArry(1,2,4);
        printArry("hello" , "world", "!");
        printArry((Object[]) new Integer[] { 11, 22, 33});//split to three elements.


        //printString("hello", "Java" , "!"); It's Wrong, because it's not static method.
        new NewVarArgs().printString("hello", "Java" , "!", Integer.toBinaryString(1));//or change the method  into static method.
    }



}
