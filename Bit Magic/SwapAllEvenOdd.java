public class SwapAllEvenOdd {
    
    public static int swapOddEven(int n){
        
        int evenBits,oddBits;

        evenBits = n & 0xAAAAAAAA;
        oddBits = n & 0x55555555;
        evenBits = evenBits>>1;
        oddBits = oddBits<<1;
        
        return evenBits | oddBits;
    }


    public static void main(String[] args) {
        System.out.println("++++ swapped number: "+swapOddEven(23));
    }
}
