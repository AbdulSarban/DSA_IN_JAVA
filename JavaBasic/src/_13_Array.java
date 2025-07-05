import java.util.*;


public class _13_Array {

    public static void Update(int marks[],int unchange){
        unchange=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }

   public static void Max_Array(int arr[]){
        int max=Integer.MIN_VALUE;

        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum num is: "+max);
        System.out.println("Minimum num is: "+min);

   }

   public static int Linear_Search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
            
        }
        return -1;
   }


   public static int Binary_Search(int arr[],int key){
        int l=0;
        int h=arr.length-1;

        while(h>l){
            int mid=((l+h)/2);

            if(arr[mid]==key){
                return mid;
            }else if(key>arr[mid]){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return -1;
   }

 
    public static void Reverse_Array(int arr[]){
        // Extra space is required as another array used to store elements.
        int l=arr.length;
        int b[]=new int[l];
        int i,j;
       for(j=0,i=l-1;j<l;j++,i--){
            b[j]=arr[i];

       }
       for(int k=0;k<l;k++){
        arr[k]=b[k];
       }

   }

   public static void display(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
   }

   public static void Reverse_Array_Swap(int arr[]){ //No Extra space is required  
        int length=arr.length;
        int i,j;
        for(i=0,j=(length-1);i<j;i++,j--){//similary it can be written using while loop
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

        }

   }

   public static void Mearge(int arr1[],int arr2[]){
        int i=0;
        int j=0;
        int k=0;
        int arr1_length=arr1.length;
        int arr2_length=arr2.length;
        int arr3[]=new int[(arr1_length + arr2_length)];

        while(i<arr1_length && j<arr2_length){

            if(arr1[i]<arr2[j]){
                arr3[k++]=arr1[i++];
            }else{
                arr3[k++]=arr2[j++];
            }
        }

        while(i<arr1_length){
            arr3[k++]=arr1[i++];
        }
        while(j<arr2_length){
            arr3[k++]=arr2[j++];
        }
        display(arr3);
   }

   public static void Union(int arr1[],int arr2[]){
        int i=0;
        int j=0;
        int k=0;
        int arr1_length=arr1.length;
        int arr2_length=arr2.length;

        int arr3[]=new int[(arr1_length + arr2_length)];

    while(i<arr1_length && j<arr2_length){

        if(arr1[i]<arr2[j]){
            arr3[k++]=arr1[i++];
        }
        else if(arr1[i]>arr2[j]){
            arr3[k++]=arr2[j++];
        }
        else{
            arr3[k++]=arr1[i++];
            j++;
        }

    }
     
    while(i < arr1_length){
        arr3[k++]=arr1[i++];
    }

    while(j < arr2_length){
        arr3[k++]=arr2[j++];
    } 

    display(arr3);
   }

   public static void Intersection(int arr1[],int arr2[]){
        int i=0;
        int j=0;
        int k=0;
        int arr1_length=arr1.length;
        int arr2_length=arr2.length;
        int arr3[]=new int[(arr1_length + arr2_length)];

        while(i<arr1_length && j<arr2_length){

            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                arr3[k++]=arr1[i++];
                j++;
            }
        }
        display(arr3);
   }

   public static void Diffrence(int arr1[],int arr2[]){
        int i=0;
        int j=0;
        int k=0;
        int arr1_length=arr1.length;
        int arr2_length=arr2.length;
        int arr3[]=new int[(arr1_length + arr2_length)];

        while(i<arr1_length && j<arr2_length){
            if(arr1[i]<arr2[j]){
                arr3[k++]=arr1[i++];
            }
            else if(arr1[i]>arr2[j]){
                i++;
                j++;
            }
            else{
                i++;
                j++;
            }

        }
        while(i<arr1_length){
            arr3[k++]=arr1[i++];
        }

        display(arr3);
   }

    public static void main(String[] args){
        System.out.println("Hello World");
        int arr[]=new int[5];
        Scanner s=new Scanner(System.in);
        
        int marks[]={78,89,90,45,30};
        int arr2[]={2,4,6,8,10};
        int unchange=5;
        int len=marks.length;

        System.out.println("Length of marks Array is  "+len);
        System.out.println("Index of last element -> length-1: "+(len-1));
        System.out.println("Enter the numbers: ");
        for(int i=0;i<5;i++){
            arr[i]=s.nextInt();
        }

        System.out.println("Your number ");
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Variale in main "+unchange);
        //ssUpdate(marks,unchange);

        System.out.println("Variable after update "+unchange);

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }

        System.out.println();

        Max_Array(marks);


        int index=Linear_Search(marks,78);

        if(index==-1){
            System.out.println("Key is not found");
        }
        else{
            System.out.println("Key is at index: "+index);
        }

        int binary=Binary_Search(marks,78);

        if(binary==-1){
            System.out.println("Key is not found");
        }else{
            System.out.println("Key is found at index: "+binary);
        }

        System.out.println("Before reverse: ");
        display(arr);
        System.out.println("After reverse with extra space method :");
        Reverse_Array(arr);
        display(arr);

        System.out.println("Before Reverse: ");
        display(arr2);
        System.out.println("After reverse using Swap method: ");
        Reverse_Array_Swap(arr2);
        display(arr2);

        System.out.println("Mearge 2 array: ");
        int a1[]={2,4,6,8,10,12};

        int a2[]={1,3,5,7,9};
        
        Mearge(a1,a2);

        int b1[]={2,4,6,8,9};
        int b2[]={1,2,3,5,7};
    
        System.out.println("Union of 2 array ");
        Union(b1,b2);

        int c1[]={2,4,6,8,10};
        int c2[]={2,3,6,8,10};
        System.out.println("Intersection of 2 Array ");
        Intersection(c1,c2);
        System.out.println("Difference between two array");
        int d1[]={1,2,3,4,5};
        int d2[]={2,4,6,8};
        Diffrence(d1,d2);
        int num[]={10,2,5};
        Arrays.sort(num);
        display(num);

        System.out.println(5+3/2);
        s.close();
    }
}
