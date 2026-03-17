import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class stream {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(23);
        list.add(34);
        list.add(90);
        list.addAll(List.of(23, 78, 98));
        System.out.println(list);
        // Stream listStream = list.stream();
        list.stream().forEach((item) -> System.out.print(item + " "));
        list.stream().forEach(System.out::println);

        ArrayList<String> list2 = new ArrayList<String>();  
        list2.add("apple");
        list2.add("mango");
        list2.addAll(List.of("aradhya", "bhanu"));
        System.out.println(list2);
        list2.stream().forEach((element) -> System.out.print(element + " "));
        System.out.println("count=" + list.stream().count());


        


     }
}
