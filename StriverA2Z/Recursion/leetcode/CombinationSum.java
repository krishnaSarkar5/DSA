package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    

    static void findCombinationSum(int index,int target,int[] nums,List<Integer> temp,List<List<Integer>> result){

        if(index>=nums.length){
            return;
        }
        if(target==0){
                result.add(new ArrayList<>(temp));
                return;
            }
        

        if(nums[index]<=target){
            temp.add(nums[index]);
            findCombinationSum(index, target-nums[index], nums,temp,result);
            temp.remove(temp.size()-1);
            
        }
            findCombinationSum(index+1, target, nums,temp,result);
        

        
    }


    public static void main(String[] args) {
        
        List<List<Integer>> result = new ArrayList<>();


        int[] nums = {8,7,4,3};

        findCombinationSum(0, 11, nums, new ArrayList<>(), result);

        System.out.println(result);

    }
}
