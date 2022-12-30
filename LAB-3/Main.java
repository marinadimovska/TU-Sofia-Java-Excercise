public class Main {
    public static void main(String[] args) {
        //object
        Company company = new Company("Bela Extreme", "12 may", "abc01dfg08hklmno");
        Company_ET company_et = new Company_ET("Bela Extreme", "12 may", "abc01", "Stoyan",
                500.5, 1000.5);
        company.Display();
        company_et.FundsSum();
    }
}