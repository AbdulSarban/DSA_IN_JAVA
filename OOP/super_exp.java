
public class super_exp {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("======== Super keyward example ========");
        hourse h = new hourse();
        System.out.println("Color: " + h.color);
    }
}

//super keyward example
class Animal {

    String color;

    Animal() {
        System.out.println("Animal's Constructor called");
    }
}

class hourse extends Animal {

    hourse() {
        super();//this command sould be 1st.
        System.out.println("Hourse's Consstuctor called");
        super.color = "Brown";
    }

}
