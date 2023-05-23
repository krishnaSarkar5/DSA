package hackerrank;

public class MarsExploration {

    public static int marsExploration(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            int m = i;

            if (i >= 3) {
                m = i - ((int) (i / 3)) * 3;
            }

            if (m == 0 || m == 2) {
                if (s.charAt(i) != 'S') {
                    count++;
                }
            } else if (m == 1) {
                if (s.charAt(i) != 'O') {
                    count++;
                }  
            }

        }
        return count;
    }

    public static void main(String[] args) {

        String s = "SOSSOT";

        int result = marsExploration(s);

        System.out.println(result);

    }

}
