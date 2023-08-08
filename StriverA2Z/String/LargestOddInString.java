

public class LargestOddInString {
    

    public static String findLargestString(String s){

        int l = s.length();
        

        for(int i=l-1;i>=0;i--){

            int t = (int) s.charAt(i) - (int) '0';

            if(t%2!=0){
                return s.substring(0, i+1);
            }
        }

        return "";
    }

    public static void main(String[] args) {
        String s = "10133890";
        System.out.println(findLargestString(s));
    }
}
