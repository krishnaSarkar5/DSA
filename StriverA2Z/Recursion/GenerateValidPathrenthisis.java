import java.util.ArrayList;
import java.util.List;

public class GenerateValidPathrenthisis {
    

    static void generateParenthisis(int index,int n,String temp,String check,List<String> result){

        if(index>=2*n && check.length()==0){
            result.add(temp);
            return;
        }else if(index>=2*n){
            return;
        }
    
        generateParenthisis(index+1, n, temp+"(",check+"(", result);

        if(check.length()!=0 && check.charAt(check.length()-1)=='('){
             
             check = check.substring(0, check.length()-1);
             generateParenthisis(index+1, n, temp+")",check, result);
        }

       



    }

    public static void main(String[] args) {
        Integer n=3;
        List<String> result = new ArrayList<>();

        generateParenthisis(0, n, "","", result);

        System.out.println(result);

    }



   
}
