public class CountTotalOccuranceOfANumber {

    static int findFirstOccurance(int[] arr, int target) {

        int s = 0, e = arr.length - 1;
        int ans = -1;

        while (s <= e) {

            int m = s + (e - s) / 2;

            int val = arr[m];

            if (val == target) {
                ans = m;
                e = m - 1;
            } else if (val > target) {
                e = m - 1;
            } else {
                s = m + 1;
            }

        }

        return ans;
    }

    static int findLastOccurance(int[] arr, int target) {

        int s = 0, e = arr.length - 1;
        int ans = -1;

        while (s <= e) {

            int m = s + (e - s) / 2;

            int val = arr[m];

            if (val == target) {
                ans = m;
                s = m + 1;
            } else if (val > target) {
                e = m - 1;
            } else {
                s = m + 1;
            }

        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50 };

        int x = 30;
        int f = findFirstOccurance(arr, x);
        int l = findLastOccurance(arr, x);

        if (f == -1 || l == -1) {
            System.out.println("0");
            return;
        }

        System.out.println(f - l + 1);

    }
}
