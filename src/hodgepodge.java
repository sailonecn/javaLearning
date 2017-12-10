/**
 * Created by netli on 2017/10/18.
 * some exercises in Think in Java
 */
public class hodgepodge {

    public static void main(String[] args){

        new Person().eat(new Apple());

        new House();

        int i=10 , j = 10;
        System.out.println(""+ i +" "+ j);


        new SimpleStringFlex("hello", "world", "!");
        new SimpleStringFlex(new String[] {"HELLO", "WORLD", "!"});
        new StringFlex(new String[] {"a", "b"}, new String[] {"c", "d"});

    }
}


class Person{
    void eat(Apple apple){
        Apple peeled = apple.getPeeled();
        System.out.println("Eat finish!");
    }
}

class Apple{
    Apple getPeeled(){
        return new Peeler().peel(this);//if delete the keyword "new", Must add static before Apple peel();
    }
}

class Peeler{
     Apple peel(Apple apple){
        System.out.println("peel finish.");
        return apple;
    }
}

class MethodInit{
    int i  = 10 ;
    int j  = f(i);

    int f(int i){
        return 10 * i;
    }
}


/*
 the variable will be initialized before any method will be called, even the Constructor Method.
 */
class Window{
    Window(int maker){
        System.out.println("Window " + maker + " init !");
    }
}

class House{
    Window w1 = new Window(1);

    House(){
        System.out.println("House init");

        w3 = new Window(33);
    }
    Window w2 = new Window(2);

    void houseParty(){
        System.out.println("Cheers !");
    }

    Window w3 = new Window(3);//something maybe not suitable.
}

class SimpleStringFlex {
    SimpleStringFlex(String ...args) {
        System.out.println("SimpleStringFlex running...");
        for ( String s : args) {
            System.out.println ("sout :" + s);
        }
    }
}
class StringFlex {

    StringFlex(String[] ...args) {
        System.out.println("StringFlex running...");
        for (String[] s : args) {
            for (String sub : s) {
                System.out.println("out: " + sub);
            }
        }
    }
}


