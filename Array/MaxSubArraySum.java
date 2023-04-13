public class MaxSubArraySum {
    

    public static int maxSum(int[] arr){

        int sum=0,maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                
                sum += arr[j];

                if(sum>maxSum)
                    maxSum=sum;

            }
        }


        return maxSum;
    }


    public static int maxSumAlternative(int[] arr){

        int[] maxEnding = new int[arr.length];
        int result = Integer.MIN_VALUE;
        maxEnding[0] = arr[0];

        for(int i= 1;i<arr.length;i++){
         maxEnding[i] =  Math.max((maxEnding[i-1]+arr[i]),arr[i]);
        }

        for(int i= 1;i<arr.length;i++){
            if(result<maxEnding[i]){
                result=maxEnding[i];
            }
           }
   

        return result;
    }



    public static void main(String[] args) {
        int [] arr = {-5,1,-2,3,-1,2,-2};
        System.out.println(maxSum(arr));
        System.out.println(maxSumAlternative(arr));
    }
}
