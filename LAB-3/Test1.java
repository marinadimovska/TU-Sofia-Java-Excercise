public class Test1 {
    public static void main(String[] args) {
        Excursion excursion = new Excursion("Italy", 9, 100, 4);
        Vacation vacation = new Vacation("Dubai", 10, 10000,"Dubai Marina");

        excursion.fixPrice();
        excursion.daysCount();
        vacation.fixPrice();
        
    }
}
