abstract class Traveling<price> {
    public String destination;
    public int days;
    public int price;

    public Traveling(String destination, int days, int price) {
        this.destination = destination;
        this.days = days;
        this.price = price;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract <price> int fixPrice();


}
