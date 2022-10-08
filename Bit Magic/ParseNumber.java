public class ParseNumber {
    
    public static boolean isParse(int n){

        boolean isLastDigitSet = false;
        while(n>0){
            if(((n%2)&1)!=0){
                if(!isLastDigitSet){
                    isLastDigitSet=true;
                }else{
                    return false;
                }             
            }else{
                isLastDigitSet=false;
            }
            n=n>>1;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("is sparse number: "+isParse(5));
    }
}
