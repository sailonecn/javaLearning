/**
 * Created by netli on 2017/10/18.
 */
public class LableFor {

    public static void main(String[] args){

        int i = 0, j = 0;

        outer:
        for ( ;true; System.out.println("hello")){
            System.out.println("i = " + i);
            j++;
            //if (j == 20)
               // break;

            inner:
            for(; i < 10; i++,System.out.println("come in")){
                System.out.println(i);
                if (i == 1)
                    continue;//it will do i++ and do the judgement.
                else if (i == 2) {
                    i++;//Otherwise the i will never get increment.
                    System.out.println("hahahha");
                    break;//it will break the inner loop.
                }
                else if ( i == 3) {
                    i++;//Otherwise the i will never get increment.
                    continue outer;//it wil print hello and do the judgement.
                }
                else if (i == 4)
                    break outer;//it will break the outer loop and exit.


            }
        }

        System.out.println("  i = " +  i);
    }
}
