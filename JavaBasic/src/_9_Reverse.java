import java.util.*;

public class _9_Reverse {
    public static void main(String[]  args){

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number to reverse: ");
        int n=s.nextInt();

        int rev=0;
        while(n>0){

            int lastDigit=n % 10;

            rev=rev*10+lastDigit;// When you want to save and print
           // System.out.print(lastDigit); // If you want to just print 

            n=n/10;
        }

        System.out.println(rev);
        s.close();

    }
}
