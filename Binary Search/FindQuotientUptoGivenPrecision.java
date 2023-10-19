public class FindQuotientUptoGivenPrecision {

    public static int findQuotientFloor(int dividend, int divisor) {

        int s = 0, e = dividend, ans = 0;

        while (s < e) {

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

    public static double findQuotient(int dividend, int divisor, int prec) {

        double qf = findQuotientFloor(Math.abs(dividend), Math.abs(divisor));

        float step = 0.1f;

        for (int i = 0; i < prec; i++) {

            double temp = qf;

            while (temp * divisor <= dividend) {

                qf = temp;

                temp += step;

            }

            step /= 10;

        }

        if ((dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0)) {
            return qf;
        } else {
            return 0 - qf;
        }

    }

    public static void main(String[] args) {

        int dividend = 0;

        int divisor = 3;

        int prec = 3;

        System.out.println(findQuotient(dividend, divisor, prec));

    }

}