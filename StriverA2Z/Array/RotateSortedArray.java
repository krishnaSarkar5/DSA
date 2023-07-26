import java.util.Arrays;

public class RotateSortedArray {
    

    static void reverseArray(int[] arr,int a,int b){

        int i=a,j=b-1;

        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }



    static void rotateArray(int[] arr, int d){

        d=d%arr.length;

        d=arr.length-d;

        reverseArray(arr, 0, d);

        reverseArray(arr, d, arr.length);

        reverseArray(arr, 0, arr.length);


    }


    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7};

        rotateArray(arr,3);
    }
}
