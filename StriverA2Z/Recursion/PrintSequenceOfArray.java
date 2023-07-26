import java.util.ArrayList;
import java.util.List;

public class PrintSequenceOfArray {
    
    static void printSequence(int[] arr,int i,List<Integer> result){

        if(i>=arr.length){
            System.out.println(result);
            return;
        }

        result.add(arr[i]);
        printSequence(arr, i+1, result);
        result.remove(arr[i]);
        printSequence(arr, i+1, result);



    }



    public static void main(String[] args) {
        int[] arr = {3,1,2};
        List<Integer> result = new ArrayList<>();
        printSequence(arr, 0, result);
    }
}
