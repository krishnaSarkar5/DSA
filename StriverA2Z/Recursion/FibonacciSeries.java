import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FibonacciSeries {
    
    // print fibonacci series for first N terms in reverse order



    static int printFibonacciNumber(int n,Map<Integer,Integer> lookupTable){

        if(n<=1){
            // System.out.println(n);
            if(Objects.isNull(lookupTable.get(n))){
                lookupTable.put(n, n);
                return n;
            }else{
                return lookupTable.get(n);
            }
        }

        int x , y;

        if(Objects.isNull(lookupTable.get(n-1))){
            x = printFibonacciNumber(n-1, lookupTable);
            lookupTable.put(n-1, x);

        }else{
            x= lookupTable.get(n-1);
        }

        if(Objects.isNull(lookupTable.get(n-2))){
            y = printFibonacciNumber(n-2, lookupTable);
            lookupTable.put(n-2, y);
        }else{
            y= lookupTable.get(n-2);
        }
    
        // int x= printFibonacciNumber(n-1,lookupTable)+printFibonacciNumber(n-2,lookupTable);
        // System.out.println(x);
        return x+y;

    }

    public static void main(String[] args) {
        int n = 5;

        int result = printFibonacciNumber(n,new HashMap<>());
        System.out.println(result);
    }
}
