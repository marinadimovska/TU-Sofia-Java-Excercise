import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EventProcessing extends TicketLoader {
    public static Concert[] concertArray;
    public static VolleyBallMatch[] volleyBallArray;

    static void processTickets() throws IOException {
        TicketLoader t = new TicketLoader();
        Event[] arrayOfEvents = (Event[])t.importDataFromFile();
        Scanner scanner = new Scanner(System.in);
        String typeOfTicket;
        int ticketsCount;
        System.out.println("Enter the number of the tickets you want to add");
        ticketsCount = scanner.nextInt();
        System.out.println("enter 1 or 2");
        typeOfTicket = scanner.next();
        if (typeOfTicket.equals("1")) {
            int i = 0;
            int j = 0;
            for (Event e : arrayOfEvents) {
                if (e instanceof Concert) {
                    concertArray[i++] = (Concert) e;
                }
            }

        } else {
            int j = 0;
            for (Event e : arrayOfEvents) {
                if (e instanceof VolleyBallMatch) {
                    volleyBallArray[j++] = (VolleyBallMatch) e;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(concertArray);
        System.out.println(volleyBallArray);
    }
    }





