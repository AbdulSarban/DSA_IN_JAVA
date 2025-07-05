import java.util.*;

public class _17_Bit_Manupulation {

    public static void Odd_Even(int n){
        int bitMask=1;
        if((n&bitMask)!=0){
            System.out.println(n+" Is odd number.");

        }else{
            System.out.println(n+" Is even number ");
        }
    }
    
    public static int getIthBit(int n,int i){
        int bitMask=(1<<i);
        if((n&bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int n,int i){
        int bitMask=1<<i;
        return (n|bitMask);
    }

    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return(n & bitMask);
    }

    public static int Update(int n,int i,int newBit){
        int bitMask;
        if(newBit==1){
            //set operation.
            bitMask=(1<<i);
            return (n | bitMask);
        }else{
            bitMask=~(1<<i);
            return (n & bitMask);
        }
    }

    public static int Clear_Last_I_Bits(int n,int i){
        int Bitmask=((~0)<<i);
        return (n & Bitmask);
    }

    public static int Clear_I_Bits(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int BitMask=a | b;
        return (n & BitMask);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println((5&6));
        System.out.println((5&7));
        System.out.println((5|6));
        System.out.println((5|7));
        System.out.println((5^6));
        System.out.println((5^7));
        System.out.println((~5));
        System.out.println((~(-6)));

        System.out.println((5<<2));
        System.out.println(10<<4);

        System.out.println((5>>2));
        System.out.println(6>>1);
        System.out.println("Function for odd even using and operator ");
        System.out.println("enter a number to check odd or even: ");
        int n=sc.nextInt();
        Odd_Even(n);

        System.out.println("Function to get ith bit : ");
        System.out.println(getIthBit(n,0));
        System.out.println("Function to set ith bit : ");
        System.out.println(setIthBit(10,2));//Set 1 at ith index.
        System.out.println("Function to clear bit: ");
        System.out.println(clearIthBit(10,1));
        
        System.out.println("Function to update ith bit");
        System.out.println(Update(10,1,1));
        System.out.println("Function to clear last i bits");
        System.out.println((Clear_Last_I_Bits(7,2)));

        System.out.println("Function to clear range of bits: ");
        System.out.println(Clear_I_Bits(10,2,4));



        sc.close();
    }
}
