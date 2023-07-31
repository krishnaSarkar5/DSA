import java.util.*;

public class Leader {
    

    static List<Integer> findLeaders(int[] a){

        Set<Integer> result =  new LinkedHashSet<>();

        result.add(a[a.length-1]);

        int max = a[a.length-1];

        for(int i=a.length-1;i>=0;i--){
            if(a[i]>max){
                result.add(a[i]);
                max=a[i];
            }         
            
        }

        // for(int i=0;i<result.size()/2;i++){
        //     int temp = result.get(i);
        //     result.set(i, result.get(result.size()-1-i));
        //     result.set(result.size()-1-i, temp);
        // }


        return new ArrayList<>(result);

    }

    public static void main(String[] args) {
        int[] arr = {148,162,85,18,107,32};
        System.out.println(findLeaders(arr));
    }
}
