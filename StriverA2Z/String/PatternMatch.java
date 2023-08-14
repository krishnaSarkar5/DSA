import java.util.ArrayList;
import java.util.List;

public class PatternMatch {
    

    static List<Integer> findPatternIndex(String text,String pattern){


        int n = text.length(),m=pattern.length();

        int i=0,j=0;

        List<Integer> result = new ArrayList<>();

        int start = -1;
        while(i<n){

            char t = text.charAt(i);

            char p = pattern.charAt(j);

            if(t==p && start==-1){
                start = i;
                i++;
                j++;
            }else if(t==p){
                if(j==m-1){
                    result.add(start+1);
                    j=0;
                    start=-1;
                }else{
                    i++;
                    j++;
                }
            }else{
                start=-1;
                j=0;
                if(i>1 && i<n-1 && text.charAt(i-1)==text.charAt(i)){
                    continue;
                }else{
                    i++;
                }
                
            }

            if(j==m)
             j=0;

        }
    

        return result;
    }

    public static void main(String[] args) {
        String test = "yokfaygxodwckqsosbyssortmhzapgpbuvdcimee";
        String pattern = "sortmhzapgpbuvdcimee";

        System.out.println(findPatternIndex(test, pattern));
    }
}
