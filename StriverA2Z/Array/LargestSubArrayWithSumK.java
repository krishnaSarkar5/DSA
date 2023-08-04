import java.util.*;

public class LargestSubArrayWithSumK {
    

    static int findLargestSubarray(int[] arr,int target){

        int max=0;

        Map<Integer,Integer> map = new HashMap<>();
        
        int sum = 0;
        
        for(int i=0;i<arr.length;i++){

            sum+=arr[i];

            if(sum==0){
                max = Math.max(max,i+1);
            }

            int rem = sum-target;            // 9, -3, 3, -1, 6, -5

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
        
        int[] arr = {9, -3, 3, -1, 6, -5};

        int target = 0;

        System.out.println(findLargestSubarray(arr, target));

    }
}
