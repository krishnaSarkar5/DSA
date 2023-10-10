import java.util.*;

public class SubsetII {

    public static List<List<Integer>> findAllSubSets(int[] nums) {

        Set<List<Integer>> tempRes = new TreeSet<>(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> arr1, List<Integer> arr2) {
                Iterator<Integer> iterator1 = arr1.iterator();
                Iterator<Integer> iterator2 = arr2.iterator();
                while (iterator1.hasNext() && iterator2.hasNext()) {
                    int cmp = iterator1.next().compareTo(iterator2.next());
                    if (cmp != 0) {
                        return cmp;
                    }
                }
                if (iterator1.hasNext()) {
                    return 1;
                } else if (iterator2.hasNext()) {
                    return -1;
                }
                return 0;
            }
        });

        int len = nums.length;

        int n = (int) Math.pow(2, len);

        for (int i = 0; i < n; i++) {

            int x = i;

            int j = 0;

            List<Integer> temp = new ArrayList<>();

            while (x > 0) {

                if ((x & 1) == 1) {
                    temp.add(nums[len - j - 1]);
                }

                j++;
                x = x >> 1;

            }
            Collections.sort(temp);
            tempRes.add(temp);

        }

        List<List<Integer>> ans = new ArrayList<>();

        for (List<Integer> s : tempRes) {

            List<Integer> tempList = new ArrayList<>();

            for (Integer i : s) {
                tempList.add(i);
            }
            ans.add(tempList);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 2 };

        System.out.println(findAllSubSets(nums));

    }

}
