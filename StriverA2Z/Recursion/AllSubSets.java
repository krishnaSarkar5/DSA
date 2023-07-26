import java.util.ArrayList;
import java.util.List;

public class AllSubSets {
    

public static void main(String[] args) {
    
        
        List<List<Integer>> result = new ArrayList<>();

        int[] nums = {1,2,3};

        generateSubset(0,nums,new ArrayList<>(),result);

       System.out.println(result);

    }

    public static void generateSubset(int index,int[] nums,List<Integer> temp,List<List<Integer>> result){

        if(index>=nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }

        
        temp.add(nums[index]);
        generateSubset(index+1,nums,temp,result);
        temp.remove(temp.size()-1);
        generateSubset(index+1,nums,temp,result);

    }


}
