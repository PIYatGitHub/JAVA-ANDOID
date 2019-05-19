package mediator;

public class Mediator {
    private Person eng, bookie,market;
    public void send(Person p, String msg) {
        if(p == eng) {
            market.notify("All done, please proceed to logistics!");
            bookie.notify("Trucks are loaded. Please, proceed with invoicing.");
        } else if(p==market){
            eng.notify("Marketing is done - now let's see some sales.");
            bookie.notify("Marketing campaign costs 10 000$ - we are within the budget.");
        } else {
            eng.notify("Excellent design. We received positive feedback. Expect a pay raise next month!");
            market.notify("Headquarters are happy with us. Only one request - next advertisement budget to be reduced with 5%...");
        }
    }

    public Person getEng() {
        return eng;
    }

    public void setEng(Person eng) {
        this.eng = eng;
    }

    public Person getBookie() {
        return bookie;
    }

    public void setBookie(Person bookie) {
        this.bookie = bookie;
    }

    public Person getMarket() {
        return market;
    }

    public void setMarket(Person market) {
        this.market = market;
    }
}
