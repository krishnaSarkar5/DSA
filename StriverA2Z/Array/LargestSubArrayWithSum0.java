import java.util.*;

public class LargestSubArrayWithSum0 {
    

    static int findLargestSubarray(int[] arr,int target){

        int max=0;

        Map<Integer,Integer> map = new HashMap<>();
        
        int sum = 0;
        
        for(int i=0;i<arr.length;i++){

            sum+=arr[i];

            if(sum==0){
                max = Math.max(max,i+1);
            }

            int rem = sum-target;            

            if(map.containsKey(rem)){
                max=Math.max(max,i-map.get(rem));
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }

        }

        return max;

    }

    public static void main(String[] args) {
        
        int[] arr = {2,3,5,1,9};

        int target = 10;

        System.out.println(findLargestSubarray(arr, target));
    }
}
