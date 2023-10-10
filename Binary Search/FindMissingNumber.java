public class FindMissingNumber {

    public static int findMissing(int[] arr) {

        int s = 0, e = arr.length - 1;

        int ans = -1;

        while (s <= e) {

            int m = s + (e - s) / 2;

            if (arr[m] == m + 1) {
                s = m + 1;
                ans = s;
            } else {
                ans = m;
                e = m - 1;
            }

        }

        return ans + 1;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9 };

        System.out.println(findMissing(arr));

    }
}
