package observer;

import java.util.ArrayList;

public class Author {
    private ArrayList<Subscriber> list = new ArrayList<>();

    public void subscribe (Subscriber s) {
        list.add(s);
    }

    public void unsubscribe (Subscriber s) {
        list.remove(s);
    }

    public void posts(String msg){
        for (Subscriber s:list){
            s.update(msg);
        }
    }
}
