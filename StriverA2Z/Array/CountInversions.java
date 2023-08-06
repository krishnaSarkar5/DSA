import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountInversions {
    
    static int mergeSort(int[] arr,int low,int high){

        int count=0;

        if(low>=high) return count;

        int mid = (low+high)/2;

        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid+1, high);
        count += merge(arr, low, mid, high);
        return count;

    }

    static int merge(int[] arr,int low,int mid,int high){

        int count = 0;

        List<Integer> temp = new ArrayList<>();

        int i=low,j=mid+1;

        while(i<=mid && j<=high){

            if(arr[i]<arr[j]){
                temp.add(arr[i]);
                i++;
            }else{
                count+=(mid-i+1);
                temp.add(arr[j]);
                j++;
            }

        }

        while(i<=mid){
            temp.add(arr[i]);
            i++;
        }

        while(j<=high){
            temp.add(arr[j]);
            j++;
        }

        for(int k=low;k<=high;k++){
            arr[k]=temp.get(k-low);
        }

        return count;
    }


    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4};

        int count =mergeSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}
