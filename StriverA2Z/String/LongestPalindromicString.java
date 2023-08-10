public class LongestPalindromicString {
    

    static String findLongestPalindromicString(String s){

        int l = s.length();
        int start = 0 , end =0;

        for(int i=0;i<l;i++){
            int len1 = compareAndSpread(s, i, i, l);
            int len2 = compareAndSpread(s, i, i+1, l);

            int len = Math.max(len1, len2);

            if(end-start<len){
                start = i - (len-1)/2;
                end = i + len/2;
            }

        }

        return s.substring(start, end+1);
    }


    static int compareAndSpread(String s , int i ,int j,int l){

        while(i>=0 && j<l && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return j-i-1;
    }

    public static void main(String[] args) {
        

        String s = "babad";

        System.out.println(findLongestPalindromicString(s));
    }
}
