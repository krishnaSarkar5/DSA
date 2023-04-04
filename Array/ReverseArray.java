import java.util.Arrays;

public class ReverseArray {
    

    public static void reverse(int[] arr){

        int low = 0 , high = arr.length-1;

        while(low<high){
            int temp = arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {       
        int [] arr = {1,2,3,4};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Time complexity = Theta(n)
}
