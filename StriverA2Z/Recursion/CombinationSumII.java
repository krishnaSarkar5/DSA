import java.util.*;

public class CombinationSumII {
    

    static void findCombination(int index,int target,int[] arr,List<Integer> ds,List<List<Integer>> ans){
      
            if(target==0){
                ans.add(new ArrayList<>(ds));  
                return;            
            }                 
            for(int i=index;i<arr.length;i++){

                if(i>index && arr[i]==arr[i-1]){
                    continue;
                }
                
                if(arr[i]>target) break;

                ds.add(arr[i]);
                findCombination(i+1, target-arr[i], arr, ds, ans);
                ds.remove(ds.size()-1);
            }
    }


    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();

        int[] arr = {10,1,2,7,6,1,5};

        Arrays.sort(arr);

        findCombination(0, 8, arr, new ArrayList<>(), ans);


        System.out.println(ans);
    }
}
