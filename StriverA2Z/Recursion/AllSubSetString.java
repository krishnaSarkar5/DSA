import java.util.ArrayList;
import java.util.List;

public class AllSubSetString {
    

    static void findSubset(int index,String inputString,List<String> ans,String temp){

        if(index>=inputString.length()){
            ans.add(temp);
            return;
        }

        String x = temp.concat(""+inputString.charAt(index));
        findSubset(index+1, inputString, ans, x);
        findSubset(index+1, inputString, ans, temp);


    }




    public static void main(String[] args) {
        String value = "abbc";
        List<String> result =  new ArrayList<>();

        findSubset(0, value, result, "");

        System.out.println(result);
    }
}
