import java.util.*;

public class _7_Calculator {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int a=s.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b=s.nextInt();

        System.out.println("Enter the operator");
        char Operator=s.next().charAt(0);

        
        switch (Operator) {
            case '+' -> System.out.println("Additopn is: "+(a+b));
            case '-' -> System.out.println("Sustraction is: "+(a-b));
            case '*' -> System.out.println("Multiplication is: "+(a*b));
            case '/' -> System.out.println("Division is: "+(a/b));
            case '%' -> System.out.println("Reminder is: "+(a%b));
            default -> System.out.println("Wrong Operator ");
        }
        s.close();
    }
}
