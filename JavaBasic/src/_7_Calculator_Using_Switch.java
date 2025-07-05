import java.util.*;

public class _7_Calculator_Using_Switch {
    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        int result;
        

        
        
        
        System.out.println("Enter 1st number: ");
        int n1=s.nextInt();

        System.out.println("Enter 2nd Number: ");
        int n2=s.nextInt();

        System.out.println("Available Operations: ");
        System.out.println("1.Add");
        System.out.println("2.sub");
        System.out.println("3.mul");
        System.out.println("4.div");
        System.out.println("5.modulo");
        System.out.println("Enter your choice");
        int choice=s.nextInt();

        switch(choice){
            case 1 -> {
                result=n1+n2;
                System.out.println("Addition is: "+result);
            }
            case 2 -> {
                result=n1-n2;
                System.out.println("Substraction is: "+result);
            }
            case 3 -> {
                result=n1*n2;
                System.out.println("Multiplication is: "+result);
            }
            case 4 -> {
                result=n1/n2;
                System.out.println("Division is: "+result);
            }
            case 5 -> {
                result=n1%n2;
                System.out.println("Modulas is: "+result);
            }
            default -> System.out.println("Envalid choice ");
        }
        s.close();
        
    }
}

