import java.util.*;

public class _11_Is_Prime {

    public static boolean Prime(int n){
        
        if(n==2)
        {
            return true;
        }else{
 
            for(int i=2;i<=n-1;i++){
                if(n % i==0){
                    return false;
                }
            }

            return true;
        }
    }

    public static boolean Optimised_Prime(int n){
        if(n==2){
            return true;
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }

            }
            return true;
        }
    }
    
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number to check is it Prime or not: ");
        int n=s.nextInt();
        System.out.println("Check By normal method");
        if(Prime(n)){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not prime number");
        }

        System.out.println("Check By Optimised Prime function");

        if(Optimised_Prime(n)){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not prime number");
        }

        s.close();
        
    }
}