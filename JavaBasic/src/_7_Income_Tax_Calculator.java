import java.util.*;

public class _7_Income_Tax_Calculator {
    public static void main(String[] args) {
      
        Scanner s=new Scanner(System.in);

        System.out.println("Enter your income ");
        float income =s.nextFloat();

        float tax;

        if(income<500000){
            tax=0;

        }
        else if (income>=500000 && income<1000000) {
            tax=income *0.2f;
        }
        else{
            tax=income*0.3f;
        }

        float actual_income=income-tax;

        System.out.println("Income without tax is  : "+income);
        System.out.println("Tax on your income is: "+tax);
        System.out.println("Income after tax is    : "+actual_income);
        s.close();

    }
}

