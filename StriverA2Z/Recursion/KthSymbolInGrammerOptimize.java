public class KthSymbolInGrammerOptimize {
    

    static int findValue(int N,int K){

        if(N==1 && K==1){
            return 0;
        }

        int middle = (int)Math.pow(2,N-1)/2;

        if(K<=middle){
           return findValue(N-1, K);
        }else{
          int value = findValue(N-1, K-middle);
          return value==0?1:0;
        }

    }



    public static void main(String[] args) {
        int N = 4,K=4;
        System.out.println(findValue(N, K));
    }
}
