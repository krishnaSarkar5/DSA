package hackerrank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class SherlockString {

    public static String isValid(String s) {
        // Write your code here

        Map<Character, Integer> map = new HashMap<>();

        for (Integer i = 0; i < s.length(); i++) {

            if (Objects.isNull(map.get(s.charAt(i)))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }

        }

        Map<Integer, Integer> count = new HashMap<>();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (Objects.isNull(count.get(entry.getValue()))) {
                count.put(entry.getValue(), 1);
            } else {
                count.put(entry.getValue(), count.get(entry.getValue()) + 1);
            }
        }

        if (count.size() == 1) {
            return "YES";
        } else if (count.size() == 2) {

            Collection<Integer> col = count.keySet();

            List<Integer> keys = new ArrayList<>(col);

            int max = Math.max(keys.get(0), keys.get(1));

            if (!Objects.isNull(count.get(1)) && count.get(1) == 1) {
                return "YES";
            } else if (Math.abs(keys.get(1) - keys.get(0)) == 1 && count.get(max) == 1) {
                return "YES";
            } else {
                return "NO";
            }

        } else {
            return "NO";
        }

    }

    public static void main(String[] args) {
        String s = "abcdefghhgfedecba";
        System.out.println(isValid(s));
    }

}
