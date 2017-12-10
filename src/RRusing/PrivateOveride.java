package RRusing;

/**
 * Created by netli on 2017/11/8.
 */

import static net.mindview.util.Print.*;


public class PrivateOveride {
    private void f() {
        print("private f()");
    }

    public static void main(String[] args) {
        PrivateOveride sup = new Derived();
        sup.f();//the parent class assume the private cannot override by the sub-class
        // the sub-class own its independent method.
    }
}

class Derived extends PrivateOveride {
    public void f() {
        print("Public f()");
    }
}