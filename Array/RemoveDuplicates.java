
// Assume the array is sorted
public class RemoveDuplicates {
    
    public static int removeDuplicateOccurance(int[] arr){

        int res = 1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[res-1]){
               arr[res] = arr[i];
                res++;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println("Size of new array after removal of duplicate elements "+removeDuplicateOccurance(arr));
    }



}
