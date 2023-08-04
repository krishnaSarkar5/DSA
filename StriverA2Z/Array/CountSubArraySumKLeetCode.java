import java.util.HashMap;
import java.util.Map;

public class CountSubArraySumKLeetCode {
    
    public static int subarraySum(int[] nums, int k) {
        
        int sum = 0,c=0;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            sum+=nums[i];

            if(sum==k){
                c++;
            }

            int rem = sum-k;

            if(map.containsKey(rem)){
                c+=map.get(rem);
            }


            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }else{
                map.put(sum,1);
            }

        }
        return c;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k=3;
        System.out.println(subarraySum(arr, k));
    }
}
