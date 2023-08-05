
import java.util.*;

public class MergeOverlappingIntervals {
    
    static List<List<Integer>> mergeIntervals(int[][] arr){

        List<List<Integer>> result = new ArrayList<>();


        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });


        int n = arr.length;

        List<Integer> temp = new ArrayList<>();
        temp.add(arr[0][0]);
        temp.add(arr[0][1]);
        result.add(temp);

        for(int i= 1;i<n;i++){

            List<Integer> last = result.get(result.size()-1);

            int[] arrLast = arr[i];

            if(arrLast[0]<=last.get(1) && arrLast[1]<=last.get(1)){
               continue;
            }
            
            // else if(arrLast[0]==arrLast[1] && arrLast[0]<=last.get(1)){
            //     continue;
            // }
            
            else if(arrLast[0]<=last.get(1) && arrLast[1]>last.get(1)){
                result.get(result.size()-1).set(1,arrLast[1]);
            }else{
                List<Integer> temp1 = new ArrayList<>();
                    temp1.add(arr[i][0]);
                    temp1.add(arr[i][1]);
                    result.add(temp1);
            }

        }

        return result;
    }


    public static void main(String[] args) {
        
        int[][] arr = {{1,3},{2,6},{4,4},{4,6},{5,5},{6,6}};

        System.out.println(mergeIntervals(arr));

    }
}
