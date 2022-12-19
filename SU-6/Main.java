import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Voter> myList = new ArrayList<>();
        Voter voter1 = new Voter("Marina", "Petrich", "st.Narodna", "4");
        Voter voter2 = new Voter("Nikol", "Blagoevgrad", "st.Pirin", "7");
        Voter voter3 = new Voter("Alex", "Sofia", "st.Kukush", "8");
        Voter voter4 = new Voter("Pepi", "Sofia", "st.osma", "18");
        myList.add(voter1);
        myList.add(voter2);
        myList.add(voter3);
        myList.add(voter4);
        myList=myList.stream().filter(v->v.getCity()=="Sofia").collect(Collectors.toList());
        Comparator<Voter> compareByAddress = Comparator.comparing(Voter::getStreet).
                thenComparing(Voter::getAddress);
        Collections.sort(myList, compareByAddress);
        myList.forEach(voter-> voter.getInfo());

    }
}
