import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PermutationSpace {
    

    static void printPermutation(int index,String original,String temp,List<String> result){

        if(index>=original.length()-1){
            result.add(new String(temp+original.charAt(original.length()-1)));
            return;
        }

      String x = "" + original.charAt(index);

      printPermutation(index+1, original, temp+x+"-", result);

      printPermutation(index+1, original, temp+x, result);

    }




    public static void main(String[] args) {
        
        String original = "abcd";

        List<String> result = new ArrayList<>();

        printPermutation(0, original, "", result);

        System.out.println(result);

    }
}
