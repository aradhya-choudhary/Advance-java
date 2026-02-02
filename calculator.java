
class Sum {
    int displaySum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    
}
class Multiplication {
    int num1; int num2;
    Multiplication(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;

    }
    void getMulti(int num1, int num2){
        int m = num1* num2;
        System.out.println(m);
    }

}
public class calculator {
    public static void main(String[] args) {
        Sum s1 = new Sum();
        System.out.println(s1.displaySum(3,4));
        Multiplication m1 = new Multiplication(3,5);
        m1.getMulti(3,5);
        
    }
}
