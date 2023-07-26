public class LargestElement {
    


    static int findLargest(int[] arr){

        int max = arr[0];

        for(int i=1;i<arr.length;i++){

            if(max<arr[i]){
                max=arr[i];
            }

        }


        return max;
    }



    public static void main(String[] args) {
        int[] arr = {2,1,5,3,8,9,13,1,2};

        System.out.println(findLargest(arr));
    }
}
