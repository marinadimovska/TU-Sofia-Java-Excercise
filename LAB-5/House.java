public class House extends Buildings{
   private int floors;
   private String name;

    public House(int height, double area, String address, int floors, String name) {
        super(height, area, address);
        this.floors = floors;
        this.name = name;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
