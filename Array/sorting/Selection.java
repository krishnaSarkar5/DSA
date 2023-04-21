package sorting;

import java.util.Arrays;

public class Selection {
    
    public static void sort(int[] arr){

        for(int i=0;i<arr.length;i++){

            int min_index = i ;

            for(int j=i;j<arr.length;j++){

                if(arr[j]<arr[min_index]){

                    int temp = arr[j];
                    arr[j] = arr[min_index];
                    arr[min_index]=temp;

                }

            }

        }

    }

    public static void main(String[] args) {
        
        int[] arr = {1,2,7,5,8,2};

        sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
