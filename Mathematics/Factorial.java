public class Factorial {
    
    public static long factorial(Integer n){
        long number = n.longValue();
        long res=1;
        for(long i=1;i<=number;i++){
            res=res*i;
        }
        return res;
    }


    public static void main(String[] args) {
        int n =5;
        System.out.printf("Factorial of %d  is: %d",n,factorial(n));
    }
}

// time complexity O(n)
// auxiliary space Theta(1)