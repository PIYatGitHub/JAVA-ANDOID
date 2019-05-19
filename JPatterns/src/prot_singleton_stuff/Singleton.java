package prot_singleton_stuff;

public class Singleton {
    private int x;
    private static Singleton object;
    //step 1: private constructor - so no one can create such instances
    private Singleton (){
        this.x = 10;
    }

    public static Singleton getSingleton(){
        if (object == null) object = new Singleton();
        return object;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
