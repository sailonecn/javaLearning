
abstract class Device
{
    private String name;
    public abstract double getPrice();
    public Device(){};
    public Device(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return "Unknown";
    }
}

public class AnonymousInner
{
    public void test(Device d)
    {
        System.out.println("Buy : " + d.getName() + "Pay: " + d.getPrice());
    }

    public static void main(String[] args)
    {
        AnonymousInner ai = new AnonymousInner();
        ai.test(new Device("A")
        {
            public double getPrice()
            {
                return 67.8;
            }
        });

        Device d = new Device(){
            {
                System.out.println("initialize.");
            }

            public double getPrice()
            {
                return 100.001;
            }

            public String getName()
            {
                return "hehee";
            }
        };

        ai.test(d);

        AnonymousInner.AnonymousProduct aoi = new AnonymousInner().new AnonymousProduct();
        aoi.AnonymousProductMain(aoi);
    }

    interface Product
    {
        public double getPrice();
        public String getName();
    }

    class AnonymousProduct
    {
        public void test(Product p)
        {
            System.out.println("BUY : " + p.getName() + " PAY: " + p.getPrice());
        }
        public void AnonymousProductMain(AnonymousProduct ai)
        {
            ai.test(new Product()
            {
                public double getPrice()
                {
                    return 111.111;
                }
                public String getName()
                {
                    return "PRODUCT";
                }
            });

        }
    }
}

