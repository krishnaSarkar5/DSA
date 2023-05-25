package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SherlockAndAngram {

    public static int sherlockAndAnagrams(String s) {
        // Write your code here

        String[] arr = s.split("");

        int result = 0;

        List<String> subArr = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            String str = "";
            for (int j = i; j < arr.length; j++) {
                str = str + arr[j];
                subArr.add(str);
            }
        }

        for (int i = 0; i < subArr.size() - 1; i++) {
            for (int j = i + 1; j < subArr.size(); j++) {
                if (isAnagram(subArr.get(i), subArr.get(j))) {
                    String s1 = subArr.get(i);
                    String s2 = subArr.get(j);
                    result++;
                }
            }
        }

        return result;
    }

    private static boolean isAnagram(String s1, String s2) {

        if (s1.length() == s2.length()) {

            char[] arrS1 = s1.toCharArray();

            Arrays.sort(arrS1);

            String temp1 = new String(arrS1);

            char[] arrS2 = s2.toCharArray();

            Arrays.sort(arrS2);

            String temp2 = new String(arrS2);

            return temp1.equals(temp2);

        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        String s = "ifailuhkqq";
        int result = sherlockAndAnagrams(s);
        System.out.println(result);
    }

}
