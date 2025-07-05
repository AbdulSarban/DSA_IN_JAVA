public class _14_Sorting_Methods {

    /*public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }*/

    public static void Unknown_Sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void Bubble_Sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void Selection_Sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minPos=i;
            for(int j=i+1;j<n;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            //swap

            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }

    public static void Insertion_Sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;

            while(prev >=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }

            arr[prev+1]=curr;
        }
    }

    public static void Counting_Sort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }

        int count[]=new int[largest+1];

        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        System.out.println("Hello world");
        int arr1[]={10,1,5,1,4,3,2};
        int arr2[]={5,1,4,3,2};
        int arr3[]={10,5,1,4,3,2};
        int arr4[]={8,1,5,3,2,4,7,6};
        int arr5[]={2,1,4,3,1,3,5,7,5,2};
        System.out.println("Sort array using similar algorithm like Selection Sort");
        Unknown_Sort(arr1);
        display(arr1);
        Bubble_Sort(arr2);
        System.out.println("Sort Array using Bubble Sort algoritham ");
        display(arr2);
        System.out.println("Sort Array using Selection sort algoritham ");
        Selection_Sort(arr3);
        display(arr3);
        System.out.println("Sort Array using Insertion sort algoritham");
        Insertion_Sort(arr4);
        display(arr4);

        System.out.println("Sort Array using Counting sort algoritham ");
        Counting_Sort(arr5);
        display(arr5);




    }
}
