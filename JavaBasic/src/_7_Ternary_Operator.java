import java.util.*;

public class _7_Ternary_Operator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter number to check Even or Odd: ");
        int number=s.nextInt();

        String Type=((number%2)==0)?"Even":"Odd";

        System.out.println(number+" Is "+Type+" Number ");

        
    }
}