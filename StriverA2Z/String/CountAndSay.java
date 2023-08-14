public class CountAndSay {
    
    static String countSay(int n){

        if(n==1) return "1";


        String prev = countSay(n-1);


        // String result = "1";

    

            String temp = "";

            int j = 0;
            int l = prev.length();

            char lastChar ='\0';
            int freq = 0;

            String tr = "";

            while(j<l){

                char c = prev.charAt(j);

                if(c==lastChar){

                    freq++;
                    lastChar = c;

                    temp = freq+""+c;

                }else{
                    tr=tr+temp;
                    lastChar = c;
                    freq=1;
                    temp = freq+""+c;             
                }
                j++;
            }
            tr=tr+temp;
            prev =tr;


       

        return prev;
    }


    public static void main(String[] args) {
        
        int n = 3;

        System.out.println(countSay(n));
    }
}
