public class Java_Casting {
    
    public static void main(String[] args) {

        int a=12;

        float b=a;

        System.out.println("Type Conversion By default: "+ b);

        /*Type Conversion: 
                        Conversion of low level data to the high level data 
                        It follow the following presedance: 
                            Byte-> Short -> Int -> Float -> Long -> Double
        */

        float f=15.2222f;

        int i=(int)f;
        System.out.println("Type Casting By Explicit method : "+ i);

        /*
         Type Casting: 
                    Conversion of high level data to low level data 
                    Data may still Lost.

        */

        char ch='a';

        int number=ch;

        float fnum=ch;

        long lnum=ch;

        double dnum=ch;


        System.out.println("Char to Integer Conversion: "+ number);// It gives the ascii value of that variable.

        System.out.println("Char to Float Conversion: "+fnum);

        System.out.println("Char to Long Conversion: " +lnum);

        System.out.println("Char to Double Conversion: " +dnum);
    }
}
