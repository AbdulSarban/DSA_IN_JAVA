
public class Leetcode_Mearge_Array {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int k=0;
        int num1_len=nums1.length;
        int num2_len=nums2.length;
        int nums3[]=new int[(m + n)];

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                if(nums1[i]==0){
                    i++;
                }
                else{
                    nums3[k++]=nums1[i++];
                }
                
            }
            else{
                nums3[k++]=nums2[j++];
            }
        }
        //while(i<nums1.length){
          //  nums3[k++]=nums1[i++];
        //}
        while(j<nums2.length){
            nums3[k++]=nums2[j++];
        }
        for(int l=0;l<nums3.length;l++){
            System.out.print(nums3[l]+" ");
        }
        System.out.println();
    }

    public static int search(int[] nums, int target) {
        int start=0;
        int end=nums.length - 1;
       
        while(start<=end){
            int mid=((start+end)/2);

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args){

        int nums1[]={1,2,3,0,0,0};
        int nums2[]={2,5,6};

        merge(nums1,3,nums2,3);

        int arr[]={1,2,3,4,5,9};

        System.out.println(search(arr,9));
    }
}
