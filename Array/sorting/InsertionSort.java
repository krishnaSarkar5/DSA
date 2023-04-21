package sorting;

import java.util.Arrays;

public class InsertionSort {
    
    public static void sort(int[] arr){   
        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        
        int[] arr = {3,4,1,5,9,2};

        sort(arr);

        System.out.println(Arrays.toString(arr));

    }

}
