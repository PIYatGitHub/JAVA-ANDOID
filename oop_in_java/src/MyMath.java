public class MyMath {
    private static int count = 0;
    static int add (int a, int b)   {count +=1; return a+b; }
    static int sub (int a, int b)   {count +=1; return a-b; }
    static int mult (int a, int b)  {count +=1; return a*b; }
    static int div  (int a, int b)  {count +=1; return a/b; }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        MyMath.count = count;
    }
}
