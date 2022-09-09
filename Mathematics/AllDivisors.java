public class AllDivisors {
    
    public static void allDivisors(int n){
        int i ;
        for( i=1;i*i<=n;i++){
            if(n%i==0)
                System.out.print(" "+i);
        }
        for(;i>=1;i--){
            if(n%i==0)
                System.out.print(" "+n/i);
        }

    }

    public static void main(String[] args) {
        System.out.println("All divisors are: ");
        allDivisors(15);
    }

}

// Time complexity O(squareRoot(n))