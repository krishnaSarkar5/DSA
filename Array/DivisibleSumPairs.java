import java.util.List;

public class DivisibleSumPairs {
    

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
    
            
            int count = 0;
            
            for(int i=0;i<n-1;i++){
                
                for(int j=i+1;j<n;j++){
                    
                    System.out.println(ar.get(i)+"  "+ar.get(j));

                    if((ar.get(i)+ar.get(j))%k==0){
                        count++;
                    }
                    
                }
                
            }
            return count;
        }
    
    public static void main(String[] args) {
        
        List<Integer> list = List.of(1,3,2,6,1,2);
       System.out.println( divisibleSumPairs(6, 3, list));
    }
}
