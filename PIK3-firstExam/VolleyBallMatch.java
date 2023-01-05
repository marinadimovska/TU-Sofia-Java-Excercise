import java.util.Scanner;

public class VolleyBallMatch extends Event{

    private String firstTeam;
    private String secondTeam;

    public VolleyBallMatch(String place, String date, String startHour, int numberOfTickets, double priceOfTicket, String firstTeam, String secondTeam) {
        super(place, date, startHour, numberOfTickets, priceOfTicket);
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
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
