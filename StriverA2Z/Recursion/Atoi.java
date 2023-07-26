public class Atoi{

  static int convert(int i ,String str, int intValue , boolean neg){
        

    if(i>=str.length()){
        return neg?-intValue:intValue;
    }

        int val = str.charAt(i) - '0' ;

        if(val==-3){
            neg=true;
        }


        if((val>=0 && val<=9) || (val==-3 && i==0)){
            intValue = intValue*10 + val;

            if(val==-3){
                intValue=0;
            }

            return convert(i+1,str,intValue,neg);
        }else{
            return -1;
        }
        
        
    }
    
    
    
    static int atoi(String str) {
	// Your code here
	
	    return convert(0,str,0,false);
	
    }

    public static void main(String[] args) {
        String str = "--1234";

        System.out.println(atoi(str));
    }

}