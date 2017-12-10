/**
 * Created by netli on 2017/10/22.
 */
public class StaticInitialization {

    /* it will be only called in Line22: new StaticInitialization().run();*/
    StaticInitialization(){
        System.out.println("King is Initializing...");
    }

    public static void main(String[]  args) {
        System.out.println("++++++++++++++++ Main() start ++++++++++++++++");
        System.out.println("Creating a new CupBoard() in main !");
        new CupBoard();
        System.out.println("Creating a new CupBoard() in main !");
        new CupBoard();

        table.tableFunc(1);
        cupboard.cupBoardFunc(1);

        System.out.println("===========================");
        new StaticInitialization().run();

    }

    /*  Table init. initialize all the variable before the func act. */
    static Table table = new Table();

    static CupBoard cupboard = new CupBoard();


      NotAttach hello  = new NotAttach();//if the head is "static", it will be initialized before the main act.
    void run() {
        System.out.println("Main Run() come in.");
        hello.run();
    }

}

/*
    Con :  "Bowl(X)"
    Func:  "bowlFunc(X)"
 */
class Bowl {


    Bowl(int marker) {
        System.out.println("Bowl(" + marker + ")");
    }

    void bowlFunc(int marker) {
        System.out.println("bowlFunc(" + marker + ")");
    }
}
/*
    bowl1 and bowl2 init;
    Con: "Table()" + bowl2 Func
    Func: "tableFunc(X)"
 */
class Table {

    static Bowl bowl1 = new Bowl(1);
    Table() {
        System.out.println("Table()");
        bowl2.bowlFunc(1);
    }

    void tableFunc(int marker) {
        System.out.println("tableFunc(" + marker + ")");
    }

    static Bowl bowl2 = new Bowl(2);
}

/*
    bowl4 and bowl5 init;
    Con: "CupBoard()" + bowl4.Func(X)
    Func: "cupBoardFunc()"
 */
class CupBoard {
    Bowl bowl3 = new Bowl(3);//it will be initialized between static and  Constructor.
    static Bowl bowl4 = new Bowl(4);
    CupBoard() {
        System.out.println("CupBoard()");
        bowl4.bowlFunc(2);
    }

    void  cupBoardFunc(int marker) {
        System.out.println("cupBoardFunc(" + marker + ")");
    }

    static Bowl bowl5 = new Bowl(5);
}

class NotAttach {
    static Bowl bowl66;
    static Bowl bowl77 = new Bowl(77);
    void run() {
        System.out.println("Nothing  !");
    }
}

/**output:
Bowl(1)
Bowl(2)
Table()
bowlFunc(1)
Bowl(4)
Bowl(5)
Bowl(3)
CupBoard()
bowlFunc(2)
Creating a new CupBoard() in main !
Bowl(3)
CupBoard()
bowlFunc(2)
Creating a new CupBoard() in main !
Bowl(3)
CupBoard()
bowlFunc(2)
tableFunc(1)
CupBoardFunc(1)
 */