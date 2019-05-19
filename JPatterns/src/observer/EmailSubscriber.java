package observer;

public class EmailSubscriber implements Subscriber{
    private String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String msg) {
        System.out.println("Sending over to email: " + email + " message: " + msg);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
