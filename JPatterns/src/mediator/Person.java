package mediator;

abstract public class Person {
    private Mediator m;

    public Person(Mediator m) {
        this.m = m;
    }

    public Mediator getM() {
        return m;
    }

    public void setM(Mediator m) {
        this.m = m;
    }
    public void send(String msg) {
        m.send(this, msg);
    }
    abstract public void notify (String msg);
}
