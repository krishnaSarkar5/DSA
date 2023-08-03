import java.util.*;

public class StockBuySelII {
    
   static ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        // code here
        
        int min = Integer.MAX_VALUE;
        int mp = 0;
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        int sell=-1,buy=-1;
        
        for(int i=0;i<n;i++){
            
            if(min>=A[i]){
                min=A[i];
                buy=i;
            }
            
            int p = A[i]-min;
            
            if(p>mp){
                
                mp=p;
                
                sell=i;
                ArrayList<Integer> temp = new ArrayList<>();
                
                if(result.size()==0){
                    
                    temp.add(buy);
                    temp.add(sell);
                    result.add(temp);
                    
                }else{
                    int x = result.get(result.size()-1).get(0);
                    
                    if(x==buy){
                        result.remove(result.size()-1);
                        temp.add(buy);
                        temp.add(sell);
                        result.add(temp);
                    
                    }else{
                        temp.add(buy);
                        temp.add(sell);
                        result.add(temp);
                    }
                    
                }
                
            }
            
        }
        
        int p=0;
        for(int i=0; i<n-1; i++)
                p += Math.max(0,A[i+1]-A[i]);

                System.out.println("p "+p);

        if(result.size()==0)
                System.out.print("No Profit");
            else{
                int c=0;
                for(int i=0; i<result.size(); i++)
                    c += A[result.get(i).get(1)]-A[result.get(i).get(0)];
                System.out.println("c "+c);
                if(c==p)
                    System.out.println(1);
                else
                    System.out.println(0);
            }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {822,754,1689,305,214,782,1463,1432,1382,1734,948,231,210,1676,877,670,1384,725,1370,412,724,371,928,358,533,1031,850,1555,1064,845,1692,514,630,1333,1640,315,1639,1792,1779,1325,1619,1400,378,145,913,901,1652,530,1259,880,303,685,1586};
        System.out.println(arr.length);
        ArrayList<ArrayList<Integer>> result = stockBuySell(arr, arr.length);

        System.out.println(result);
    }
}
