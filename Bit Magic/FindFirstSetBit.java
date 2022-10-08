public class FindFirstSetBit{

    // public static int firstSetBitPosition(int n){
    //     return n & ~(n-1);
    // }

    public static int firstSetBitPosition(int n){
        int i=0;
        while(n>0){
           if((n&1)!=0){
            return i+1;
           }
           i++;
           n=n>>1;
           System.out.println("i: "+i+"n: "+n);
        }
        
        return 0;
        // return n & ~(n-1);
    }

    public static void main(String[] args) {
        System.out.println("Fisrt set bit of 6 is: "+ firstSetBitPosition(544));
    }
}