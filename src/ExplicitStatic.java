/**
 * Created by netli on 2017/10/22.
 */
public class ExplicitStatic {
    static Cup myCup = new Cup();
    public static void main(String[] args) {
        System.out.println("Main execute.");
        Cup.run();
        System.out.println();
        new Phone();
    }
}

class Cup {
    static String cupName = "Mug";
    static String cupProductionPlace;
    static {
        cupProductionPlace = "China";
        System.out.println("ExplicitStatic act.");
    }

    static void run(){
        System.out.print("cupName: " + cupName + "\nPlace " + cupProductionPlace);
    }
}


class Phone {
    String p1;
    String p2;
    {
        p1 = "Apple";
        p2 = "Google";
    }

    Phone()
    {
        System.out.printf("Constructioner execute ! p1 %s p2 %s", p1, p2);
    }
}

