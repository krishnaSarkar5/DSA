import java.util.Stack;

public class RemoveParenthesis{


    static String remove(String s){
        StringBuilder sb = new StringBuilder();

        Stack<String> stack = new Stack<>();

        int l = s.length();

        stack.push(""+ s.charAt(0));

        for(int i=1;i<l;i++){
          String t = ""+ s.charAt(i);

          if(t.equals(")") && stack.peek().equals("(")){
            stack.pop();

            if(stack.size()==1){
                sb.append("()");
            }

          }else if(t.equals("(")){
            stack.push(t);
          }

        }

        return sb.toString();
    }



    public static void main(String[] args) {
        
        String s = "(()())(())";

        System.out.println(remove(s));


    }
}