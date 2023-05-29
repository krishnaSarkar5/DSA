package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here

        List<Integer> result = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < brr.size(); i++) {

            if (brr.get(i) > max) {
                max = brr.get(i);
            }

            if (brr.get(i) < min) {
                min = brr.get(i);
            }
        }

        int[] temp = new int[max + 1];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = 0;
        }

        for (int i = 0; i < brr.size(); i++) {

            temp[brr.get(i)]--;

        }

        for (int i = 0; i < arr.size(); i++) {

            temp[arr.get(i)]++;
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] < 0) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        List<Integer> arr = List.of(11, 4, 11, 7, 13, 4, 12, 11, 10, 14);
        List<Integer> brr = List.of(11, 4, 11, 7, 3, 7, 10, 13, 4, 8, 12, 11, 10, 14, 12);

        System.out.println(missingNumbers(arr, brr));

    }

}
