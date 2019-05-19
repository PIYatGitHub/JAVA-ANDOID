package mediator;

public class Engineer extends Person {

    public Engineer(Mediator m) {
        super(m);
    }

    @Override
    public void notify(String msg) {
        System.out.println("Engineer received the following msg: " + msg);
    }
}
