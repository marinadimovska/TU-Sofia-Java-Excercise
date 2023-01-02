abstract public class Products {
    public double price;
    public String id;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Products(double price, String id) {
        this.price = price;
        this.id = id;
    }
    public abstract double checkPromo();

    /*private static double checkPromo() throws PriceException{
        if(promo > price){
            throw new PriceException();
        }else{
            return promo;
        }
    }*/

}
