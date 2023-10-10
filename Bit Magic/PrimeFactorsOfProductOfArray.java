import java.util.*;
import java.util.List;
import java.util.TreeSet;

public class PrimeFactorsOfProductOfArray {

    public static int distinctPrimeFactors(int[] nums) {

        int n = nums.length;

        Set<Integer> ans = new TreeSet<>();

        for (int i = 0; i < n; i++) {

            int num = nums[i];

            for (int j = 2; j * j <= num; j++) {

                boolean flag = false;

                while (num % j == 0) {

                    if (!flag) {
                        ans.add(j);
                        flag = true;
                    }
                    num /= j;
                }

                if (num > 1) {
                    ans.add(num);
                }

            }

        }

        return ans.size();

    }

    public static void main(String[] args) {

        int[] arr = { 2, 4, 3, 7, 10, 6 };

        System.out.println(distinctPrimeFactors(arr));
    }
}
