package facade;

public class Request {
    private MyUrl url;

    public Request(MyUrl url) {
        this.url = url;
    }

    public MyUrl getUrl() {
        return url;
    }

    public void setUrl(MyUrl url) {
        this.url = url;
    }

    public String sendRequest(){
            return "60";
    }
}
