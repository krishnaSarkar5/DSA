package sorting;

public class IntersectionOfSortedArray {

    public static void printIntersecttion(int[] arr, int[] brr) {

        int i = 0, j = 0;

        while (i < arr.length && j < brr.length) {

            if (i > 0 && arr[i] == arr[i - 1]) {
                i++;
                continue;
            }

            if (arr[i] < brr[j]) {
                i++;
            } else if (arr[i] > brr[j]) {
                j++;
            } else {
                System.out.print(arr[i] + " ");
                i++;
                j++;
            }

        }

    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 20, 40, 60 };
        int[] brr = { 2, 10, 20, 20, 20 };
        printIntersecttion(arr, brr);
    }
}