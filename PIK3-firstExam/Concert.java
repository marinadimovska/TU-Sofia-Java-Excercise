import java.util.Scanner;

public class Concert extends Event{

    private String starName;

    public Concert(String place, String date, String startHour, int numberOfTickets, double priceOfTicket, String starName) {
        super(place, date, startHour, numberOfTickets, priceOfTicket);
        this.starName = starName;
    }

    @Override
    boolean sellTicket(int num) throws NoMoreTicketException {
        Scanner scanner = new Scanner(System.in);
        if(getNumberOfTickets()>num){
            num = scanner.nextInt();
            int newTickets = getNumberOfTickets() - num;
        }else{
            throw new NoMoreTicketException();
        }
        return true;
    }
}
