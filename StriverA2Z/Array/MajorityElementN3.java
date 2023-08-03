import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementN3 {
    

    static List<Integer> findMajority(int[] arr){

        // int c = 0;
        // Integer last = null;

        // for(int i=0;i<arr.length;i++){

        //     if(c==0){
        //         last=arr[i];
        //         c++;
        //     }

        //    else if(arr[i]==last){
        //         c++;
        //     }else{
        //         arr[i]=last;
        //         c--;
        //     }
        // }



        // int c1=0;

        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==last){
        //         c1++;
        //     }
        // }
        // if(c1>arr.length/2){
        //     return last;
        // }else{
        //     return -1;
        // }

        Map<Integer,Integer> map = new HashMap<>();

        List<Integer> result = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
           if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
           }else{
                map.put(arr[i], 1);
           }
        }


        for(Map.Entry<Integer,Integer> e : map.entrySet()){

            if(e.getValue()>arr.length/2){
                result.add(e.getKey());
            }

        }
        Collections.sort(result);   
        return result;


    }

    public static void main(String[] args) {
        int[] arr ={1,1,1,2,2,2};
        System.out.println(findMajority(arr));
    }
}
