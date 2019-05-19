package prot_singleton_stuff;

import org.jetbrains.annotations.Contract;

public class Prototype {
    private int x;
    private int y;

    @Contract(pure = true)
    public Prototype(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "prot_singleton_stuff.Prototype = {\r\n" +
                "x=" + x +
                ",\r\ny=" + y +
                "\r\n}";
    }

    @Override
    public Prototype clone(){
        return new Prototype(x,y);
    }
}
