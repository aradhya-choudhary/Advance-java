import java.util.*;
public class sort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23, 12, 1, 45, 76, 26, 91, 14);
        System.out.println(list);
List<Integer> sortedList = list.stream().sorted((a,b)->b-a).toList();//descending
    // for ascending a-b
List<Integer> sortedList2 = list.stream().sorted(Comparator.reverseOrder()).toList();
    //same use as b-a of comparator
        System.out.println(sortedList);

        List<Integer> list3 = Arrays.asList(12, 5, 33, 9, 21, 1);
        List<Integer> sorted = list3.stream().sorted().toList();
        List<Integer> sorted2 = list3.stream().sorted((a,b)-> a-b).toList();
        List<Integer> sorted4 = list3.stream().sorted((a,b)->b-a).toList();

List<Integer> sorted5 = list.stream().sorted((a,b)->b-a).limit(3).toList();
//skip for ascending-> .skip(list.size()-3)
        System.out.println(sorted5);
    
        List<Integer> sorted6 = list3.stream().filter(x->x%2==0).sorted().toList();
        System.out.println(sorted6);
        
 Integer sorted7 = list3.stream().sorted((a,b)->b-a).toList().get(1);
System.out.println(sorted7);
        List<Integer> list7 = list.stream().filter(n-> n>20).sorted().toList();
        System.out.println(list7);

List<Integer> result = list.stream().sorted().toList();//are we storing
        // in list?
List<String> names = Arrays.asList("Ravi", "Ankit", "Zoya", "Meena", "Kunal");
List<String> names1 = names.stream().sorted().toList();
System.out.println(names1);
List<String> names2 = names.stream().sorted((a,b)->b.compareTo(a)).toList();
        System.out.println(names2);
List<String> names3 = names.stream().sorted((a,b)->b.length()-a.length()).toList();
System.out.println(names3);
    }
}
