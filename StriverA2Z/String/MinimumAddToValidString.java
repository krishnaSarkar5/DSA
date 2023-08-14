public class MinimumAddToValidString {


    static int minimumAdd(String s){

        int l = s.length();
        int op = 0 , cl = 0;

        for(int i=0;i<l;i++){
            char c = s.charAt(i);

            if(c=='(') {
                op++;
            }
            else if(c==')') {
                
                if(op>0) op--;
                else cl++;

            }
        }


        return cl+op;
    }


    public static void main(String[] args) {
        
        String s = "()))((";
        System.out.println(minimumAdd(s));

    }
}
