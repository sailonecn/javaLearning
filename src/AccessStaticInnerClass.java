
public class AccessStaticInnerClass
{
    AccessStaticInnerClass()
    {
        System.out.println("AccessStaticInnerClass initializing.");
    }
    {
        System.out.println("Local Code Block initialing.");
    }
    static class StaticInnerClass
    {
        StaticInnerClass()
        {
            System.out.println("StaticInnerClass init.");
        }
        private static int prop1 = 5;
        private int prop2 = 6;
    }

    public void accessInnerProp()
    {
        //System.out.println(prop1);
        //System.out.println(prop2);
        System.out.println(StaticInnerClass.prop1);
        System.out.println(new StaticInnerClass().prop2);
    }

    public static void test()
    {
        System.out.println("test() initializing.");
        System.out.println(StaticInnerClass.prop1);
        System.out.println(new StaticInnerClass().prop2);
    }

    public static void main(String[] args)
    {
        System.out.println("main fuction begin....");
        new AccessStaticInnerClass().accessInnerProp();
    }
}