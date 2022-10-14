public class Print1toN{
    
    // Non Tail Recursion
    public static void oneToN(int n){
        
        if(n==0)
            return;
        oneToN(n-1);
        System.out.print(n+" ");
    }

    // Tail recursion
    public static void oneToNTail(int n,int k){
        if(n==0)
            return;
        System.out.print(k+" ");
        oneToNTail(n-1,k+1);
    }

    public static void main(String[] args) {
        System.out.println("Print from 1 to N");
        oneToN(5);
        System.out.println("");
        System.out.println("using tail recursion:");
        oneToNTail(5,1);
    }


}