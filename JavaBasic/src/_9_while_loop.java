import java.util.*;

public class _9_while_loop{
    public static void main(String[] args){

        int i=0;
        while(i<5){
            System.out.println("Hello World");
            
            i++;
        }

        int count=1;
        while(count<=10){
            System.out.print(count +" ");
            count++;
        }

        System.out.println();

        Scanner s=new Scanner(System.in);
        int counter=1;
        System.out.println("How many numbers you want to print: ");
        int n=s.nextInt();


        while(counter<=n){
            System.out.print(counter+" ");
            counter++;
        }

        s.close();

    }
}