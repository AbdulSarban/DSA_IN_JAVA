public class _13_Pair_Array {
    public static void Print_Pair(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")"+" ");
                tp++;
            }
            System.out.println();
            
        } 
        System.out.println("Total Pair In This Array : "+tp);

        /*
         * Formula for total pairs is given by;
         *  TP=n*(n-1)/2;
         */
    }

    public static void Print_SubArray(int arr[]){
        int ts=0;
        
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                    
                }
                System.out.println();
                ts++;// n*(n+1)/2;
                
                

            }
            System.out.println();

        }
        System.out.println("Toatl sub Array: "+ts);
        
    }

    public static void Max_Sub_Array_Sum(int arr[]){

        int current_Sum=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                current_Sum=0;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                    current_Sum+=arr[k];
                }
                System.out.println("Sum: "+current_Sum);
                //System.out.println();
                if(current_Sum>max){
                    max=current_Sum;
                }

            }
            System.out.println();

        
        }
        System.out.println("Maximum sum of sub Array: "+max);
    }

    public static void Max_Sub_Subarray_By_Prefix_Array(int arr[]){
        int prefix[]=new int[arr.length];
        int current_sum=0;
        int max=Integer.MIN_VALUE;

        int p=0;
        for(int i=0;i<arr.length;i++){
            p+=arr[i];
            prefix[i]=p;
        }

        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;

                if(start==0){
                    current_sum=prefix[end];
                }else{
                    current_sum=prefix[end]-prefix[start-1];
                }

                if(current_sum>max){
                    max=current_sum;
                }
            }
        }
        System.out.println("Max: "+max);
    }

    public static void Max_SubArray_Sum_By_Kadanes_Algorithm(int arr[]){
        int current_sum=0;
        int max=Integer.MIN_VALUE;
        int sum=0;
        int m=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(m<arr[i]){
                m=arr[i];
            }
            sum+=arr[i];
            
        }

        if(sum<0){
            System.out.println("Max: "+m);
        }
        else{

            for(int i=0;i<arr.length;i++){
                current_sum+=arr[i];

                if(current_sum<0){
                    current_sum=0;
                }

                max=Math.max(max,current_sum);
            }
            System.out.println("Max: "+max);
        }
    }

    public static int Trapped_Water(int height[]){
        // calculate left max Array : also called as Auxillary Array
        int n=height.length;
        int Leftmax[]=new int[n];

        Leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            Leftmax[i]=Math.max(height[i],Leftmax[i-1]);
            /*
             * We have started the array from i=1 because we set leftmaxt to the 0th index
             * we are at 1st index and we will compair the max with previous i.e max for 0th index.
             */
        }
        // Calculate Right max Array
        int Rightmax[]=new int[n];

        Rightmax[n-1]=height[n-1];//Note that we are starting from the lastmost position.
        for(int i=n-2;i>=0;i--){
            Rightmax[i]=Math.max(height[i],Rightmax[i+1]);
            
            /*
             * As we start from right most position i.e. from index n-1;
             * As intial max is at n-1 index so we can intialize the loop with n-2;  
             */
        }

        //loop
        int trapped_water=0;
        for(int i=0;i<n;i++){
            int water_level=Math.min(Leftmax[i],Rightmax[i]);
            trapped_water+=water_level-height[i];
            /*
             * here we have used the following formula
             * tp=water_level-height
             */

        }

        return trapped_water;


    }

    public static int BuySell_Stocks(int prices[]){

        int BuyPrice=Integer.MAX_VALUE;
        int MaxProfit=0;

        for(int i=0;i<prices.length;i++){
            if(BuyPrice<prices[i]){// Profit is possible 
                int profit=prices[i]-BuyPrice; //Today's profit 
                MaxProfit=Math.max(MaxProfit,profit); //Overall profit compared with previous and current.
            }else{
                BuyPrice=prices[i];
            }
        }
        return MaxProfit;
    }

    public static String reverse(String s){
        String r="";
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);

            r=ch+r;
        }
        return r;
    }
    public static void main(String[] args){
        System.out.println("Hello world");

        int arr[]={2,4,6,8,10};
        System.out.println("Pairs from the array: ");
        Print_Pair(arr);

        System.out.println("Sub Array from the Array: ");
        Print_SubArray(arr);
        System.out.println("The maximum sum of subarry from array: (Positive numbers)");
        Max_Sub_Array_Sum(arr);
        System.out.println("The maximum sum of subarray from array: (May contain Negative numbers)");
        int arr2[]={2,-1,6,-2,8};
        Max_Sub_Array_Sum(arr2);

        System.out.println("Maximum Sub Array sum by using Prefix array: ");
        Max_Sub_Subarray_By_Prefix_Array(arr);
        System.out.println("Maximum sub Array sum by using KADANES Algoritham ");

        int arr3[]={-1,-2,-3,-5};
        Max_SubArray_Sum_By_Kadanes_Algorithm(arr3);

        System.out.println();

        int arr4[]={4,2,0,6,3,2,5};
        System.out.println("Total trapped water in the bars will be: "+Trapped_Water(arr4));

        System.out.println();


        int arr5[]={7,1,5,3,6,4};
        System.out.println("Maximum profit obtained from the stocks: "+BuySell_Stocks(arr5));

        String s1="bank";
        String s2="knab";
        String s3=reverse(s2);
        if(s1.equals(s3)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
