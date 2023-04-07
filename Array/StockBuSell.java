
public class StockBuSell {
    
    public static int findMaxProfit(int[] arr) {
        
        int inc=0 , dec=0, cp = Integer.MIN_VALUE, profit=0,bp=0;  // bp = buying price , cp = current price

        for(int i=0;i<arr.length;i++){

            if(arr[i]>cp && inc==0){  // starting point 
                inc = 1;
                dec = -1;
                bp=arr[i];
                cp=arr[i];
            }
            else if(arr[i]<cp && dec==0){ // starting point
                inc = 1;
                dec = -1;
                bp=arr[i];
                cp=arr[i];
            }
            else if(i==arr.length-1 && inc==1 && arr[i]>cp){ // llast point
                profit=profit+(arr[i]-bp);
            }
            else if(arr[i]<cp && inc==1){ // crossed max point i.e arr[i-1] is a max point in last increasing segment 
                dec=1;
                inc=-1;
                profit=profit+(arr[i-1]-bp);
                cp=arr[i];
                bp=arr[i];
            }
            else if(arr[i]>cp && dec==1){ // crossed min point i.e arr[i-1] is a min point in current increasing segment 
                dec=-1;
                inc=1;
                cp=arr[i];
                bp=arr[i-1];
            }

            else if(arr[i]>cp && inc==1){ // increasing continue
                dec=-1;
                inc=1;
                cp=arr[i];
            }
            else if(arr[i]<cp && dec==1){ // decreasing continue
                dec=1;
                inc=-1;
                cp=arr[i];
                bp=arr[i];
            }
            
        }

        return profit;
    }


    public static int findMaxProfitAlternative(int[] arr){

        int profit = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                profit=profit+arr[i]-arr[i-1];
            }
        }
        return profit;
    }


    public static void main(String[] args) {
        
        int [] arr = {1,5,3,1,2,8};
        System.out.println(findMaxProfit(arr));
        System.out.println(findMaxProfitAlternative(arr));
    }
}
