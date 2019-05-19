public interface DrawShape {
    public void draw();
    default void info(){
        System.out.println("Welcome to the wonderful world of geometric shapes! You will see points and circles everywhere! Enjoy...");
    }
}
