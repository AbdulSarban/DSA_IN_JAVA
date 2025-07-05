import java.util.*;


public class Baisic {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        System.out.println("Enter redius ");
        float rad=sc.nextFloat();
        float area=3.14f * rad * rad;//The decimal numbers are considered double by default , If we want to use Float then we have to use 
        //f with the decimal number.

        System.out.println("area of circle is: "+ area);
        sc.close();
    }
}
