public class RightMostDifferentBit {
    
public static int differentBitPosition(int m,int n){

    int i=1;
    while(m>0 || n>0){
        if(((m%2)^(n%2))!=0){
            return i;
        }
        m=m>>1;
        n=n>>1;
        i++;
    }


    return 0;
}

public static void main(String[] args) {
    System.out.println("first different bit: "+differentBitPosition(4, 4));
}

}
