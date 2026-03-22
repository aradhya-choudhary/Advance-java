class Car {
    String brand;
    int price; 
    public void printInfo() {
        System.out.println( this.brand + " " + this.price);
    }
}

class Rectangle {
    int length, width, n;
    public void area() {
        System.out.println(length*width);
    }

    public void perimeter() {
        System.out.println(2*(length+width));
    }

    public void checkSquare() {
        if(length == width) {
            System.out.println("is square");
        } else {
            System.out.println("not a square");
        }
    }
}

public class hello {
    public static void main (String[] args){
        Car c1 = new Car();
        c1.brand = "bmw";
        c1.price = 23;
        // c1.printInfo();

        Car c2 = new Car();
        c2.brand = "audi";
        c2.price = 24;
        c2.printInfo();

        Rectangle r1 = new Rectangle();
        r1.length = 4;
        r1.width = 2;
        r1.perimeter();
        r1.area();
        r1.checkSquare();
        
    }
}
