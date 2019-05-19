package mediator;

public class Bookie extends Person {
    public Bookie(Mediator m) {
        super(m);
    }

    @Override
    public void notify(String msg) {
        System.out.println("Bookie received the following msg: " + msg);
    }
}
