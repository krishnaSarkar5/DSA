public class MaxCosecutive2 {
    
    public static int traffic(int n, int m, int []vehicle) {
        // Write your code here.

        int count=0,max=0;
        int j=0;

        while(j<vehicle.length-m){

        

            int[] temp = new int[vehicle.length];
            int x = m;

            for(int i=0;i<vehicle.length;i++){

    
                if(i<j || x==0 || vehicle[i]==1){
                    temp[i]=vehicle[i];
                }else if(vehicle[i]==0 && x>0){
                    temp[i]=1;
                    x--;
                }
            }

         count =  findMaxConsecutiveOnes(temp);

            if(max<count){
                max=count;
            }
            j++;
        }
        
        return max;
    }


    public static int findMaxConsecutiveOnes(int[] nums) {
        
        int max=0 ,count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }else{
                count=0;
            }
            if(count>max){
                max=count;
            }
        }

        return max;

    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,0,1,0};
        int n = 6;
        int m=3;
        System.out.println(traffic(n, m, arr));
    }
}
