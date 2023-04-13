import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class MigratoryBird {
    
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        
        Map<Integer,Integer> birds = new TreeMap<>();
        
        
        int resultType=0,maxCount=0; 
        
        for(Integer type : arr){
            if(Objects.isNull(birds.get(type))){
                birds.put(type, 1);
            }else{
                birds.put(type, birds.get(type)+1);
            }
        }
        
        System.out.println(birds);


        for(Map.Entry<Integer,Integer> entry : birds.entrySet()){
            
            System.out.println(entry);

            if(maxCount < entry.getValue()){
                maxCount=entry.getValue();
                resultType=entry.getKey();
            }     
        }
        
        
        return resultType;
    
        }

        public static void main(String[] args) {
            
        
            List<Integer> list = List.of(1,4,4,4,5,3);

            System.out.println(migratoryBirds(list));

        }
}
