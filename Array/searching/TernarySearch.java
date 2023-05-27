package searching;

public class TernarySearch {

    public static int search(int[] arr, int value, int low, int high) {

        if (high < low) {
            return -1;
        }

        int m1 = low + (high - low) / 2;
        int m2 = high - (high - low) / 2;

        if (value == arr[m1]) {
            return m1;
        } else if (value == arr[m2]) {
            return m2;
        }

        else if (value < arr[m1]) {
            return search(arr, value, low, m1 - 1);
        } else if (value > arr[m2]) {
            return search(arr, value, m2 + 1, high);
        } else {
            return search(arr, value, m1 + 1, m2 - 1);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 8, 10, 13 };

        System.out.println(search(arr, 13, 0, 4));
    }

    // time complecity O(log3n) (log base 3) auxiliary space O(1)
}
