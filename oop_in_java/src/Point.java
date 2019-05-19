public class Point extends Shape implements Cloneable {

    Point(int x, int y) {
        super(x, y);
    }
    
    @Override
    public void draw() {
        System.out.println("Рисуем точку с координатами (" + this.getX() + ", " + this.getY() + ")");
    }
    @Override
    public String toString() {
        return "Drawing point with coordinates (" + this.getX() + ", " + this.getY() + ")... DONE!";
    }

    @Override
    public Point clone() {
        return new Point(this.getX(),this.getY());
    }

}
