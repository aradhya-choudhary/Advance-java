import java.util.*;

record Student(int sid, String name, String course){};
public class Mainrecord {
    public static void main(String[] args) {
        int data[] = new int []{23, 44, 667, 78};
        List<Integer> listData = Arrays.stream(data).boxed().toList();
        // System.out.println(listData);
        listData.forEach((value)->System.out.println(value));;
        listData.forEach(System.out::println);

        // student s = new Student(1, "Student 1", "mca");
        // System.out.println(s.sid());
        // System.out.println(s.name());
        // System.out.println(s.course());
        // System.out.println(s);
    
    }
}
