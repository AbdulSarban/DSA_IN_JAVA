
public class OOP_1_Basic {

    public static void main(String[] args) {
        System.out.println("Hello World");

        //object creation;
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println("Color: " + p1.color);
        p1.setTip(5);
        System.out.println("TipSize: " + p1.Tipsize);
        p1.color = "Green";
        System.out.println("Color: " + p1.color);

        //Getter and Setter
        System.out.println("======== Getter and Setter function ========");
        Bank b = new Bank();
        b.UserName = "Abdul";
        System.out.println("UserName: " + b.UserName);
        b.SetPass("abcd");
        System.out.println("Passward: " + b.GetPass());

        //copy Constructors.

    }
}

class Pen {

    String color;
    int Tipsize;

    void setColor(String color) {
        this.color = color;
    }

    void setTip(int Tipsize) {
        this.Tipsize = Tipsize;
    }
}

class Bank {

    public String UserName;
    private String passward;

    void SetPass(String passward) {
        this.passward = passward;
    }

    String GetPass() {
        return this.passward;
    }
}
