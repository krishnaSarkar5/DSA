import java.util.ArrayList;
import java.util.List;

public class PermutationCharacter {
    

    static void printPermutation(int index,String original,String temp,List<String> result){

        if(index>=original.length()){
            result.add(temp);
            return;
        }



     String x = ""+ original.charAt(index);

     printPermutation(index+1, original, temp+x.toUpperCase(), result);

    printPermutation(index+1, original, temp+x, result);

    }



    public static void main(String[] args) {
        
        String original = "ab";

        List<String> result = new ArrayList<>();

        printPermutation(0, original, "", result);

        System.out.println(result);


    }
}
