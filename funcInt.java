@FunctionalInterface
interface Add {
    int calculate(int n1, int n2);
   

    }

public class funcInt {
    public static void main(String[] args) {
        Add a = new Add() { //short form of inheritance or anonymous class
            public int calculate (int n1, int n2) {
                return (n1+n2);
            }
        }; System.out.println("Sum " + a.calculate(23, 24));
        // Add a1 = (int n1, int n2)-> (n1 + n2);//lambda expression 
        System.out.println("Sum" + a1.calculate(23, 24)); 



        Calc a1= ()-> System.out.println("this is lambda");
        a1.calCulate();//example for 1b

        Calc a4 = ()-> {
            int num1=10; int num2 = 20;
            System.out.println("sum" + (num1 + num2));
        };//example for 1a
       
Calc a2 = (int n1, int n2)->{
    System.out.println("sum" + (n1+n2));
};// for multiple line 2a
a2.calCulate(23,56); 
Calc a3 = (int n1, int n2)-> System.out.println("sum" + (n1+n2));// xmple for 2b
       // single line
a3.calCulate(23, 56);

Calc a5 =  num-> num* num;
int result = a5.square(20);
System.out.println(result);


    }
}// lambda expression is a short form of declaring anonymous function, that reference
// is pass to the functional interface object. // important for exam

// types of lambda expression:
//1. No paarmeter, no return type:
//a. () -> {} multiple lines in functional
//b. () -> syso("lambda expression") // single line representation

//2. No parameter, no return type:
//a.() ->{
//        write ur lines here ;
//  return 10; } // multiple lines
// () -> 10 // return without return keyword(single line)

//3. with parameter, no return type:
//a. with one parameter:
//  int (num1) -> syso(num1); // with one parameter and datatype
//  (num1)-> syso(num1);// with one parameter without data type
//  num1 -> syso(num1);
//  num1-> {
//  syso("multiple lines");
//  syso(num1)
//}
 
//4. with parameter, with return type:
// (int num1, int num2)-> num1 + num2 // for single line
//(int num1, num2)-> {return num1 + num2} // for multiple lines

interface Calc {
    int square(int n1); 
}
