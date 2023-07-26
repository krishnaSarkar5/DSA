import java.util.Arrays;

public class QuickSortAlgo {
    
    static void quickSort(int[] arr, int low ,int high){

        if(low<high){
            int partition = partition(arr, low, high);
            quickSort(arr, low, partition-1);
            quickSort(arr, partition+1,high );
        }


    }

    static int partition(int[] arr,int low ,int high){

        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i<j){
            while(arr[i]<=pivot && i<high){
                i++;
            }

            while(arr[j]>pivot & j>low){
                j--;
            }

            if(i<j){
                // swap a[i] and a[j]
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            
        }

        // swap a[low] and a[j]
        int temp = arr[low];
        arr[low]=arr[j];
        arr[j]=temp;

        return j;

    }

    public static void main(String[] args) {
        int[] arr = {7,3,9,0,5,3,1};

        quickSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }


}
