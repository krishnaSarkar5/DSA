package sorting;

import java.util.Arrays;

public class BubbleSort {
    
    public static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            boolean swapped = false;
            for(int j=0;j<arr.length-i-1;j++){              
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }



    public static void main(String[] args) {
        
        int[] arr = {4,3,8,6,1};

        sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
