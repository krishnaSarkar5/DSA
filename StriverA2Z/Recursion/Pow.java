public class Pow {
    

     static long calculatePow(long n ,long k,long result){
          
         long mod = 1000000007;

        if(k<=0){
           return result;
        }


        if(k%2==0){
           return calculatePow((n*n)%mod, k/2, result);
        }else{
            k=k-1;
            return calculatePow(n, k, (result*n)%mod);
        }

    }



    static long reverse(long n,long result){

        if(n<=0){
            return result;
        }

        long rem = n%10;
        result = result*10+rem;
        
        n=n/10;

        return reverse(n, result);
    }

    public static void main(String[] args) {
    //    long result = calculatePow(2, 3, 1);

    long n = 12;
    long rev = reverse(n, 0);
    long pow = calculatePow(n,rev, 1);
    
    long result = pow%1000000007;

    
       System.out.println(result);
    }
}
