public class DivideANumber {

    static int divide(int dividend, int divisor) {

        int s = 0, e = dividend, ans = 0;

        while (s <= e) {

            int m = s + (e - s) / 2;

            if (m * divisor == dividend) {
                return m;
            } else if (m * divisor > dividend) {
                e = m - 1;
            } else {
                ans = m;
                s = m + 1;
            }

        }

        return ans;
    }

    public static void main(String[] args) {

        int dividend = 24;
        int divisor = -3;

        int q = divide(Math.abs(dividend), Math.abs(divisor));

        int ans = 0;

        if ((dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0)) {
            ans = q;

        } else {
            ans = ans - q;
        }

        System.out.println("Result: " + ans);

    }
}
