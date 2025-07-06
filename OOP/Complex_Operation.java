
public class Complex_Operation {

    public static void main(String[] args) {
        Complex a = new Complex(2, 3);
        Complex b = new Complex(4, 5);

        Complex sum = Complex.add(a, b);
        Complex diff = Complex.sub(a, b);
        Complex prod = Complex.multiply(a, b);

        System.out.println("Sum: " + sum.r + " + " + sum.c + "i");
        System.out.println("Difference: " + diff.r + " + " + diff.c + "i");
        System.out.println("Product: " + prod.r + " + " + prod.c + "i");
    }
}

class Complex {

    int r;
    int c;

    Complex(int r, int c) {
        this.r = r;
        this.c = c;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex(a.r + b.r, a.c + b.c);
    }

    public static Complex sub(Complex a, Complex b) {
        return new Complex(a.r - b.r, a.c - b.c);
    }

    public static Complex multiply(Complex a, Complex b) {
        int real = a.r * b.r - a.c * b.c;
        int imag = a.r * b.c + a.c * b.r;
        return new Complex(real, imag);
    }
}
