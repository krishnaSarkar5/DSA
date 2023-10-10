public class CountSetBitFrom1ToN {

    public static int countSetBits(int n) {
        // Write your code here.
        int count = 1;

        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        if (n <= 1)
            return arr[n - 1];

        int ref = 0;
        int l = 2;

        for (int i = 2; i <= n; i++) {

            if (ref <= l - 1) {
                count = count + arr[ref] + 1;
                arr[i] = arr[ref] + 1;
            } else {
                ref = 0;
                l = 2 * l;
                count = count + arr[ref] + 1;
                arr[i] = arr[ref] + 1;
            }
            ref++;

        }

        return count;

    }

    public static void main(String[] args) {
        System.out.println(countSetBits(18));
    }
}
