package prot_singleton_stuff;

public class CurrencyAdapter {
    private BankAccount b;
    final double RATIO = 47;

    public CurrencyAdapter(BankAccount b) {
        this.b = b;
    }

    double getSumUSD(){
        double roubles = b.getSum();
        return Math.round(roubles*100/RATIO)/100;
    }

}
