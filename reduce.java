import java.util.*;
public class reduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(34, 12, 56, 78, 90, 99, 105);
        int sum = list.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);
        double avg = sum/list.size();
        System.out.println(avg);
        int maxx = list.stream().reduce(Integer.MIN_VALUE, (a,b)-> Math.max(a,b));
        
        System.out.println(maxx);
        int min = list.stream().reduce(Integer.MAX_VALUE,(a,b)-> Math.min(a,b));
        System.out.println(min);
int total = list.stream().reduce(0,(a,b)-> a+1); // count b hta h check krne ko
System.out.println(total);
int even  = list.stream().filter((a) -> a%2 == 0).reduce(0, (a,b)-> a+b);
System.out.println(even);

List<String> list2 = Arrays.asList("Java", "Stream", "Api", "reduce", "bhaaanuuu", "iiiiiiiii");
String finalist = list2.stream().reduce("", (a,b)-> (a+ " " +b));
System.out.println(finalist);

// dikkat

int square = list.stream().map(x-> x*x).reduce(0, (a,b)-> a+b);
System.out.println(square);
        
int max = list.stream().reduce(0, (a,b)-> a>b? a:b);
int Smax = list.stream().reduce(0,(a,b)->a>b && a<max?a:b);
System.out.println(Smax);
int minn = list.stream().reduce(0, (a,b)-> a<b? a:b);
int Smin = list.stream().reduce(Integer.MAX_VALUE, (a,b)->a<b && a>minn ? a:b);
        System.out.println(Smin);

        String s1 = list2.stream().reduce("", (a,b)->a.length() > b.length() ? a:b);
        System.out.println(s1);

List<Integer> list3 = Arrays.asList(12,34,56,78);
        int digits = list3.stream().reduce(0, (a,b)->a+(b%10) + (b-(b%10))/10 );
        System.out.println(digits);
List<Integer> list4 = Arrays.asList(123456);
 int value = 123456;
 System.out.println(String.valueOf(value).chars().count());



    }
}

