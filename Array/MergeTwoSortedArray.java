
import java.util.Arrays;

public class MergeTwoSortedArray {
    

    public static int[] merge(int[] arr1, int [] arr2){

        int i=0,j=0,k=0;
        int [] arr = new int[arr1.length+arr2.length];

        while(i<arr1.length && j<arr2.length){
            
            if(arr1[i]<arr2[j]){
                arr[k]=arr1[i];
                i++;
                k++;
            }else{
                arr[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr1.length){
            arr[k]=arr1[i];
            i++;
            k++; 
        }

        while(j<arr2.length){
            arr[k]=arr2[j];
            j++;
            k++; 
        }
        return arr;
    }


    public static void main(String[] args) {
        int [] arr1 = {78,90,102};
        int [] arr2 = {77,95,105};

        int [] arr =  merge(arr1, arr2);

        System.out.println(Arrays.toString(arr));
    }

} 
