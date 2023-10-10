public class DivideUsingBitOperator {
    public static int divide(int dividend, int divisor) {

        // int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

        // dividend = Math.abs(dividend);

        // divisor = Math.abs(divisor);

        // long q = 0;
        // long t = 0;

        // for (int i = 31; i >= 0; --i) {
        // int te = divisor << i;
        // if (t + te <= dividend) {
        // t += te;
        // q = q | 1L << i;
        // }

        // }

        // q = sign == -1 ? -q : q;

        // return (q > Integer.MAX_VALUE) ? Integer.MAX_VALUE : (q < Integer.MIN_VALUE)
        // ? Integer.MIN_VALUE : (int) q;

        long sign = ((dividend < 0) ^
                (divisor < 0)) ? -1 : 1;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        // Initialize the quotient
        long quotient = 0, temp = 0;

        // test down from the highest
        // bit and accumulate the
        // tentative value for
        // valid bit
        // 1<<31 behaves incorrectly and gives Integer
        // Min Value which should not be the case, instead
        // 1L<<31 works correctly.
        for (int i = 31; i >= 0; --i) {

            if (temp + (divisor << i) <= dividend) {
                temp += divisor << i;
                quotient |= 1L << i;
            }
        }

        // if the sign value computed earlier is -1 then negate the value of quotient
        if (sign == -1)
            quotient = -quotient;
        // return quotient;
        return (quotient > Integer.MAX_VALUE) ? Integer.MAX_VALUE
                : (quotient < Integer.MIN_VALUE)
                        ? Integer.MIN_VALUE
                        : (int) quotient;
    }

    public static void main(String[] args) {

        System.out.println(divide(1, 2));
        ;
    }
}
