import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // HELLO WORLD
//        System.out.println("Hello World! I am Petar Yonkov and I learn JAVA!");
//        JOptionPane.showMessageDialog(null,"Hello World!");

        //VARIABLES
//        byte counter = 0; // -127 to +128 good for small counters...    -->1 byte...
//        short c = 2000;  // -32,768 to 32,767 so good for any counter   -->2bytes
//        int i = 5122225; // -2,147,483,648 to 2,147,483,647               --> 4bytes
//        long l = 123456789; //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 -->8 bytes
//        float f = 5.78f;
//        double d = 35.78;
//        boolean flag = true; // false
//        char singleLetter = 'a';
//        String s = "My string", result = "";
//        result += "Byte counter = " + counter + "\n";
//        result += "Short c = " + c + "\n";
//        result += "Int i = " + i + "\n";
//        result += "Long l = " + l + "\n";
//        result += "Float  f = " + f + "\n";
//        result += "Double d = " + d + "\n";
//        result += "Boolean flag = " + flag + "\n";
//        result += "Char singleLetter =" + singleLetter + "\n";
//        System.out.println(result);

        //ARITHMETIC
//        double a = 53.4, b = 25.1, result2;
//        result2 = a+b;
//        System.out.println(result2);
//        result2 = a-b;
//        System.out.println(result2);
//        result2 = a*b;
//        System.out.println(result2);
//        result2 = a/b;
//        System.out.println(result2);
//        a+=1;
//        System.out.println(a);
//        b-=1;
//        System.out.println(b);
//        a=a+5;
//        System.out.println(a);
//        int q = 8;
//        System.out.println(q%3);

        //BOOLEAN ALGEBRA
//    boolean a=true, b=false, c=false;
//        System.out.println(a&& !(b&&c));
//        System.out.println(!a || b ||c);
//        System.out.println(a ^ (b ||c));
//        int a = 4, b=7;
//        String s_a = Integer.toBinaryString(a), s_b = Integer.toBinaryString(b);
//        System.out.println("S_A & S_B = (binary codes) " + s_a + " " + s_b);
//        System.out.println("A & B = (bitwise AND) " + Integer.toBinaryString(a&b));
//        System.out.println("A & B = (bitwise OR) " + Integer.toBinaryString(a|b));
//        System.out.println("A ^ B = (bitwise OR) " + Integer.toBinaryString(a^b));
//        System.out.println("NEGATE A " + Integer.toBinaryString(~a));
//        System.out.println("BITWISE MOVE A RIGHT " + Integer.toBinaryString(a>>1));
//        System.out.println("BITWISE MOVE A LEFT  " + Integer.toBinaryString(a<<1));

        // IF ELSE
//        int a = 58, b=57;
//        if(a<b) {
//            System.out.println("a < b");
//        } else {
//            System.out.println("a >= b");
//        }
//        double n = 0,m;
//        String in, in2;
//        in = JOptionPane.showInputDialog(null,"Please input a positive number.", JOptionPane.QUESTION_MESSAGE);
//        if(in != null && !in.equals("")) {
//            n = Double.parseDouble(in);
//            if(n<0) JOptionPane.showMessageDialog(null, "You failed to enter a positive number!");
//        } else {
//            JOptionPane.showMessageDialog(null, "You failed to enter a number!");
//        }
//        in2 = JOptionPane.showInputDialog(null,"Please input a number different than zero!", JOptionPane.QUESTION_MESSAGE);
//        if(in2 != null && !in2.equals("")) {
//            m = Double.parseDouble(in2);
//            if(m==0) JOptionPane.showMessageDialog(null, "Result is Infinity!");
//            else JOptionPane.showMessageDialog(null, "The result is:" + (n/m));
//        } else {
//            JOptionPane.showMessageDialog(null, "You failed to enter the second number!");
//        }

        //FOR LOOP
//            int sum = 0;
//            for (int i=1; i<=100;i+=1){
//                System.out.println("Current number: " + i);
//            }
//
//
//        String in;
//            double n = 0.0;
//        in = JOptionPane.showInputDialog(null,"Please input a positive integer number.", JOptionPane.QUESTION_MESSAGE);
//        if(in != null && !in.equals("") && !in.contains(".")) {
//            n = Integer.parseInt(in);
//            if(n<0) JOptionPane.showMessageDialog(null, "You failed to enter a positive number!");
//            if(n==0) JOptionPane.showMessageDialog(null, "You entered a zero. The sum in 0!");
//        } else {
//            JOptionPane.showMessageDialog(null, "You failed to enter a proper number!");
//        }
//        for (int k=0;k <= n; k+=1) {
//            sum += k;
//        }
//        if (sum >0) JOptionPane.showMessageDialog(null, "Your result is: " + sum);

        //WHILE LOOP
//        int counter = 125;
//        while (counter >= 99)  {
//            System.out.println("decreasing counter" + counter);
//            counter-=1;
//        }

