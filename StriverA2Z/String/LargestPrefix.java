public class LargestPrefix {
    

    static String findLargestPrefix(String[] arr){

        String result = arr[0];
        int l = arr.length;

        for(int i=1;i<l;i++){

            int ml = Math.min(result.length(), arr[i].length());

            int j=0;

            String t = "";

            while(j<ml){
                if(result.charAt(j)==arr[i].charAt(j)){
                    t=t+arr[i].charAt(j);
                }else{
                    break;
                }
                j++;

            }
            result=t;
        }


      
        return result;
    }

    public static void main(String[] args) {

        String[] arr = {"abcd","abc","abref","abcde"};

        System.out.println(findLargestPrefix(arr));
        
    }
}
