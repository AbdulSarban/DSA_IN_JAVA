
public class _7_Operators{
    public static void main(String[] args) {
        
        System.out.println("1) Arithmetic Operators ---------------------------------------------------------------------------------------------");
        int a=10;
        int b=5;

        System.out.println("1.1) Binary Arithmetic Operators -----------------------------------------------------------------------------------");
        int sum=a+b;//a,b -> Are Operands  And "+"  -> Is the operator 

        int diff=a-b;

        int mul=a*b;

        int div=a/b;

        int mod=a%b;

        System.out.println("Sum = "+ sum);
        System.out.println("Diff = "+diff);
        System.out.println("Mul = "+ mul);
        System.out.println("Div = "+ div);
        System.out.println("Mod = "+ mod);


        System.out.println("1.2) Unary Arithmetic Operators -----------------------------------------------------------------------------------");
        int var1=10;
        int var2=++var1;



        System.out.println("Var1 is : "+var1);
        System.out.println("Var2 is : "+var2);
        
        int x=10;
        int y=x++;

        System.out.println("X is : "+ x);
        System.out.println("y is : "+ y);

        int l=10;
        int m=--l;

        System.out.println("L is: "+ l);
        System.out.println("M is: "+ m);

        int p=10;
        int q=p--;
        System.out.println("P is: "+ p);
        System.out.println("Q is: "+ q);        

        System.out.println("2) Relational Operators ------------------------------------------------------------------------------------------");
        
        int n1=10;
        int n2=5;
        System.out.println(n1==n2);
        System.out.println(n1!=n2);
        System.out.println(n1>n2 );
        System.out.println(n1<n2 );
        System.out.println(n1>=n2 );
        System.out.println(n1<=n2 );
 

        System.out.println("Assignment Operator ---------------------------------------------------------------------------------------------");

        int r=10;//Assign 10 to the variable "r"
        System.out.println("Value of r : "+r);
        int s=r;//Assign r to s
        System.out.println("Value of s: "+s);
        //s=s+10;--> 1)
        s+=10;// --2)  Less time for execution compared to 1
        System.out.println("Value of s After Update: "+s);

        int t=20;
        System.out.println("Value of t: "+t);
        //t=t-20;
        t-=20;//It will take less time for execution

        System.out.println("Value of t After update: "+t);

        int u=10;
        u=u*10;

        System.out.println("Value of u: "+u);

        int v=10;
        v=v/10;

        System.out.println("Value of v : "+v);

        int w=10;
        w=w % 2;

        System.out.println("Value of w: "+w);

        


        
    }
}