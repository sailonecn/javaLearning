//Demonstration of both Constructor and ordinary Method overloading

class Tree
{
    int height;
    Tree()
    {
        System.out.println("default initialize...");
        height = 0;
    }

    Tree(int h)
    {
        System.out.println("initialize "+ h);
        height = h;
    }
}
public class FiveOverloading
{
    public static void main(String[] args)
    {
        Tree tr = new Tree();
        Tree tr2 = new Tree(2);
    }
}