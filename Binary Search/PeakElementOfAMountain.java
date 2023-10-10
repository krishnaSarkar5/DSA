public class PeakElementOfAMountain {

    public static int findPeak(int[] arr) {

        int s = 0, e = arr.length - 1;

        while (s < e) {

            int m = s + (e - s) / 2;

            if (arr[m] > arr[m + 1]) {
                e = m;
            } else {
                s = m + 1;
            }

        }

        return s;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 4, 7, 3, 2, 1 };

        System.out.println(findPeak(arr));

    }
}
