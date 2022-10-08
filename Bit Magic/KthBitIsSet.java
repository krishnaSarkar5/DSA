public class KthBitIsSet {
    
    public static boolean isKthBitSet(int n, int k){
        
        return ((n>>k)&1)!=0;
    }

    public static void main(String[] args) {
        System.out.println("is kth bit set: "+isKthBitSet(45, 3));
    }
}
