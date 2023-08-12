public class SumOfBeautyString {
    

    static int sumOfBeauty(String s){
        
        int l = s.length();
        int ans = 0;

        for(int i=0;i<l;i++){
            
            int[] freq = new int[26];
           

            for(int j=i;j<l;j++){
                 
                int min = Integer.MAX_VALUE,max=Integer.MIN_VALUE;

                char  c =s.charAt(j);

                freq[c-'a']++;

                for(int k=0;k<26;k++){
                    if(freq[k]!=0){
                        max = Math.max(max, freq[k]);
                        min = Math.min(min, freq[k]);
                    }
                }

                ans=ans+(max-min);
            }
            
        }


        return ans;
    }

    public static void main(String[] args) {
        
        String s = "aabcbaa";

        System.out.println(sumOfBeauty(s));

    }
}
