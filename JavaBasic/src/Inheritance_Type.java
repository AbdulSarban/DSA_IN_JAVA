
public class Inheritance_Type {

    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println("Simple Inheritance ");
        Fish shark = new Fish();
        shark.eat();
        shark.swim();

        System.out.println("Multilevel inheritance. ");
        dog d = new dog();
        d.eat();
        d.legs = 4;
        System.out.println("Legs: " + d.legs);

        System.out.println("Hirarchical Inheritance");
        cat c = new cat();
        c.eat();
        c.walk();
        bird b = new bird();
        b.eat();
        b.fly();

        System.out.println("Hybrid Inheritance");

    }
}

class Animal {

    void eat() {
        System.out.println("Eats");
    }

}
//Simple inheritance.

class Fish extends Animal {

    void swim() {
        System.out.println("Swim");
    }

}

//Multilevel inheritance.
class mameles extends Animal {

    int legs;
}

class dog extends mameles {

    String breed;
}

//Hirarchical Inheritance.
class cat extends Animal {

    void walk() {
        System.out.println("Walk");
    }
}

class bird extends Animal {

    void fly() {
        System.out.println("Fly");
    }
}

//Hybrid Inheritance
class a extends Animal {

    void a1() {
        System.out.println("Animal a");
    }
}

class b extends Animal {

    void b1() {
        System.out.println("Animal b");
    }
}
