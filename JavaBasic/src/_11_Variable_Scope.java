public class _11_Variable_Scope {
    public static void main(String[] args){
        System.out.println("Hello World");

        //System.out.println(s);
        /*s cannot be resolved to a variableJava(33554515)
        cannot find symbol  -----> In this way it will give error because the s variable not declared */

        int s=10;
        
        System.out.println(s);/* Now this will not give error because in previous line the "s " variable is declred */

        //Block Scope

        {
            int num=10;

            System.out.println("Num inside Block: "+num);
        }
        int num=20;//Both "num" variables are different 
        System.out.println("num outside the block: "+num);
    } 
}
