public class CountSetBit {
    public static int setBits(int n){
        int res=0;
        for(int i=1;i<=n;i++){
            int m=i;
            while(m>0){
                m= (m&(m-1));
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(" total bits: "+setBits(4));
    }
}
