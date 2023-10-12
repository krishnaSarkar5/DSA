public class FindOddOccuringNumber {

    static int findOddOccuring(int[] arr) {

        int n = arr.length;

        int s = 0, e = n - 1;

        while (s <= e) {

            int m = s + (e - s) / 2;

            if (m % 2 == 0) {

                if (m + 1 < n && arr[m] == arr[m + 1]) {
                    s = m + 2;
                } else if (m - 1 >= 0 && arr[m] == arr[m - 1]) {
                    e = m - 2;
                } else {
                    return arr[m];
                }

            } else {
                if (m - 1 >= 0 && arr[m] == arr[m - 1]) {
                    s = m + 1;
                } else if (m + 1 < n && arr[m] == arr[m + 1]) {
                    e = m - 1;
                }
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 3, 3, 7, 7, 10, 11, 11 };

        System.out.println(findOddOccuring(arr));

    }

}
