import java.util.*;
public class Streamm {
    public static void main(String[] args) {
        List<Integer>  data =Arrays.asList(10, 20, 40, 60, 9);
        List<Integer> list = new ArrayList<>();
        list.addAll(data);
        list.add(34);
        list.add(21);
        list.add(56);
        list.add(89);
        System.out.println(list);

        list.stream().filter(n->n%2==0).forEach(System.out::println);
        list.stream().filter(n->n>50 && n<=60).forEach(System.out::println);

        List<String> list2 = new ArrayList<>();
        list2.add("Amit");
        list2.add("Ravi");
        list2.add("Anil");
        list2.add("Ashok");
        list2.add("Rahul");
        list2.add("null");

        list2.stream().filter(name-> name.startsWith("A")).forEach(System.out::println);
        list2.stream().filter(name-> name.length() > 4).forEach(System.out::println);

         List <String>notNull  = list2.stream()
        .filter(name-> name != "null").toList();
        System.out.println(notNull);

        list.stream().filter(n->n%2 == 0).forEach(System.out::println);
    }
}
        
    
    
