package prot_singleton_stuff;

public class House {
    private boolean wooden;
    private boolean has_grid_power;
    private int floors;
    private int area;
    private int poolVolume;
    private int poolArea;

    @Override
    public String toString() {
        return "prot_singleton_stuff.House{" +
                "wooden=" + wooden +
                ", has_grid_power=" + has_grid_power +
                ", floors=" + floors +
                ", area=" + area +
                ", poolVolume=" + poolVolume +
                ", poolArea=" + poolArea +
                '}';
    }

    private House(boolean wooden, boolean has_grid_power, int floors, int area, int poolVolume, int poolArea) {
        this.wooden = wooden;
        this.has_grid_power = has_grid_power;
        this.floors = floors;
        this.area = area;
        this.poolVolume = poolVolume;
        this.poolArea = poolArea;
    }
    public House(){
        this(false,false,2,140,0,0);
    }

    public boolean isWooden() {
        return wooden;
    }

    public void setWooden(boolean wooden) {
        this.wooden = wooden;
    }

    public boolean isHas_grid_power() {
        return has_grid_power;
    }

    public void setHas_grid_power(boolean has_grid_power) {
        this.has_grid_power = has_grid_power;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPoolVolume() {
        return poolVolume;
    }

    public void setPoolVolume(int poolVolume) {
        this.poolVolume = poolVolume;
    }

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }
}
