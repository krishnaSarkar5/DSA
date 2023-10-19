public class FindSquareRootUptoNPrecision {

    public static int findSqurateRootFloor(int n) {

        int s = 0, e = n, ans = -1;

        while (s <= e) {

            int m = s + (e - s) / 2;

            if (m * m == n)
                return m;

            else if (m * m > n) {
                e = m - 1;
            } else {
                ans = m;
                s = m + 1;
            }

        }

        return ans;
    }

    public static double findSquareRoot(int n, int prec) {

        double sqrtF = findSqurateRootFloor(n);

        float step = 0.1f;

        for (int i = 0; i < prec; i++) {

            double temp = sqrtF;

            while ((temp * temp) <= n) {

                sqrtF = temp;

                temp += step;

            }

            step /= 10;

        }

        return sqrtF;

    }

    public static void main(String[] args) {

        int n = 64, prec = 5;

        System.out.println(findSquareRoot(n, prec));

    }

}