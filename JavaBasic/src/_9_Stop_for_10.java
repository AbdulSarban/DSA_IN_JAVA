import java.util.*;

public class _9_Stop_for_10 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        
        while(true){
            System.out.println("Enter your number: ");
            int n=s.nextInt();
            if(n%10==0){
                break;
            }

            System.out.println("You entered: "+n);
        }
        s.close();
    }
}
