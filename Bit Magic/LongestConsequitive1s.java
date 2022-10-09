public class LongestConsequitive1s {
    
    public static int consequitive(int n){       
        int  largestConsiquitive = 0;
        int cn = 0;
        while(n>0){
            if((n&1)==1){
                cn++;
                if(cn>largestConsiquitive){
                    largestConsiquitive=cn;
                }
            }else{
                cn=0;
            }
           n = n>>1;
        }       
        return largestConsiquitive;
    }

    public static void main(String[] args) {
        System.out.println("largest consequitive 1's: "+consequitive(7326));
    }
}
