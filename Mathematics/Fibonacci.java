public class Fibonacci{
    public static int findFibonacci(int n){
        int a=0,b=1,c=0;
        if(n==0)
            return a;
        else if(n==1)
            return b;
        for(int i=2;i<=n;i++){
            c = a+b;
            a=b;
            b=c;
        }
       
        return c;
    }

    public static void main(String[] args) {
        System.out.println(" Fibonacci of nth number: "+findFibonacci(6));
    }
}