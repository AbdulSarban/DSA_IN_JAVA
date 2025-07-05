import java.util.*;

public class _9_stop_for_10_by_DoWhile {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        do { 
            System.out.println("Enter your number: ");
            int n=s.nextInt();
            if(n%10==0){
                break;
            }

            System.out.println("You entered: "+n);
        } while (true);
        s.close();
    }
}
