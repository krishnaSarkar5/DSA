public class TrailingZero {
    
    public static int findTrailingZeroInFactorial(int n){
        
        int res =0;
        for(int i=5;i<=n;i=i*5){
            res=res+n/i;
        }
        return res;
    }

    public static void main(String[] args) {
        int n =25;
        System.out.printf("Trailing zero in factorilsl of %d is %d",n,findTrailingZeroInFactorial(n));
    }

    // time complexity = O(log(n))

}
