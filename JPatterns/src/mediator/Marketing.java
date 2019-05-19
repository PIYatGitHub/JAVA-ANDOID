package mediator;

public class Marketing extends Person {
    public Marketing(Mediator m) {
        super(m);
    }

    @Override
    public void notify(String msg) {
        System.out.println("Marketing specialist received the following msg: " + msg);
    }
}
