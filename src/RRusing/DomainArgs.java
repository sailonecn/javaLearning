package RRusing;

/**
 * Created by netli on 2017/11/8.
 */
import static net.mindview.util.Print.*;

class Tree {
    int height = 1;
    String treeName;
    private static int treeAge = 1;
    Tree(String name) {
        this.treeName = name;
    }

    static void getTreeAge() {
        print("the age of Tree: " + treeAge);
    }

    void getTreeHigh() {
        print("the height of Tree " + height);
    }
}

class AppleTree extends Tree {
    int height = 1000;
    private static int treeAge = 1000;
    AppleTree(String name){
        super(name);//if delete , it will wrong.
    }
    static void getTreeAge() {
        print("the age of Apple Tree: " + treeAge);
    }
    void getTreeHigh() {
        print("the height of Tree " + height);
    }
}



public class DomainArgs {

    public static void main(String[] args) {
        Tree appletree = new AppleTree("Jobs");
        print("main func : height - " + appletree.height);//域无法完成多态

        appletree.getTreeAge();//静态方法也无法完成多态
        appletree.getTreeHigh();
    }
}
