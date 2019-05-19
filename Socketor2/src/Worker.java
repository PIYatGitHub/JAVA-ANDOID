public class Worker implements Runnable {
    private int counter = 0; // volatile - use for all copies have access to the current value...
    private int sum = 0;
    private String thredName;

    Worker(String thredName) {
        this.thredName = thredName;
    }
   private synchronized void next(){
        // why ?
        counter +=1;
        // because everyone will enter here alone!
       //so it wont be count = 15 --> goes to 16, but meanwhile someone already made it 16!! so a call falls out!
    }

    @Override
    public void run() {
        for (int j=1; j<=10; j+=1){
            next();
            System.out.println(thredName + " has cleaned " + counter + " potatoes...");
            try {
                Thread.sleep(10);
            }catch (InterruptedException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }

    int getSum() {
        return sum;
    }
}
