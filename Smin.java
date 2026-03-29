import java.util.*;
import java.util.stream.Collectors;
public class Smin {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 14, 1, 4,200, 99  );
        
        Optional<Integer> result = list.stream().max((a,b)->b-a);
        Optional<Integer> result2 = list.stream().min((a,b)-> b-a);

        result.ifPresent(System.out::println);
        result2.ifPresent(System.out::println);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(10,10,20,5,40,15));
        Optional<Integer> result3 = list2.stream().max((a,b)->b-a);
        result3.ifPresent(System.out::println);

        Optional<Integer> result4 = list2.stream().min((a,b)->b-a);
        result4.ifPresent(System.out::println);

        List<Integer> result5 = list2.stream()
                           .distinct()
                           .collect(Collectors.toList());
            System.out.println(result5);
            


    }


}
