public class BitDifference {
    
    public static int noOfBits(int a,int b){
        
        int res =0;
        while(b>0 || a>0){
            if( ((a%2)^(b%2))!=0 ){
                res++;
            }
            a=a>>1;
            b=b>>1;
        }
        
        return res;
    }

    public static void main(String[] args) {
        System.out.println("no of flips: "+ noOfBits(90, 43));
    }
}
