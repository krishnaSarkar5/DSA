public class FindElementInRotatedAndSortedArray {

    static int findPivot(int[] arr, int n) {

        int s = 0, e = n - 1;

        while (s <= e) {

            if (s == e) {
                return s;
            }

            int m = s + (e - s) / 2;

            if (m + 1 < n && arr[m] > arr[m + 1]) {
                return m;
            }

            else if (m - 1 >= 0 && arr[m] < arr[m - 1]) {
                return m - 1;
            }

            else if (arr[s] > arr[m]) {
                e = m - 1;

            } else {
                s = m + 1;
            }

        }

        return -1;
    }

    static int binarysearch(int[] arr, int s, int e, int n, int target) {

        while (s <= e) {

            int m = s + (e - s) / 2;

            if (arr[m] == target) {
                return m;
            } else if (arr[m] > target) {
                e = m - 1;
            } else {
                s = m + 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 3, 1 };

        int n = arr.length;

        int target = 1;

        int pivot = findPivot(arr, n);

        if (target >= arr[0] && target <= arr[pivot]) {
            System.out.println(binarysearch(arr, 0, pivot, n, target));
        } else {
            System.out.println(binarysearch(arr, pivot + 1, n - 1, n, target));
        }

    }
}
