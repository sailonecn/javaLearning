
public class Cow {

    private double weight;
    public Cow(){}
    public Cow(double weight)
    {
        this.weight = weight;
    }

    private class CowLeg{
        private double length;
        private String color;

        public CowLeg(){}
        public CowLeg(double length, String color)
        {
            this.length = length;
            this.color  = color;
        }

        public void info()
        {
            System.out.println("the color of Cow: " + color + " Length: " + length);
            System.out.println("Weight: " + weight);
        }
    }

    public void test()
    {
        CowLeg cl = new CowLeg(1001.001, "Black");
        cl.info();
    }

    public static void main(String[] args)
    {
        Cow cow = new Cow(101.23);
        cow.test();
    }
}