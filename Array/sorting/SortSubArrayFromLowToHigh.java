package sorting;

import java.util.Arrays;

// A array is given [10,15,20,40,8,11,55] and also given 3 values low=0 , mid=3 , high=6  

// here from low to mid are sorted and mid+1 to high are sorted
// now merge the two sorted subarray 

public class SortSubArrayFromLowToHigh {

    public static void sortedSubArrayMerge(int[] arr, int low, int mid, int high) {

        int n1 = mid - low + 1, n2 = high - mid;

        int[] left = new int[n1];
        int[] rigth = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[low + i];
        }

        for (int i = 0; i < n2; i++) {
            rigth[i] = arr[n2 + 1 + i];
        }

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < rigth.length) {

            if (left[i] <= rigth[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = rigth[j];
                j++;
                k++;
            }

        }

        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < rigth.length) {
            arr[k] = rigth[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        int[] a = { 10, 15, 20, 40, 8, 11, 55 };
        sortedSubArrayMerge(a, 0, 3, 6);
        System.out.println(Arrays.toString(a));
    }

    // time complexity O(n) aux space O(n)
    // this is stable
}
