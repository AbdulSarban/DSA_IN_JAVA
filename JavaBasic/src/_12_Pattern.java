

public class _12_Pattern {

    public static void hollow_square(int row,int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1||i==row||j==1||j==col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Inverted_Reverese(int row){

        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Inverted_piramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Inverted_Number(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void Inverted_Reverse_num(int n){
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void Floads_Trangle(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                
                System.out.print(counter); 
                counter++;
            }
            System.out.println();
        }
    } 

    public static void Zero_One_Trangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                //System.out.print("*");

                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void Butterfly_Pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=n-i;l++){
                System.out.print(" ");

            }
            for(int m=1;m<=i;m++){
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = n; i >= 1; i--) {
            // Left part of the lower butterfly
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Right part of the lower butterfly
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
    }

    public static void Butterfly(int n){
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            

            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");//Space like a mirror image so double the logic.
            }

            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower part;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Solid_Rombous_pattern(int n)
{
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");

        }
        for(int k=1;k<=n;k++){
            System.out.print("*");
        }
        System.out.println();
    }
}    

public static  void Hollow_Rombous_Pattern(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }

        for(int k=1;k<=n;k++){
            if(i==1||i==n||k==1||k==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");

            }
        }
        System.out.println();
    }
}

public static void Daimand_Pattern(int n){
  //  int count=0;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=(2*i-1);k++){
            System.out.print("*");
            
        }
        
        System.out.println();
    }
    for(int i=n;i>=1;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=(2*i-1);k++){
            System.out.print("*");
        }
        System.out.println();
    }
}
public static void main(String[] args){
    System.out.println("Hello World");
    hollow_square(10,7);
    System.out.println("Inverted and roteted piramid : ");
    Inverted_Reverese(10);
    //System.out.println("Inverted piramid: ");
    Inverted_piramid(10 );
    System.out.println("Inverted and reverse number");
    Inverted_Reverse_num(10);
   // System.out.println("Inverted number piramid");
    Inverted_Number(10);
    System.out.println("Floads Trangle ");
    Floads_Trangle(10);
    System.out.println("One - Zero Trangle ");
    Zero_One_Trangle(10);
    System.out.println("Butterfly pattern ");
    Butterfly_Pattern(10);
    System.out.println("New butterfly");
    Butterfly(10);
    System.out.println("Solid Rombous pattern");
    Solid_Rombous_pattern(10);
    System.out.println("Hollow Rombous Pattern");
    Hollow_Rombous_Pattern(10);
    System.out.println("Diamand Pattern");
    Daimand_Pattern(10);
   
    }
}
