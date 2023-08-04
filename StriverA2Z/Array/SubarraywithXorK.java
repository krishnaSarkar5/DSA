import java.util.HashMap;
import java.util.Map;

public class SubarraywithXorK {
    

    static int findSubarray(int[] arr,int k){

        int xor = 0 , c = 0;

        Map<Integer,Integer> map = new HashMap<>();

        map.put(xor, 1);

        for(int i=0;i<arr.length;i++){

            xor = xor ^ arr[i];

            int rem = xor^k;

            if(map.containsKey(rem)){
                c+=map.get(rem);
            }

            if(map.containsKey(xor)){
                map.put(xor,map.get(xor)+1);
            }else{
                 map.put(xor,1);
            }
        }


        return c;
    }

    public static void main(String[] args) {
        
        int[] arr = {5, 6, 7, 8, 9};
        int  k = 5;
        System.out.println(findSubarray(arr, k));

    }
}
