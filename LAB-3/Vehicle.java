abstract class Vehicle {
    public int maxspeed;
    public String model;
    public int price;

    public Vehicle(int maxspeed, String model, int price) {
        this.maxspeed = maxspeed;
        this.model = model;
        this.price = price;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract double checkPromo() ;
}
class Car1 extends Vehicle implements IsLandVehicle {

    public Car1(int maxspeed, String model, int price, int kw) {
        super(maxspeed, model, price);
        this.kw = kw;
    }
    private int kw;
    @Override
    public double checkPromo(){
        double promo = price - price*0.2;
        System.out.println(promo);
        return 0;
    }
    @Override
    public void enterLand() {
        System.out.println("land");
    }
}
 class Hovercraft extends Vehicle implements IsSeaVessel {
    public Hovercraft(int maxspeed, String model, int price, int passengers) {
        super(maxspeed, model, price);
        this.passengers = passengers;
    }

    private int passengers;

    @Override
    public double checkPromo() {
        double promo = price - price*0.03;
        System.out.println(promo);
        return 0;
    }
     @Override
     public void enterSea() {
         System.out.println("sea");
     }
 }
class Ship extends Vehicle implements IsSeaVessel{
    public Ship(int maxspeed, String model, int price, int deadweight) {
        super(maxspeed, model, price);
        this.deadweight = deadweight;
    }

    private int deadweight;
    @Override
    public double checkPromo() {
        double promo = price - price*0.003;
        System.out.println(promo);
        return 0;
    }
    @Override
    public void enterSea() {
        System.out.println("sea");
    }
}

