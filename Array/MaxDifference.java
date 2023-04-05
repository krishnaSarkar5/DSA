
// find max difference between a[j]-a[i] where j>i

public class MaxDifference {


    public static int findMaxDifference(int[] arr){

        int res = arr[1]-arr[0];
        int minValue = arr[0];
        for(int i=1;i<arr.length;i++){
            res = max(res, arr[i]-minValue);
            minValue = min(minValue, arr[i]);
        }
        return res;
    }




    public static int max(int previouslyMax, int currentValue){

        return previouslyMax>currentValue?previouslyMax:currentValue;
    }
    

    private static int min(int previouslyMin, int currentValue){
        return previouslyMin<currentValue?previouslyMin:currentValue;
    }

    public static void main(String[] args) {
        int [] arr = {30,10,8,2};

        System.out.println(findMaxDifference(arr));

    }
}
