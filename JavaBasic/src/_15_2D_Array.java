import java.util.*;

public class _15_2D_Array {

    public static void display(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void search(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.println("Element found at cell ("+i+","+j+")");
                }
            }
        }
        
    }


    public static void Min_Max(int arr[][]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                max=Math.max(arr[i][j],max);
                min=Math.min(arr[i][j],min);
            }
        }
        System.out.println("Maximum num: "+max);
        System.out.println("Minimum num: "+min);
        
    }
    

    public static void Print_Spiral(int arr[][]){
        int startRow=0;
        int startCol=0;
        int endRow=arr.length-1;
        int endCol=arr[0].length-1;

        while(startRow<=endRow && startCol<=endCol){

            //print top element   : row number is same: 0, col number increases from 0 t0 3;  use j for col
            for(int j=startCol;j<=endCol;j++){
                System.out.print(arr[startRow][j]+" ");
            }

            //Print right element , row number increases from 0 to 3 , col remain same i.e. 3 : use i for row
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(arr[i][endCol]+" ");
            }

            //Print bottom element , col number decreses from 3 to 0 , row remain same i.e. 3 ;use j for col

            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(arr[endRow][j]+" ");
            }

            //Print left element , row number decreses from 3 to 0 , col remain same i.e. 0 ; use i for row;
            
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(arr[i][startCol]+" ");
            }

            //Above code for outer loop , folling code suppot inner loops
            startRow++;
            endRow--;
            startCol++;
            endCol--;



        }
        System.out.println();
    }

    public static int Digonal_Sum(int arr[][]){

        int n=arr.length;
        int sum=0;
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){

                if(i==j){
                    sum+=arr[i][j];
                }
                else if(i+j==(n-1)){
                    sum+=arr[i][j];
                }
            }
        }

        
        return sum;
        
    }

    public static int Optimised_Digonal_Sum(int arr[][]){
        int sum=0;

        for(int i=0;i<arr.length;i++){

            sum+=arr[i][i];

            if(i!=(arr.length-1-i)){
                sum+=arr[i][arr.length-1-i];
            }
        }
        return sum;
    }

    public static void StairCase_Search(int arr[][],int key){

        int row=0;
        int col=arr[0].length-1;

        while(row < arr.length && col>=0){

            if(arr[row][col]==key){
                System.out.println("Key : "+key+" found at ("+row+","+col+")");
                return;// If we don't write return then it work as infite loop and print same thing again and again
            }
            else if(key < arr[row][col]){
                col--;
            }
            else if(key > arr[row][col]){
                row++;
            }
        }

        System.out.println("Not found ");
    }

    public static void StairCase_Search_2(int arr[][],int key){

        int row=arr.length-1;
        int col=0;


        while(row >= 0 && col<arr[0].length){

            if(arr[row][col]==key){
                System.out.println("Key : "+key+" found at ("+row+","+col+")");
                return;
            }
            else if(key<arr[row][col]){
                //go top
                row--;
            }else{
                //go right
                col++;
            }
        }

        System.out.println("Not found");
    }

    // Practice  Problems------------------------------------------------------------------------------------------------------

    public static void Count_Num(int arr[][],int n){
        int count=0;//Time complexity is O(n^2) 

        //This is not a good time complexity;
        //Here we use linear search algoritham
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==n){
                    count++;
                }
            }
        }

        System.out.println("Count: "+count);
    }
    
    public static void Second_Row_Sum(int arr[][],int r){
        int sum=0;
        int row=r;
    
        int col=0;
        while(col<arr[0].length){
            sum+=arr[row][col];
            col++;
        }
        System.out.println("Sum of 2nd row elements: "+sum);
    }

    public static void Transpose(int arr[][]){
        int row=arr.length;
        int col=arr[0].length;
        System.out.println("Original Array ");
        display(arr);

        int transe[][]=new int[col][row];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transe[j][i]=arr[i][j];
            }
        }
        System.out.println("Transpose of Array ");
        display(transe);
        
    }
    public static void input(){
        int arr2[][]=new int [3][3];

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                arr2[i][j]=sc.nextInt();
            }
            
        }
        System.out.println("You enterd: ");
        display(arr2);
        
    }
   
    public static void main(String[] args){
        //System.out.println("Hello world");

        int arr[][]={{7,2,3},{4,5,6},{11,12,15}};
        display(arr);

        

        

        search(arr,5);

        Min_Max(arr);

        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        Print_Spiral(matrix);

        System.out.println("Total digonal sum: "+Digonal_Sum(matrix));

        System.out.println("Optimised digonal sum: "+Optimised_Digonal_Sum(matrix));

        int arr4[][]={{10,20,30,40},
                      {15,25,35,45},
                      {27,29,37,48},
                      {32,33,39,50}
        };

        StairCase_Search(arr4,33);
        StairCase_Search_2(arr4,40);
        int arr5[][]={{4,7,8},
                      {8,8,7}
        };
        System.out.println("-----------Practice Problems------------");
        Count_Num(arr5,7);

        int arr6[][]={{1,4,9},
                      {11,4,3},
                      {2,2,3}
        };
        Second_Row_Sum(arr6,1);

        System.out.println("Transpose of array function: ");
        int arr7[][]={{2,3,7},
                      {5,6,7}
        };
        Transpose(arr7);

        
            
    }
}
