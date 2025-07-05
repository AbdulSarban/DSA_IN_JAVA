import java.util.*;

public class _11_Functions_Methods {
    public static void PrintHello(){
        System.out.println("Hello world");
    }

    public static int Cal_sum(int num1,int num2){
        return num1+num2;
    }
    public static int Cal_mul(int num1,int num2){
        return num1*num2;
    }
    public static int Cal_factorial(int num){
        int fact=1;
        if(num==0||num==1){
            return 1;
        }
        else{
            for(int i=1;i<=num;i++){
                fact=fact*i;
            }
            return fact;
        }
    }

    public static int Cal_Binomial_Coefficiant(int n,int r){
        int numrator=Cal_factorial(n);
        int denominator=Cal_factorial(r)*Cal_factorial(n-r);

        int bin=numrator/denominator;
        return bin;
    }

    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }

    public static int sum(int a,int b,int c){
        return a+b+c;
    }


    public static void main(String[] args){
        PrintHello();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b=sc.nextInt();

        int sum=Cal_sum(a,b);
        System.out.println("The sum is: "+sum);

        int mul=Cal_mul(a,b);

        System.out.println("The multiplication is: "+mul);

        System.out.println("The factorial is : "+Cal_factorial(7));
        int n=5;
        int r=2;
        System.out.println("Binomial Coefficiant for n= "+n+" and r= "+r+" is : "+Cal_Binomial_Coefficiant(n, r));

        System.out.println("Function Overloading");

        System.out.println("1. By Change in parameter type 1. Integer : "+sum(2,4));
        System.out.println("2. Float "+sum(2f,4f));
        System.out.println("2. Change in number of parameter 1. Two parameter "+sum(3,5));
        System.out.println("2. Three Parameter "+sum(1,2,5));


        sc.close();
    }
}
