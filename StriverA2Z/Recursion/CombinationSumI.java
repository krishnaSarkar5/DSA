import java.util.*;

public class CombinationSumI {
    
    static void findCombination(int index,int target,int[] arr, List<Integer> ds,List<List<Integer>> ans){

        if(index>=arr.length){

            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return ;
        }

        if(arr[index]<=target){
            ds.add(arr[index]);
            findCombination(index, target-arr[index], arr, ds, ans);
            ds.remove(ds.size()-1);
        }
        findCombination(index+1, target, arr, ds, ans);
    } 





    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        
        List<List<Integer>> ans = new ArrayList<>();
        
        findCombination(0, 7, arr, new ArrayList<>(), ans);

        System.out.println(ans);
    }
}
