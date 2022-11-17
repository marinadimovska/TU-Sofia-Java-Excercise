import java.util.*;

public class excersise {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList();
        list.add("Magician");
        list.add("Assistant");
        System.out.println(list);
        list.removeIf(s-> s.startsWith("A"));
        System.out.println(list);
        Collection<String> cats = Arrays.asList("Annie", "Ripley");
        cats.forEach(System.out::println);
        cats.forEach(c->System.out.println(c));

        String[] array = new String[] {"a", "b", "c"};
        List<String> asList = Arrays.asList(array);
        List<String> of = List.of(array);
        List<String> copy = List.copyOf(asList);
        array[0] = "z";
        System.out.println(asList);
        System.out.println(of);
        System.out.println(copy);
        asList.set(0, "x");
        System.out.println(Arrays.toString(array));
        //copy.add("y"); unsupportedOperationException

        List<Integer> numbers = Arrays.asList(1, 2, 3);
        numbers.replaceAll(x->x*2);
        System.out.println(numbers);

        for(String string: list){
            System.out.println(string);
        }
        Iterator<Integer> iter = numbers.iterator();
        while(iter.hasNext()){
            Integer i = iter.next();
            System.out.println(i);

        }

    }
    }


