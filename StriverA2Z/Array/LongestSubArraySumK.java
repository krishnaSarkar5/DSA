public class LongestSubArraySumK {
    
    // this will right if target != 0
    static int findLargestSubarrayOptimal(int[] arr,int target){

        int l =0 , r = 0;
        int sum=arr[0],max=0;

        while(r<arr.length){

            while(l<=r && sum > target){ // 2,3,5,1,9
                sum-=arr[l];
                l++;
            }

            if(sum==target){
                max=Math.max(max, r-l+1);
            }

            r++;

            if(r<arr.length){
                sum+=arr[r];
            }

        }
        return max;
    }

    public static void main(String[] args) {
        
        int[] arr = {2,3,5,1,9};

        int target = 10;

        System.out.println(findLargestSubarrayOptimal(arr, target));

    }
}
