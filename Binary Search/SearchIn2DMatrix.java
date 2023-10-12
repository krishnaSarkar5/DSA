public class SearchIn2DMatrix {

    static boolean binarySearch(int[][] arr, int target) {

        int row = arr.length;
        int col = arr[0].length;

        int n = row * col;

        int s = 0, e = n - 1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            int rowIndex = mid / col;
            int colIndex = mid % col;

            int currentValue = arr[rowIndex][colIndex];

            if (currentValue == target) {
                return true;
            } else if (currentValue > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] arr = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };

        int target = 2;

        System.out.println(binarySearch(arr, target));
    }
}
