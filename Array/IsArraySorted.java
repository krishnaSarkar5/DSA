public class IsArraySorted {

    

    public static boolean isSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){

            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        

        int[] arr = {4,6,1};

        System.out.println(isSorted(arr));

    }


    // check if given array is ascending or decending sorted

}
