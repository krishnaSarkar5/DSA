import java.util.ArrayList;
import java.util.List;

public class PermutationWithCharacterAndDigits {
    

    static void calculatePermutations(int index,String original,String temp,List<String> result){

        if(index>=original.length()){
            result.add(temp);
            return;
        }


        if(isDigit(original.charAt(index))){

             String x = ""+original.charAt(index);
             calculatePermutations(index+1, original, temp+x, result);

        }else{

            String x = ""+original.charAt(index);

            calculatePermutations(index+1, original, temp+x.toLowerCase(), result);

            calculatePermutations(index+1, original, temp+x.toUpperCase(), result);


        }


    }




    static boolean isDigit(char c){

        int value = (int) c - (int)'0';

        return value>=0 && value<=9 ? true : false;

    }

    public static void main(String[] args) {
        
        String original = "5a1b23c";

        List<String> result = new ArrayList<>();

        calculatePermutations(0, original, "", result);

        System.out.println(result);
    }
}
