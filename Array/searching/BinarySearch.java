package searching;

public class BinarySearch {

    public static int search(int[] arr, int value, int low, int high) {

        if (high < low) {
            return -1;
        }

        int m = (high + low) / 2;

        if (value == arr[m]) {
            return m;
        }

        if (value > arr[m]) {
            return search(arr, value, m + 1, high);
        } else {
            return search(arr, value, low, m - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 7, 8 };

        System.out.println(search(arr, 3, 0, 5));
    }

    // time complexity O(logn) auxiliary space O(1)
}
