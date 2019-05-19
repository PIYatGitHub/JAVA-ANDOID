public class Main {

    public static void main(String[] args) throws InterruptedException {
       long d = System.currentTimeMillis();
       Thread calc_1 = new Thread(()->{
           double s= 0;
           for(int i=0; i<100000000; i+=1) s+=1;
       });
        Thread calc_2 = new Thread(()->{
            double s1= 0;
            for(int i=0; i<100000000; i+=1) s1+=1;
        });
        calc_1.start();
        calc_2.start();
        if(calc_1.isAlive()) calc_1.join();
        if(calc_2.isAlive()) calc_2.join();

        System.out.println("Run time:" + (double)(System.currentTimeMillis()-d)/1000 + " seconds.");

    }
}
