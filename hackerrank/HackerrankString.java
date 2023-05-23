package hackerrank;

public class HackerrankString {

    public static String hackerrankInString(String s) {

        String h = "hackerrank";
        int j = 0;
        int prevIndex = -1;
        boolean flag = false;
        for (int i = 0; i < h.length(); i++) {
            char c = h.charAt(i);
            j = prevIndex + 1;
            while (j < s.length()) {

                if (s.charAt(j) == c) {
                    prevIndex = j;
                    flag = true;
                    break;
                } else {
                    j++;
                }

            }

            if (!flag) {
                return "NO";
            }

        }

        return "YES";

    }

    public static void main(String[] args) {

        String s = "hereiamstackerran";

        System.out.println(hackerrankInString(s));

    }
}