
public class Abstraction {

    public static void main(String[] args) {
        System.out.println("Hello World");

        hourse h = new hourse();
        h.eat();
        h.walk();

        System.out.println("======== Abstract class Constructor hirarchy ========");
        C c1 = new C();
        c1.C_fun();

    }

}

//Abstract class
abstract class Animal {

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class hourse extends Animal {

    //The type hourse must implement the inherited abstract method Animal.walk()
    void walk() {
        System.out.println("Hourse walk on 4 legs");
    }

}
//Constructor hierarchy

abstract class A {

    A() {
        System.out.println("A's Constructor called");
    }
}

class B extends A {

    B() {
        System.out.println("B's Constructor called");
    }
}

class C extends B {

    C() {
        System.out.println("C's Constructor called");
    }

    void C_fun() {
        System.out.println("C's function");
    }
}
