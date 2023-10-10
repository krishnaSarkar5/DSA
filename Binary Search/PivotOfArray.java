public class PivotOfArray {

    static int findPivot(int[] arr) {

        int n = arr.length;

        int s = 0, e = n - 1;

        while (s <= e) {

            if (s == e) {
                return s;
            }

            int m = s + (e - s) / 2;

            if (m - 1 > 0 && arr[m] < arr[m - 1]) {
                return m - 1;
            } else if (m + 1 < n - 1 && arr[m] > arr[m + 1]) {
                return m;
            } else if (arr[m] > arr[s]) {
                s = m + 1;
            } else {
                e = m - 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 7, 8, 9, 10, 12, 13 };

        System.out.println(findPivot(arr));

    }
}
