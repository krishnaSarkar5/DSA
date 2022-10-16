public class PalindromeCheckUsing {
    
    public static boolean isPalindrome(String s,int k){
        int len = s.length();
        if(k<(len/2)){
            
            if(s.charAt(k)==s.charAt(len-k-1)){
                return true&&isPalindrome(s, k+1);
            }else{
                return false;
            }
        }      
        return true;
    }

    public static void main(String[] args) {
        System.out.println(" is palindrome: "+isPalindrome("geeks", 0));
    }
}
