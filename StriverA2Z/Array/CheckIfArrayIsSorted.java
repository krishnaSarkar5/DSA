public class CheckIfArrayIsSorted {
    
    static boolean isSorted(int[] nums){

        int count =0;

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                count++;
            }
        }


        if(count==0){
            return true;
        }else if(count==1 && nums[0]>=nums[nums.length-1]){
            return true;
        }


        return false;
    }
    




    public static void main(String[] args) {
        int[] arr = {1,1,1};
        System.out.println(isSorted(arr));
    }
}
