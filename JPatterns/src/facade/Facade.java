package facade;

public class Facade {
    public static double rubToUSD(double roubles){
        MyUrl url = new MyUrl();
        url.setHref("www.dali.com");
        Request r = new Request(url);
        String res = r.sendRequest();
        Parser p = new Parser();
        double ratio = p.getRatio(res);
        return ((double) Math.round(roubles*100 / ratio) / 100);
    }

}
