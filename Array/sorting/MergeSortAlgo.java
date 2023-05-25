package sorting;

import java.util.Arrays;

public class MergeSortAlgo {

    private static void mergeSort(int[] arr, int low, int high) {

        if (high > low) {

            int mid = low + (high - low) / 2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }

    }

    private static void merge(int[] arr, int low, int mid, int high) {

        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[low + i];
        }

        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = low;

        while (i < n1 && j < n2) {

            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else if (right[j] < left[i]) {
                arr[k] = right[j];
                j++;
                k++;
            }

        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {

        int[] arr = { 8, 1, 2, 5, 7, 2, 9 };

        mergeSort(arr, 0, 6);

        System.out.println(Arrays.toString(arr));

    }

}
