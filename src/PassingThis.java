//PassingThis.java

/**
* a person with eat function.
*/
class Person
{
    public void eat(Apple apple)
    {
        Apple peeled = apple.getPeeled();// auto peel.
        System.out.println("Yummy");
    }
}
/**
* a peeler with removing the peel of apple.
*/
class Peeler
{
    static Apple peel(Apple apple)
    {
        System.out.println("remove the peel .");
        return apple;
    }
}

/**
* a apple can be peeled.
*/
class Apple
{
    Apple getPeeled()
    {
        return Peeler.peel(this);
    }
}

/**
* public class.
*/
public class PassingThis
{
    public static void main(String[] args)
    {
        new Person().eat(new Apple());
    }
}