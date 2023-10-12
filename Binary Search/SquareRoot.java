public class SquareRoot {

    static int squareRoot(int num) {

        long mod = 1000000007l;

        int s = 0, e = num, ans = 0;

        if (num == 0 || num == 1)
            return num;

        while (s <= e) {

            // if (s == e)
            // return ans;

            int m = (s + (e - s) / 2);

            int guess = m * m;

            if ((guess / 10) == (num / 10)) {
                return m;
            } else if ((guess / 10) > (num / 10)) {
                e = m - 1;
            } else {
                ans = m;
                s = m + 1;
            }

        }

        return ans;
    }

    public static void main(String[] args) {

        int num = 2147395599;

        System.out.println(squareRoot(num));

    }
}
