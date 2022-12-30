public class Vacation extends Traveling {
    private String hotelName;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Vacation(String destination, int days, int price, String hotelName) {
        super(destination, days, price);
        this.hotelName = hotelName;
    }

    @Override
    public int fixPrice() {
        double fixPrice = price + price*0.4;
        System.out.println(fixPrice);
        return 0 ;
    }
}
