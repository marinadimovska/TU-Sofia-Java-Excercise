import java.util.ArrayList;

public class Main{
        public static void main(String[] args) throws DateException {

            EventLog event1 = new EventLog("11","Concert",120);
            EventLog event2 = new EventLog("17.11.2005","Cinema",25);
            EventLog event3 = new EventLog("15.08.2020","Concert",150);
            EventLog event4 = new EventLog("16.08.2020","Cinema",140);
            EventLog event5 = new EventLog("05.06.2020","Art",95);
            EventLog event6 = new EventLog("10.07.2020","Circus",50);

            EventMethods methods = new EventMethods();

            ArrayList<EventLog> events = new ArrayList<>(100);

            methods.addEvent(events,event1);
            methods.addEvent(events,event2);
            methods.addEvent(events,event3);
            methods.addEvent(events,event4);
            methods.addEvent(events,event5);
            methods.addEvent(events,event6);


            methods.printEvents(events);
        }
    }

