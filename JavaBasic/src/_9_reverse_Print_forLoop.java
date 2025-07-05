import java.util.*;

public class _9_reverse_Print_forLoop {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number to reverse: ");

        int n=s.nextInt();

        while(n>0){
            int lastDigit=n%10;
            System.out.print(lastDigit);
            n=n/10;
        }

        s.close();
    }
}