//        String in;
//            int n = 0;
//            long factorial=1;
//        in = JOptionPane.showInputDialog(null,"Please input a positive integer number.", JOptionPane.QUESTION_MESSAGE);
//        if(in != null && !in.equals("") && !in.contains(".")) {
//            n = Integer.parseInt(in);
//            if(n<0) JOptionPane.showMessageDialog(null, "You failed to enter a positive number!");
//            if(n==0) JOptionPane.showMessageDialog(null, "You entered a zero. The factorial is equal to 1.");
//        } else {
//            JOptionPane.showMessageDialog(null, "You failed to enter a proper number!");
//        }
//        while (n>0) {
//            factorial *= n;
//            n-=1;
//        }
//        JOptionPane.showMessageDialog(null, "Your factorial is: " + factorial);

        //DO-WHILE LOOP
//        String in;
//        int n = 0;
//        do {
//            in = JOptionPane.showInputDialog(null,"Please input a positive integer number.", JOptionPane.QUESTION_MESSAGE);
//            if(in != null && !in.equals("") && !in.contains(".")) {
//            n = Integer.parseInt(in);
//            if(n<0 || n == 0) continue;
//            else {
//                JOptionPane.showMessageDialog(null, "Thank you for the input!");
//                break;
//            }
//        }
//        }while (true);

        //SWITCH
//        String a, b, operation;
//        double op1, op2;
//        a = JOptionPane.showInputDialog(null,"Please input any number.", JOptionPane.QUESTION_MESSAGE);
//        b = JOptionPane.showInputDialog(null,"Please input any number. Caution: 0 will result in error on division.", JOptionPane.QUESTION_MESSAGE);
//        if((a != null && !a.equals("")) && (b != null && !b.equals(""))) {
//            op1 = Double.parseDouble(a);
//            op2 = Double.parseDouble(b);
//            operation = JOptionPane.showInputDialog(null,"Please input either + - / *.", JOptionPane.QUESTION_MESSAGE);
//
//            switch (operation){
//                case "+": JOptionPane.showMessageDialog(null, "a + b = " + (op1+op2)); break;
//                case "-": JOptionPane.showMessageDialog(null, "a - b = " + (op1-op2)); break;
//                case "*": JOptionPane.showMessageDialog(null, "a * b = " + (op1*op2)); break;
//                case "/":
//                    if(op2 !=0) {
//                        JOptionPane.showMessageDialog(null, "a / b = " + (op1/op2));
//                        break;}
//                    else { JOptionPane.showMessageDialog(null, "Sorry! Cannot divide by 0!"); break;
//                    }
//                default: JOptionPane.showMessageDialog(null, "It appears you did not enter anything correct for the action! ");
//            }
//        }

        //1D ARRAY
//        int [] arr = new int[5];
//        arr[0] = 10;
//        arr[1] = 5;
//        arr[2] = 8;
//        arr[3] = 12;
//        arr[4] = 366;
//        System.out.println("index @1: " + arr[1]);
//
//        // foreach in JAVA
//        for (int a:arr) {
//            System.out.println("A is: " + a);
//        }
//        double [] d_arr = {5.1, 2.5, 6.3, 18.8, 14.3};
//        double sum = 0.0, prod = 1.0;
//        int n = 0;
//
//        while (n<5){
//            sum+= d_arr[n];
//            n+=1;
//        }
//        for(int i=0; i<5; i+=1) {
//            prod*=d_arr[i];
//        }
//        System.out.println("Sum is: " + sum);
//        System.out.println("Prod is: " + prod);

        //2D ARRAY
//        char [][] c_arr = new char[2][2];
//        c_arr [0][0] = 'a';
//        c_arr [0][1] = 'b';
//        c_arr [1][0] = 'c';
//        c_arr [1][1] = 'd';
//        for (int i=0; i<c_arr.length; i+=1)
//            for (int j=0; j<c_arr[i].length; j+=1)
//                System.out.println("What is at index "+ i + "," + j + "? --> " + c_arr[i][j]);

//        int[][] table = new int[10][10];
//        for (int i = 0; i < table.length; i++) {
//            for (int j = 0; j < table[i].length; j++)
//                table[i][j] = (i + 1) * (j + 1);
//        }
//        System.out.println("   1  2  3  4  5  6  7  8  9 10");
//        for (int i = 0; i < table.length; i++) {
//            System.out.print((i + 1) + " ");
//            for (int j = 0; j < table[i].length; j++) {
//                if (table[i][j] < 10) System.out.print(" ");
//                System.out.print(table[i][j] + " ");
//            }
//            System.out.println();
//        }

//        int [][] calc = new int [2][3];
//        int sum = 0;
//        int [] res = {0, 0};
//        // fill the array with numbers
//        for (int i = 0; i < calc.length; i++) {
//            for (int j = 0; j < calc[i].length; j++) {
//                calc[i][j] = (i + 2) * (j + 3);
//                System.out.println("ELEMENTS >>>>> " + calc[i][j]);
//            }
//
//        }
//
//        for (int i = 0; i < calc.length; i++) {
//            int temp = 0;
//            for (int j = 0; j < calc[i].length; j++){
//                sum+= calc[i][j];
//                temp += calc[i][j];
//
//            }
//            res[i] = temp;
//        }
//        System.out.println("The SUM IS:" + sum);
//        System.out.println("The RES[0] && RES [1] ARE: " + res[0] + ", " + res[1] + ".");
//        System.out.println("The RES has a length of: " + res.length + ".");

    }
}