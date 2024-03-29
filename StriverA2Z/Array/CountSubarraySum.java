import java.util.*;

public class CountSubarraySum {
    

    static int countSubarray(int[] arr,int target){

        int sum=0;
        int count=0;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(sum==target){
                count++;
            }

            int rem = sum-target;

            if(map.containsKey(rem)){
                count++;
            }

            if(!map.containsKey(sum)){
                map.put(sum, i);
            }

        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr = {9, -3, 3, -1, 6, -5};
        int target = 0;
        System.out.println(countSubarray(arr, target));
    }
}
