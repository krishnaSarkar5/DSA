import java.util.HashMap;
import java.util.Map;

public class MaximumSubarraySum{

    static int maxSubarrayLengthBruteforce(int[ ] arr,int target){

        int sum = 0,max=0;
        
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){

                sum=sum+arr[j];
                if(sum==target){
                   max =  Math.max(max, j-i+1);       
                }              
            }
        }

        return max;

    }


    static int maxSubarrayLengthUsingHash(int[] arr,long target){

        Map<Long,Long> map = new HashMap<>();
        long sum = 0, max=0;

        for(int i=0;i<arr.length;i++){

            sum=sum+arr[i];

            long rem = sum-target;

            if(sum==target){
                max=Math.max(max, i+1);
            }

            if(map.containsKey(rem)){
                max = Math.max(max,i-map.get(rem));
            }

            if(!map.containsKey(sum)){
                map.put(sum, (long)i);
            }

        }

        return (int)max;

    }



    static int maxSubarrayLengthOptimal(int[] arr,int target){

        
        int sum = 0, max=0;
        int i=0,j=0;

        while(j<arr.length){

           if(sum<target){
             sum = sum+arr[j];
             j++;
           }else if(sum==target){
                max=Math.max(max, j-i+1);
                sum = sum+arr[j];
                
            }else if(sum>target){
                sum=sum-arr[i];
                i++;
            }
            

        }

        return max;

    }


    public static void main(String[] args) {
        int[] arr = {1,2,1,3};
        int target = 2;

        // System.out.println(maxSubarrayLengthBruteforce(arr, target));
        // System.out.println(maxSubarrayLengthUsingHash(arr, target));
        System.out.println(maxSubarrayLengthOptimal(arr, target));
    }
}