import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortBySetBit {
    public static int[] sortByBits(int[] arr) {

        Map<Integer, List<Integer>> map = new HashMap<>();

        int size = arr.length;

        int min = 0, max = 0;

        int[] ans = new int[size];

        for (int i = 0; i < size; i++) {

            int n = countSetBits(arr[i]);

            max = Math.max(max, n);
            min = Math.min(min, n);

            List<Integer> l = null;

            if (map.containsKey(n)) {
                l = map.get(n);
            } else {
                l = new ArrayList<>();
            }

            l.add(arr[i]);
            map.put(n, l);

        }

        List<Integer> res = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            if (map.containsKey(i)) {
                res.addAll(map.get(i));
            }
        }

        for (int i = 0; i < size; i++) {
            ans[i] = res.get(i);
        }

        return ans;

    }

    static int countSetBits(int val) {

        int count = 0;
        while (val > 0) {
            val = val & (val - 1);
            count++;
        }

        return count;

    }

    public static void main(String[] args) {
        int[] arr = { 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1 };

        int[] ans = sortByBits(arr);

        System.out.println(Arrays.toString(ans));
    }
}