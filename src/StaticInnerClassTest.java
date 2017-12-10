
/**
 * the static inner class can use the static var in outer class
*/

public class StaticInnerClassTest
{
    private int prop1= 5;
    private static int prop2 = 6;
    static class StaticInnerClass
    {
        private static int age;
        public void accessOuterProp()
        {
            System.out.println(prop1);//cannot
            System.out.println(prop2);
        }
    }

}
