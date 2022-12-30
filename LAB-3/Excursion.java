public class Excursion extends Traveling implements CountNights {
    private int hotelCount;
    public Excursion(String destination, int days, int price, int hotelCount) {
        super(destination, days, price);
        this.hotelCount = hotelCount;
    }

    public int getHotelCount() {
        return hotelCount;
    }

    public void setHotelCount(int hotelCount) {
        this.hotelCount = hotelCount;
    }

    @Override
    public int fixPrice() {
        double fixPrice = price + price*0.1;
        System.out.println(fixPrice);
        return 0;
    }
    @Override
    public int daysCount() {
        int daysCount = days - 2;
        System.out.println(days);
        return 0;
    }
}
