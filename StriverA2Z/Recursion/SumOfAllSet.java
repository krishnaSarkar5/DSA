import java.util.ArrayList;
import java.util.List;

public class SumOfAllSet {
    

    static void calculateSum(int index,int sum , int[] arr,List<Integer> ds){

        if(index>=arr.length){
            ds.add(sum);
            return;
        }

        calculateSum(index+1, sum+arr[index], arr, ds);
        calculateSum(index+1, sum, arr, ds);

    }

    public static void main(String[] args) {
        int[] arr = {3,2,1};
        List<Integer> ds = new ArrayList<>();
        calculateSum(0, 0, arr, ds);
        System.out.println(ds);
    }

}
