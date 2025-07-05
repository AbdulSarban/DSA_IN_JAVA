import java.util.*;

public class _11_Binary_To_Decimal {

    public static void BinaryToDecimal(int n){
        int power=0;
        int decimal=0;
        int num=n;

        while(n>0){
            int lastDigit=n % 10;

            decimal=decimal+((lastDigit)*(int)Math.pow(2, power));

            power++;
            n=n/10;
        }

        System.out.println("Decimal form of "+num+" Is : "+decimal);
    }

    public static void DecimalToBinary(int n){
        int num=n;
        int power=0;
        int binary=0;

        while(n>0){
            int rem=n % 2;

            binary=binary + (rem * (int)Math.pow(10,power));

            power++;
            n=n/2;
        }

        System.out.println("Binary Form of "+num+" is : "+binary);
    }

    public static void main(String[] args){
        System.out.println("Hello world");

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the binary number: ");

        int n=s.nextInt();

        BinaryToDecimal(n);

        System.out.println("Enter the decimal number: ");
        int m=s.nextInt();

        DecimalToBinary(m);
    }
}
