public class Books extends Products{
    private String author;
    private String title;

    public Books(double price, String id, String author, String title) {
        super(price, id);
        this.author = author;
        this.title = title;
    }
    @Override
    public double checkPromo() {
        double promo = price - price*0.15;
        return promo;
    }

}
