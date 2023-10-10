import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PowerSet {

    public static List<String> findPowerSet(String s) {

        int len = s.length();

        int n = (int) Math.pow(2, len);

        List<String> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int j = 0;
            int x = i;

            String temp = "";

            while (x > 0) {

                if ((x & 1) == 1) {
                    temp = temp + s.charAt(j);
                }

                j++;
                x = x >> 1;

            }

            res.add(temp);

        }

        Collections.sort(res);

        return res;
    }

    public static void main(String[] args) {

        String s = "abc";

        System.out.println(findPowerSet(s));

    }

}
