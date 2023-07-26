import java.util.ArrayList;
import java.util.List;

public class GenerateBinaryNumber {
    
    static void generateNumber(int index,int n,int ones,int zeros,String temp,List<String> result){

        if(index>=n){
            result.add(temp);
            return;
        }

        generateNumber(index+1, n, ones+1, zeros, temp+"1", result);

        if(zeros<ones){
            generateNumber(index+1, n, ones, zeros+1, temp+"0", result);
        }

    }


    public static void main(String[] args) {
        
        int n=4;

        List<String> result =  new ArrayList<>();

        generateNumber(0, n, 0, 0, "", result);

        System.out.println(result);

    }

}
