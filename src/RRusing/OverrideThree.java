package RRusing;

/**
 * Created by netli on 2017/11/5.
 */

import static net.mindview.util.Print.*;

class State {

    void func(){
        print("func with nothing.");
    }
    void func(String s){
        System.out.println("func with String.");
    }
    void func(int i){
        System.out.println("func with Integer.");
    }
}

class SubState extends State {
    //@Override void func(String s , int i) { -- it's wrong,  if you want to override a methods , it must exist in
    //Base class.
    @Override void func() {
        print("SubState func with nothing.");
    }
}

public class OverrideThree {

    public static void main(String[] args) {
        SubState sub = new SubState();
        sub.func();
    }

}
