public class LongestUniqueString {

    public static void main(String[] args) {

        String s = "abcdanclp";

        int i = 1, j = 0, l = 1, m = 0;

        while (i < s.length()) {

            char ti = s.charAt(i);
            char tj = s.charAt(j);

            if (ti != tj) {
                l++;
            } else {
                if (l > m) {
                    m = l;
                }
                l = 1;
                j = i;
            }
            i++;
        }

        if (l > m) {
            m = l;
        }

        System.out.println(m);

    }
}
