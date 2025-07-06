
public class Polymorphisam {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("======== Compile time polymorphisam i.e. Function Overloading ========");
        Calculator cal = new Calculator();
        System.out.println("Sum: " + cal.sum(2, 4));
        System.out.println("Sum: " + cal.sum(2.4f, 4.2f));
        System.out.println("Sum: " + cal.sum(2, 4, 6));
        System.out.println("======== Run time polymorphisam i.e. Function Overriding ========");
        Deer d = new Deer();
        d.eat();

    }
}

class Calculator {

    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal {

    void eat() {
        System.out.println("Eat everything or anything");
    }
}

class Deer extends Animal {

    @Override
    void eat() {
        System.out.println("Eat Grass");
        super.eat();// we can not access the parent class fun() dirctly
        //we have to call it in child class function usin super keyward.
    }

}
