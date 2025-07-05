import java.util.*;

public class _9_n_sum_by_while {
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);

        System.out.println("How many number's sum do you want : ");

        int n=s.nextInt();
        int sum=0;

        int counter=0;
        while(counter<=n){
                sum=sum+counter;

                counter++;

                
        }
        System.out.println("The sum is: "+sum);

        s.close();
    }
}
