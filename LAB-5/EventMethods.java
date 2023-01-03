import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
public class EventMethods {
    private Pattern pattern;
    private Matcher matcher;

    //pattern - изплозва се за дефиниране на модела, за да го използваме трябва да извикаме един
    //от статичните му методи compile().matcher извършва операции за съпоставяне на текст с шаблони
    private static final String DATE_PATTERN = "[0-9]{2}.[0-9]{2}.[0-9]{4}";
    //фукиция, която проверява дали датата, която шаблона налага съвпада с реалната дата
    public boolean dateValidation(String date){
        pattern = pattern.compile(DATE_PATTERN);
        matcher = pattern.matcher(date);
        return matcher.matches();
    }
    //арей лист, типът е от клас ИвентЛог
    public void addEvent(ArrayList<EventLog> event_list, EventLog event)
    {

        event_list.add(event);
    }
    public void printEvents(ArrayList<EventLog> event_list){
        for (EventLog event: event_list){
            System.out.println(event.getName()+", "+ event.getDate()+", "+event.getPrice());
        }
    }

}
