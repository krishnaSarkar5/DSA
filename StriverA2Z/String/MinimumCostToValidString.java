public class MinimumCostToValidString {
    
    static int minimumCost(String str){

       int l = 0;
        int r = 0;
        int k = 0;
        if (str.length() % 2 != 0)
            return -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '}') {
                if (k == 0) {
                    l++;
                    k++;
                } else
                    k--;
            } else {
                k++;
            }
        }
        return l + k / 2;
    }


    public static void main(String[] args) {
        
        String s ="}}}}}{";
        System.out.println(minimumCost(s));

    }
}
