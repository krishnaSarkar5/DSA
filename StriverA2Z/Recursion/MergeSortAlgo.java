import java.util.Arrays;

public class MergeSortAlgo {
    

    static void mergeSort(int low,int high,int[] arr){

        if(low<high){

            int mid = low+(high-low)/2;
            mergeSort(low, mid, arr);
            mergeSort(mid+1, high, arr);
            mergeArray(arr, low, mid, high);

        }

        return;

    }


    static void mergeArray(int[] arr,int low , int mid ,int high){
        int[] result = new int[high-low+1];

        int i=low;int j=mid+1;int k=0;

        while(i<=mid && j<=high){

            if(arr[i] <= arr[j]){
                result[k]=arr[i];
                i++;
                k++;
            }

            if(arr[j] < arr[i]){
                result[k]=arr[j];
                j++;
                k++;
            }

        }

        while(i<=mid){
            result[k]=arr[i];
            i++;
            k++;
        }

        while(j<=high){
             result[k]=arr[j];
            j++;
            k++;
        }

        for(int m=low;m<=high;m++){
            arr[m]=result[m-low];
        }


    }

    public static void main(String[] args) {
        
        int[] a = {9,8,10,1,2,3,4,3,6,8,2};

        mergeSort(0, 10, a);

        System.out.println(Arrays.toString(a));
    }
}
