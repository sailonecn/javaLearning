/**
 * Created by netli on 2017/11/18.
 */


interface InstrumentIf {
    int VALUE = 5;
    void play(Note n );
    void adjust();
}


class WindIf implements InstrumentIf {
    public void play(Note n)
    {
        System.out.println(this + ".play()" + n);
    }
    public String toString()
    {
        return "WindIf";
    }
    public void adjust()
    {
        System.out.println(this + ".adjust()");
    }
}

class PercussionIf implements InstrumentIf {
    public void play(Note n)
    {
        System.out.println(this + ".play()" + n);
    }

    public String toString()
    {
        return "Percussion";
    }

    public void adjust()
    {
        System.out.println(this + ".adjust()");
    }

}

class BrassIf extends WindIf {
    public String toString()
    {
        return "Brass";
    }
}

class UnknownIf extends PercussionIf{
    public String  toString()
    {
        return "UnknownIf";
    }
}



public class Music5 {
    static void tune(InstrumentIf i)
    {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(InstrumentIf[] e)
    {
        for (InstrumentIf i : e)
            tune(i);
    }

    public static void main(String[] args)
    {
        InstrumentIf[] general = {
                new PercussionIf(),
                new BrassIf(),
                new WindIf(),
                new UnknownIf()
        };
        tuneAll(general);
    }
}