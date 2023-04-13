
public class LongestEvenOddSubArray {

    public static int longestSubArray(int[] arr){

        boolean isEven = arr[0]%2==0;

        int result = 1;
        int count = 1;

        for(int i=1;i<arr.length;i++){

            if((arr[i]%2==0)==!isEven){
                count++;
                isEven=arr[i]%2==0;
                if(count>result)
                    result=count;
            }else{
                isEven=arr[i]%2==0;
                count=1;
            }

        }
        return result;
    }



    public static void main(String[] args) {
        
        int[] arr = {3,2,3};
        System.out.println(longestSubArray(arr));

    }


}
