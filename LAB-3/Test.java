public class Test {
    public static void main(String[] args) {
        Car1 car1 = new Car1(200, "Ford", 2000, 60);
        Hovercraft hovercraft = new Hovercraft(80, "Tuson", 20000, 6);
        Ship ship = new Ship(50, "Titanic", 30000, 350);

        car1.checkPromo();
        car1.enterLand();
        hovercraft.checkPromo();
        hovercraft.enterSea();
        ship.checkPromo();
        ship.enterSea();
    }
}
