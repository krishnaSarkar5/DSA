import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PascalsTriangle {

    static List<List<Integer>> formPascalsTriangle(int rows) {

        List<List<Integer>> result = new ArrayList<>();

        int i = 0, j = 0;

        while (i < rows) {

            List<Integer> temp = new ArrayList<>();
            j=0;

            while (j <= i) {

                if (i == j) {
                    temp.add(1);
                    break;
                }

                if(j==0){
                    temp.add(1);
                }else{
                    temp.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
                }
                j++;

            }
            result.add(temp);
            i++;

        }

        return result;

    }

    static int findPascalsValueUsingRecursion(int r, int c, Map<String, Integer> lookup) {

        if (r == 0 || r == 1 || c == 0 || c == r) {
            return 1;
        }

        String pos = "r" + r + "c" + c;

        int value = lookup.getOrDefault(pos, 0);
        if (value != 0) {
            return value;
        }

        int sum = findPascalsValueUsingRecursion(r - 1, c - 1, lookup)
                + findPascalsValueUsingRecursion(r - 1, c, lookup);

        lookup.put(pos, sum);

        return sum;

    }

    public static void main(String[] args) {
        int n = 5;
        int r = 1;
        int c = 1;
        // System.out.println(findPascalsValueUsingRecursion(r - 1, c - 1, new HashMap<>()));

        List<List<Integer>> result = formPascalsTriangle(n);

        System.out.println(result);
    }
}
