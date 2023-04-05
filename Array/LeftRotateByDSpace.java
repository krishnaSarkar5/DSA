import java.util.Arrays;

public class LeftRotateByDSpace {
    
// time complexity theta(n) and aux space theta(1)
    public static void leftRotateByD(int[] arr , int d){ // {1,2,3,4,5} for d=2
        reverse(arr, 0, d-1);  // {2,1,3,4,5}
        reverse(arr, d, arr.length-1); // {2,1,5,4,3}
        reverse(arr, 0, arr.length-1); // {3,4,5,1,2}
    }

 public static void reverse(int[] arr , int low , int high){
        while(low<high){
            int temp = arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }

    }

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};

        leftRotateByD(arr, 2);
        System.out.println(Arrays.toString(arr));


    }
}
