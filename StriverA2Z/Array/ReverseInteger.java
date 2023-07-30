public class ReverseInteger {
    
    static int reverse(int num){

        // boolean isNegative = number>=0?false:true;

        // int n = isNegative?-1*number:number;

        // int res = 0;

        // while(n>0){
        //     int rem = n%10;
        //     res=res*10+rem;
        //     n=n/10;
        // }
        
        // int upperLimit = (int) Math.pow(2, 32)-1;

        // if(res>upperLimit){
        //     return 0;
        // }else{
        //     int t= (isNegative?(-1)*res:res);
        //     return t;
        // }

        int ans = 0;
        while (num != 0){
            int temp  =  num % 10;

            int maxLimit=Integer.MAX_VALUE /100;
            int minLimit=Integer.MIN_VALUE /100;

            if( (ans > Integer.MAX_VALUE /10 ) || (ans < Integer.MIN_VALUE /10) ){
                return 0;
            }

            ans   =  (ans * 10) + temp;
            num   = num / 10;

        }

//        System.out.println(ans);
        return ans;

    }

    public static void main(String[] args) {
        int n = -2147483412;
        System.out.println(n);
        System.out.println(reverse(n));
    }
}
