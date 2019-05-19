package strategy;

public class Smart implements Strategy{
    @Override
    public void execute() {
        System.out.println("Acting smart - we will be done shortly!");
    }
}
