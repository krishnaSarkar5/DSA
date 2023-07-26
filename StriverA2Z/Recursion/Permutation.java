import java.util.ArrayList;
import java.util.List;

public class Permutation {
    


    static void findPermutation(int[] arr,List<Integer> ds,List<List<Integer>> ans,boolean[] freq){

        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
        
        }


        for(int i=0;i<arr.length;i++){
            if(!freq[i]){
            ds.add(arr[i]);
            freq[i]=true;
            findPermutation( arr, ds, ans,freq);
            ds.remove(ds.size()-1);
            freq[i]=false;
            }        
        }

    }


    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();

        int[] arr = {1,2,3};

        boolean[] freq = new boolean[arr.length];

        findPermutation( arr, new ArrayList<>(), ans,freq);

        System.out.println(ans);
    }
}
