import java.util.HashSet;
import java.util.Set;

public class LongestConsequitiveSequence {
    

    static int findLongestConsequitive(int[] arr){

        if(arr.length==0){
            return 0;
        }

        Set<Integer> set =  new HashSet<>();

        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

        int count = 1;
        int max = 1;

        for(Integer s : set){
            if(!set.contains(s-1)){

                int i=1;
                while(set.contains(s+i)){
                    count++;
                    i++;
                }

                max = Math.max(count, max);
                count=1;

            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {100, 5,200, 1, 3, 2, 4};
        System.out.println(findLongestConsequitive(arr));
    }
}
