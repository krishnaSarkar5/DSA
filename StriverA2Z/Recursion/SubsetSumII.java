import java.util.ArrayList;
import java.util.List;

public class SubsetSumII {
    
    static void findSubset(int index,int[] arr ,List<Integer> ds,List<List<Integer>> ans){

       
            ans.add(new ArrayList<>(ds));
      

        for(int i=index;i<arr.length;i++){

            if(i!=index && arr[i]==arr[i-1]) continue;

            ds.add(arr[i]);
            findSubset(i+1, arr, ds, ans);
            ds.remove(ds.size()-1);
        }

    }




    public static void main(String[] args) {
        
        int[] arr = {1,2,2,3};

        List<List<Integer>> ans = new ArrayList<>();

        findSubset(0, arr, new ArrayList<>(), ans);

        System.out.println(ans);

    }
}
