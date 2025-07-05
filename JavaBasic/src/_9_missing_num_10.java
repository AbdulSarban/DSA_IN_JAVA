import java.util.Scanner;

public class _9_missing_num_10 {
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);

        while(true){
            System.out.println("Enter your number: ");
            int n=s.nextInt();

            if(n%10==0){
                System.out.println("I have skip the number ");
                continue;
            }

            System.out.println("You entered : "+n);
            s.close();
            
        }

        
        
    }
}
