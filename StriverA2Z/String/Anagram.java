import java.util.HashMap;
import java.util.Map;

public class Anagram {
    
    static boolean checkAnagram(String s1,String s2){

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int l1 = s1.length();
        int l2 = s2.length();

        if(l1!=l2) return false;

        int[] freq = new int[26];

        // for(int i = 0 ;i < 26 ;i++){
        //     freq[i] = 0;
        // }


        for(int i = 0 ;i < l1 ;i++){
            int index = s1.charAt(i)-'a';
            freq[index] =  freq[index]+1;

            int index2 = s2.charAt(i)-'a';
            freq[index2] =  freq[index2]-1;
        }



        for(int i = 0 ;i < 26 ;i++){
            if(freq[i]<0){
                return false;
            }
        }

        return true;

    }


    public static void main(String[] args) {
        
        String s1 = "cat";
        String s2 = "atc";

        System.out.println(checkAnagram(s1, s2));
    }
}
