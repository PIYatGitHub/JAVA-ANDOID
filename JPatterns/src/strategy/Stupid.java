package strategy;

public class Stupid implements Strategy {
    @Override
    public void execute() {
        System.out.println("Acting dumb - it will take time...");
    }
}
