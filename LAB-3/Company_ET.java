public class Company_ET extends Company {
    //да записваш свойставата на обекта, конструктор
    public Company_ET(String name, String date, String id, String nameBoss, double funds, double newFunds) {
        super(name, date, id);
        this.nameBoss = nameBoss;
        this.funds = funds;
        this.newFunds = newFunds;
    }

    private String nameBoss;
    private double funds;
    private double newFunds;

    void FundsSum(){
        double fundsResult = newFunds - funds;
        //return fundsResult;
        System.out.println(fundsResult);
    }
}
