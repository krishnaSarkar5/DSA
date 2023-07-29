import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    
    static List<Integer> findTwoSumBruteForce(int[] arr,int target){

        // time complexity O(n2)

        List<Integer> temp = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum = arr[i]+arr[j];
                if(sum==target){
                    temp.add(i);
                    temp.add(j);
                    break;
                }
            }
        }

        return temp;
    }


    static List<Integer> findTwoSumOptimalUsingHash(int[] arr,int target){


         // time complexity O(nlogn)

        List<Integer> temp = new ArrayList<>();

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i], i);

        }

        for(int i=0;i<arr.length;i++){
            int more = target-arr[i];

            if(map.containsKey(more)){
                temp.add(i);
                temp.add(map.get(more));
                break;
            }
        }
        return temp;

    }

    static List<Integer> findTwoSumOptimalWithoutHashing(int[] arr,int target){
        List<Integer> temp = new ArrayList<>();

        Arrays.sort(arr);
       

        int i=0 ,j=arr.length-1;

        while(i<j){

            int sum = arr[i]+arr[j];

            if(sum>target){
                j--;
            }else if(sum<target){
                i++;
            }else{
                temp.add(arr[i]);
                temp.add(arr[j]);
                return temp;
            }
            

        }
        return null;
    }




// 2 5 6 8 11

    public static void main(String[] args) {
        
        int[] arr = {2,6,5,8,11};
        int target = 14;

        System.out.println(findTwoSumBruteForce(arr, target));
        System.out.println(findTwoSumOptimalUsingHash(arr, target));
        System.out.println(findTwoSumOptimalWithoutHashing(arr, target));


    }
}
