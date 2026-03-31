import java.util.*;
import java.util.stream.Collectors;
class Employee {
    int id;
    String name;
    double salary;
    int age;
    String department;

    public Employee(int id, String name, double salary, int age, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }

}
public class Employe {
    
// Sample ArrayList (used in questions)

    public static void main(String[] args) {

        ArrayList<Employee> empList = new ArrayList<>(Arrays.asList(
                new Employee(101, "Amit", 50000, 25, "IT"),
                new Employee(102, "Neha", 60000, 28, "HR"),
                new Employee(103, "Ravi", 45000, 24, "IT"),
                new Employee(104, "Karan", 70000, 30, "Finance"),
                new Employee(105, "Pooja", 55000, 27, "HR"),
                new Employee(106, "Rohit", 80000, 32, "IT"),
                new Employee(107, "Simran", 65000, 29, "Finance"),
                new Employee(108, "Amit", 50000, 25, "IT")
        ));

     Optional <Employee> result3 =   empList.stream()
      .min((a,b)->(int)a.getSalary()-(int)b.getSalary());
      result3.ifPresent(System.out::println);
      System.out.println(result3);

        Optional<Employee> result4 = empList.stream().min((a,b)-> (int)a.getAge()-(int)b.getAge());
        
            empList.stream()
    .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
    .skip(1)
    .map(Employee::getSalary)   // 👉 extract salary
    .findFirst()
    .ifPresent(System.out::println);
    /// question 7 ///
empList.stream()
    .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
    .limit(3)
    .forEach(e -> 
        System.out.println(e.getName() + " " + e.getSalary())
    );
    
// 8 question 
empList.stream()
    .sorted(Comparator.comparingDouble(Employee::getSalary)) // ascending
    .limit(3)
    .forEach(e ->
        System.out.println(e.getName() + " " + e.getSalary())
    );
    //9 question important question for exam
    empList.stream()
            .collect(Collectors.toMap(
                Employee:: getName,
                e->e,
                (e1, e2)-> e1
            ))
            .values()
            .forEach(System.out::println);


            //11
            empList.stream()
    .filter(e -> e.getDepartment().equals("IT")) // only IT
    .map(Employee::getSalary)                   // get salaries
    .min(Double::compare)                       // find minimum
    .ifPresent(System.out::println);
//13 from 9 to 15 imp questions for exam
    
          // 4 question 
          
          
}
}

