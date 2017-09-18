public class FieldTest
{
    int i;
    char ch;

    private void field()
    {
        //int i; //Wrong ! Must init for temp variable.
        //char ch;
        System.out.println("i:" + i + "\nch:"+ ch + "end");
    }

    public static void main(String args[])
    {
        FieldTest fTest = new FieldTest();
        fTest.field();
    }
}