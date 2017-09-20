/** Demonstration of a simple constructor.
*/

class Rock
{
    Rock()
    {
        System.out.println("New Rock.");
    }
}

class Rock2
{
    Rock2(int i)
    {
        System.out.println("Rock " + i + " initialize ..");
    }
}
public class SimpleConstructor
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 10 ; i ++)
        {
            new Rock();
        }

        for (int j = 0; j < 10; j ++)
        {
            new Rock2(j);
        }
    }
}