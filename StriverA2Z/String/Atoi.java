public class Atoi {
    

    static Integer findInteger(String str){

        str = str.trim();

        int l = str.length();

        long result = 0;
        boolean isNeg = false;

        for(int i=0;i<l;i++){

            char c = str.charAt(i);

            if(c=='-' && i==0) {
                isNeg =true;
                continue;
            }else if(c=='+' && i==0){
                isNeg =false;
                continue;
            }

            int val = (int) c - (int) '0';

            if(val>=0 && val<=9){
            
                result = result*10+val;

                long temp = isNeg?-1:1;
                temp=temp*result;
                if(temp>Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                   
                }else if(temp<Integer.MIN_VALUE){
                    return  Integer.MIN_VALUE;
                }
            }else {
                break;
            }
            
        }



        if(result!=0 && isNeg){
            result = result*(-1);
        }

       

        return (int)result;
    }

    public static void main(String[] args) {
        
        String s = "2147483646";

        System.out.println(findInteger(s));
    }
}
