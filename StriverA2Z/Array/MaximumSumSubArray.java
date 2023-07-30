public class MaximumSumSubArray {
    


    static int findMaxSumSubarrayBruteforce(int[] arr){

        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            int sum=0;
            for(int j=i+1;j<arr.length;j++){
                sum = sum+arr[j];

                if(sum>max)
                    max=sum;
            }
        }
        return max;

    }


    static int findMaxSumSubarrayKadanes(int[] arr){

            int max= Integer.MIN_VALUE;
            int sum=0;

            for(int i=0;i<arr.length;i++){
                
                sum=sum+arr[i];

                if(sum>max)
                    max=sum;

                if(sum<0)
                    sum=0;
            }
        return max;
    }

    public static void main(String[] args) {
        int [] arr = {-7,8,-16,-4,-8,-5,-7,-11,-10,-12,-4,-6,-4,-16,-10 };
        System.out.println(findMaxSumSubarrayBruteforce(arr));
                System.out.println(findMaxSumSubarrayKadanes(arr));

    }
}
