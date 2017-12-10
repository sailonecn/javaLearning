

public class DotThis
{
    void f()
    {
        System.out.println("DotThis.f().");
    }
    public class Inner
    {
        public DotThis outer()
        {
            return DotThis.this;//return outer class object
        }
        public Inner inter()
        {
            return this;//return inner class object
        }
        void f()
        {
            System.out.println("inner class print.");
        }
    }

    public Inner inner()
    {
        return new Inner();
    }

    public static void main(String[] args)
    {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
        System.out.println("-------");
        dti.inter().f();
    }
}