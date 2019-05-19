public class Socketor {

    public static void main(String[] args) {
        if(args.length<3) {
            System.out.println("Usage: \r\n" +
                "java Socketor server 8000 [+-/*]  or \r\n" +
                "java Socketor 127.0.0.1 8000 [a] [b]");
            return;
        }
        Socketor socketor = new Socketor();
        if(args[0].equals("server")) socketor.runServer(args[1], args[2]);
        if(args[0].equals("client")) socketor.runClient(args[1], args[2], args[3], args[4]);
    }

    private void runClient(String ip, String port, String op1, String op2) {
        BilateralBind bind = new BilateralBind(port,ip);
        bind.writeLine(op1);
        bind.writeLine(op2);
        String ans = bind.readLine();
        System.out.println(ans);
        bind.close();
    }

    private void runServer(String port, String operation) {
        BilateralBind bindServer = new BilateralBind(port); // the main listener on 8000

        System.out.println("Started a server with " + operation + " at port: " + port);
        while (true) {
            BilateralBind binder = new BilateralBind(bindServer);
            System.out.println("client was accepted...");
            new Thread(()->{
                    System.out.println("Awaiting for a client...");
                    String a = binder.readLine();
                    String b = binder.readLine();
                    int result = calculate(operation, a, b);
                    String msg = a + " " + operation + " " + b + " = " + result;
                    binder.writeLine(msg);
                    System.out.println("Accepted a client for: " + msg);
                    binder.close();
            }).start();
        }
    }

    private int calculate(String operation, String a, String b) {
        int op1 = Integer.parseInt(a);
        int op2 = Integer.parseInt(b);
        int res = 0;
        switch (operation){
            case "+": res = op1 + op2; break;
            case "-": res= op1 - op2; break;
            case "*": res= op1 * op2; break;
            case "/": res = op1/op2;
                break;
            default: break;
        }
        return res;
    }

}
