package observer;

public class SmsSubscriber implements Subscriber{
    private String phone;

    public SmsSubscriber(String phone) {
        this.phone = phone;
    }

    @Override
    public void update(String msg) {
        System.out.println("Sending SMS over to: " + phone + " message: " + msg);
    }

    public String getEmail() {
        return phone;
    }

    public void setEmail(String phone) {
        this.phone = phone;
    }
}
