/** 5.1 exercise 1
*/


class Test1
{
    String str;
}

class Test2
{
    String str1;
    String str2 = "HELLO";
    String str3;
    public void apple()
    {
        str3 = "hello world";
    } 
}
class FiveOne
{   
    public static void main(String[] args)
    {
       Test1 tst = new Test1();
       System.out.println(tst.str);

       Test2 tst2 = new Test2();
       System.out.println(tst2.str1);
       System.out.println(tst2.str2);
       System.out.println(tst2.str3);
       tst2.apple();
       System.out.println(tst2.str3);

       String myString = new String();
       myString = "hahaa";
       myString = "hehe";
       System.out.println(myString);

    }
}
