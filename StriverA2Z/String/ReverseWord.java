public class ReverseWord {
    
      public static String reverseWords(String s) {
        
        String temp = "";

        StringBuilder result = new StringBuilder();

        int l = s.length();

        for(int i=l-1;i>=0;i--){

            char t = s.charAt(i);

            if(t==' '){

                if(temp!=""){
                    result.append(temp);
                    result.append(" ");
                    temp="";
                }

            }else{
                temp = t+temp;
            }

        }

        if(temp!=""){
            result.append(temp);
        }

        return result.toString().trim();

    }

    public static void main(String[] args) {
        

        String s = "Hello World";

        System.out.println(reverseWords(s));

    }
}
