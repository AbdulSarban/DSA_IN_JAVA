public class _13_Array_Problems {
    public static int One_Missing(int arr[],int n){//Method for finding missing element in 1st n natural numbers
        int n_sum=(n*(n+1))/2;

        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }

        int missing_num=n_sum-sum;

        return missing_num;
    }

    public static void One_Missing_Unkonw(int arr[],int l){
        int diff=l-0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]-i!=diff){
                System.out.println("Missing number is: "+(diff+i));
                break;
            
            }
        }
    }
    
    public static void Multiple_Missing(int arr[],int l){
        int diff=l-0;

        for(int i=0;i<arr.length;i++){
            if((arr[i]-i)!=diff){
                while(diff<(arr[i]-i)){
                    System.out.println("Missing element: "+(diff+i));//diff : previous , i: current number
                    diff++;
                }
            }
        }
    }

    public static void Multiple_missing_By_Bitset(int arr[],int l,int h){//this function use the the HashTable method or also can say
        //BitSet method;

        int Hash[]=new int[h+1];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=l && arr[i]<=h){
                Hash[arr[i]]++;
            }
        }

        for(int j=l;j<h;j++){
            if(Hash[j]==0){
                System.out.println("Missing Number: "+j);
            }
        }

    }

    public static void Duplicate(int arr[]){
        int count=0;
        int lastDuplicate=-1;
        for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j] && arr[i]!=lastDuplicate){
                System.out.println("Duplicate: "+arr[i]);
                lastDuplicate=arr[i];
                count++;
            }
           }
        }
        System.out.println("Count for duplicate: "+count);
    }

    public static void Duplicate_Modify(int arr[]){
        int lastDuplicate=-1;//Not consider zero because 0 may also duplicated 
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1] && arr[i]!=lastDuplicate){
                System.out.println("Duplicate: "+arr[i]);
                lastDuplicate=arr[i];
                count++;

            }
        }
        System.out.println("Duplicate count: "+count);
    }

    public static void Duplicate_count(int arr[]){
        //int lastDuplicate=-1;
        //int count=0;
        int j;

        for(int i=0;i<(arr.length);i++){
            if(arr[i]==arr[i+1]){
                j=i+1;
                while(j<arr.length && arr[j]==arr[i]){
                    j++;
                }
                System.out.println(arr[i]+" Repeated at "+(j-i)+" Times");
                i=j-1;
            }
        }
    }

    public static void Duplicate_By_Hashtable(int arr[]){
        int max=0;
        for(int num=0;num<arr.length;num++){
            if(arr[num]>max){
                max=arr[num];
            }
        }

        int frequency[]=new int[max+1];

        for(int num=0;num<arr.length;num++){
            frequency[arr[num]]++;
        }

        for(int i=0;i<frequency.length;i++){
            if(frequency[i]>1){
                System.out.println("Duplicate num: "+i+" repeted for "+frequency[i]+" Times");
            }
        }
    }

    public static void Duplicate_Unsorted(int arr[]){

        for(int i=0;i<(arr.length-1);i++){
            int count=1;

            if(arr[i]!=-1){
                for(int j=i+1;j<arr.length;j++){

                    if(arr[i]==arr[j]){
                        count++;
                        arr[j]=-1;
                    }
                }
                if(count>1){
                    System.out.println("Duplicate num: "+arr[i]+" repeted for "+count+" Times");
                }
            }
        }
    }


    public static void Pair(int arr[],int n){
        for(int i=0;i<(arr.length-1);i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==n){
                    System.out.println("Result : "+n+" Obtained from "+arr[i]+" And "+arr[j]);
                }
            }
        }
    }

    public static void Pair_HashTable(int arr[],int n){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int hash[]=new int[max+1];

        for(int i=0;i<arr.length;i++){
            int complent=n-arr[i];
            if(complent>=0 && complent <=max && hash[complent]!=0){
                System.out.println("Result: "+n+" Obtained from "+(n-arr[i])+" And "+arr[i]);
            }
            hash[arr[i]]++;
            //complent>=0 && complent <=max  : these conditions are used to ensure array can't go out of index
            //hash[complent]>0 : This condition used to obtained the pair of numbers 
        }
    }

    public static void Pair_Sorted_Array(int arr[],int n){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            /* in place of while loop the for loop can be used in the following manner
            for(i=0,j=(arr.length-1);i<j; ){ //Here increment or decrement is blank.

            //Same code as in while loop 
            }
             
             */
            if(arr[i]+arr[j]==n){
                System.out.println("Result : "+n+" Obtained from "+arr[i]+" And "+arr[j]);
                i++;
                j--;
            }
            else if(arr[i]+arr[j]>n){
                j--;
            }
            else{
                i++;
            }
        }
        
    }

    public static void Min_Max_of_Array(int arr[]){
        int min=arr[0];
        int max=arr[0];

        for(int i=1;i<arr.length;i++){

            if(arr[i]<min){
                min=arr[i];
            }
            else if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }

    public static void main(String[] args){
        System.out.println("Hello World");
        int arr[]={1,2,3,4,5,6,8,9,10,11,12};
        System.out.println("Missing number from array: "+ One_Missing(arr,12));

        int arr2[]={6,7,8,9,10,11,13,14,15,16,17};
        One_Missing_Unkonw(arr2,6);
        int arr3[]={2,3,4,6,7,8,11,12};
        Multiple_Missing(arr3,2);
        System.out.println("Hashatable method: ");
        int arr4[]={3,4,1,2,6,10,7,8,12};
        Multiple_missing_By_Bitset(arr4,1,12);

        System.out.println("Function to find duplicate ");
        int arr5[]={3,3,4,4,5,6,7,7,7,8,9,9,10,10};

        Duplicate(arr5);

        System.out.println("Another method for duplicate ");
        Duplicate_Modify(arr5);

        System.out.println("Method to print how many time number duplicated: ");
        Duplicate_count(arr5);


        System.out.println("Duplicate for unsorted Array");

        int arr6[]={5,1,4,5,7,8,2,1,5};
        Duplicate_Unsorted(arr6);

        System.out.println("Duplicate by HashTable method: ");
        Duplicate_By_Hashtable(arr5);

        int arr7[]={6,8,3,4,5,6,5};
        System.out.println("Find Pair by Genral method : ");
        Pair(arr7,10);
        System.out.println("Find Pair by HashTable method: ");
        Pair_HashTable(arr7,10);

        int arr8[]={1,2,3,4,5,5,6,7,8,9,10};
        System.out.println("Find Pair in Sorted Array: ");
        Pair_Sorted_Array(arr8,10);

        int arr9[]={9,4,5,2,6,-1,12,15};
        System.out.println("Minimum and Maximum Number from Array: ");
        Min_Max_of_Array(arr9);

        
        
    }
}
