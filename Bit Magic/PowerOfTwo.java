public class PowerOfTwo {
    
    public static boolean isPoswerOfTwo(int n){
        if (n==0){
            return false;
        }

        return (n & (n-1))==0;
    }

    public static void main(String[] args) {
        System.out.println("Is power of two: "+isPoswerOfTwo(12));
    }
}
