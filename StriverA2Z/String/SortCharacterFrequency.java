import java.util.HashMap;
import java.util.Map;

public class SortCharacterFrequency {
    

    static String sort(String s){

        Map<Character,Integer> map = new HashMap<>();

        int l = s.length();

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<l;i++){

            char c = s.charAt(i);

            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{             
                map.put(c, 1);
            }
        }

        map.entrySet().stream().sorted(Map.Entry.<Character, Integer>comparingByValue().reversed()).forEach(record -> {
                        Character key = record.getKey();
                        int value = record.getValue();
       
                        for(int i = 0; i < value; i++) {
                              sb.append(key);
                         }
            });

            return sb.toString();

    }


    public static void main(String[] args) {
        
        String s = "abcAbc";

        System.out.println(sort(s));;

    }
}
