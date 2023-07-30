public class StockBuyAndSell {
    
    static int findMaxProfit(int[] arr){
        
        int last=arr[0],p=0,b=arr[0],max=0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]<last){
                p=p+(arr[i]-last);
                last=arr[i];
                if(arr[i]<b){
                    b=arr[i];
                    p=0;
                }
            }
            if(arr[i]>last){
                p=p+(arr[i]-last);
                last=arr[i];
            }
            max=Math.max(max, p);
        }

       
        return max;

        
    }

    static int findMaxProfitOptimal(int[] arr){

        int min  = Integer.MAX_VALUE;
        int max = 0;

        for(int i=0;i<arr.length;i++){
             min = Math.min(min, arr[i]);
             max = Math.max(max, arr[i]-min);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {5,83,34,27,56 };
        System.out.println(findMaxProfit(arr));
        System.out.println(findMaxProfitOptimal(arr));
    }
}
