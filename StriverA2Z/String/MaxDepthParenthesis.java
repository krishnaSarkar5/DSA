public class MaxDepthParenthesis {
    

    static int findMaxDepth(String s){

        int l = s.length();

        int op = 0 , max = 0;

        for(int i=0;i<l;i++){

            char c = s.charAt(i);

            if(c=='('){
                op++;
                max = Math.max(max, op);
            }else if(c==')'){
                op--;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        
        String s = "(1+(2*3)+((8)/4))+1";

        System.out.println(findMaxDepth(s));

    }
}
