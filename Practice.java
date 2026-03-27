import java.util.*;



public class Practice {
    public static void main(String[] args) {
    List<Integer> list = Arrays.asList(10,50,30,20,90,40);
    // Optional<Integer> result = list.stream().distinct().max((a,b)-> a-b);
//     resultifPresent(System.out::println);
//    list.stream()
//         .skip(5);
//        .limit(3);
//         .forEach(System.out::println);

//12
List<String> list2 = Arrays.asList("Ram", "Shyam", "Amit", "Ram");
Optional<String> result = list2.stream().min((a,b)->a.compareTo(b));
result.ifPresent(System.out::println);

//14
List<String> result2 = list2.stream().distinct().toList();
System.out.println(result2);

//
    }
}
