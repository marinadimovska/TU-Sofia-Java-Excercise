public class Buildings {
    private int height;
    private double area;
    private String address;

    public Buildings(int height, double area, String address) {
        this.height = height;
        this.area = area;
        this.address = address;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
