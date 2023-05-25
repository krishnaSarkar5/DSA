package sorting;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static int[] mergeArray(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {

            if (a[i] <= b[j]) {
                result[k] = a[i];
                i++;
            } else {
                result[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length) {
            result[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            result[k] = b[j];
            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = { 2, 3, 8, 13, 15 };
        int[] b = { 1, 2, 4 };

        int[] result = mergeArray(a, b);

        System.out.println(Arrays.toString(result));

    }

}

// time complexity O(n+m) aux space O(n+m)
// this is stable