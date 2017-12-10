
/**
 * variable access: local > inner class > outer class
 */

public class DiscernVariable
{
    private String prop = "Outer Value";
    private String outerprivate = "outerprivate";
    public class InClass
    {
        String prop = "Inclass Value";
        public void info()
        {
            String prop = "Value";
            System.out.println("Outer:" + DiscernVariable.this.prop);
            System.out.println("Inclass:" + this.prop);
            System.out.println("Local:" + prop);
            System.out.println("OOO:" + outerprivate);
        }
    }

    public void test()
    {
        InClass inc = new InClass();
        inc.info();
    }

    public static void main(String[] args)
    {
        new DiscernVariable().test();
    }
    
static class TestLN{
    void nothing(){}
}
}

