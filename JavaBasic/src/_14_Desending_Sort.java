public class _14_Desending_Sort {

    public static void Bouble_Sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    
    public static  void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    } 
    public static void main(String[] args){
        //System.out.println("Hello World");
        int arr[]={4,2,5,1,6,3,7};
        Bouble_Sort(arr);
        display(arr);

    }
}
