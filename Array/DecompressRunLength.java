import java.util.Arrays;

public class DecompressRunLength {

    public static int[] decompressRLElist(int[] nums) {

        int totalSize = 0;

        int n = nums.length;

        for (int i = 0; i < n; i = i + 2) {
            totalSize += nums[i];
        }

        int[] ans = new int[totalSize];

        int j = 0;

        for (int i = 0; i < n; i = i + 2) {
            int freq = nums[i];
            int val = nums[i + 1];

            int c = 0;

            while (j < totalSize && c < freq) {

                ans[j] = val;
                j++;
                c++;

            }

        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4 };

        int[] ans = decompressRLElist(arr);

        System.out.println(Arrays.toString(ans));

    }
}
