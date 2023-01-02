public class Tv extends Products implements ElectricalAppliance{
    private String maker;
    private String model;
    private int power;

    public Tv(double price, String id, String maker, String model, int power) {
        super(price, id);
        this.maker = maker;
        this.model = model;
        this.power = power;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public double checkPromo() {
        double promo = price - price*0.09;
        return promo;
    }
    @Override
    public double electricityCost() {
        double electricityCost = power/60;
        return electricityCost;
    }
}
