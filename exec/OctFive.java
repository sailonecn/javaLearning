//Oct_Five.java  


class OctFive
{
    public static void main(String[] args)
    {
        
        new ThisExec().MainCall();



    }
}

class ThisExec
{
    void PrintOne()
    {
        System.out.println("PrintOne called.");
    }

    void MainCall()
    {
        PrintOne();
        System.out.println("called by this:");
        this.PrintOne();// it is not allowed normally in this way.
    }
}


class MyConstr
{
    MyConstr()
    {
        System.out.println("the constructor is called.");
    }

    void simpleCall()
    {
        System.out.println("Normally Called.");
    }
}

