
public class Interface_exp {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Queen q = new Queen();
        q.move();
        Rook r = new Rook();
        r.move();
        System.out.println("======== Multiple Inheritance ========");
        C c = new C();
        c.A_fun();
        c.B_fun();

    }
}

interface chessPlayer {

    void move();
}

class Queen implements chessPlayer {

    public void move() {
        System.out.println("Queen Can move Horizonatal,Vertical or Digonal");
    }

}

class Rook implements chessPlayer {

    public void move() {
        System.out.println("Rook Can move Horizonatal,Vertical");

    }
}

interface A {

    void A_fun();
}

interface B {

    void B_fun();
}

class C implements A, B {

    public void A_fun() {
        System.out.println("A interface's Fun");
    }

    public void B_fun() {
        System.out.println("B interface's Fun");
    }
}
