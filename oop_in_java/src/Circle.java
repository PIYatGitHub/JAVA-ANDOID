public class Circle extends Shape {
    
    public int r;
    
    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    @Override
    public void draw() {
        String s = "Рисуем окружность с центром (" + this.getX() + ", " + this.getY() + ") ";
        s += "и радиусом " + r;
        System.out.println(s);
    }
    @Override
    public void info (){
        System.out.println("The circle is a geometric shape with...");
    }
}
