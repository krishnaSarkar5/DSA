import java.util.*;

public class Threesum {
    
    static List< List < Integer > > findThreesum(int[] arr){

        Arrays.sort(arr);

        List< List < Integer > > result = new ArrayList<>();

        for(int i=0;i<arr.length;i++){

            if(i>0 && arr[i]==arr[i-1]) continue;

            int j=i+1;                                            // -4 -1 -1 0 1 2
            int k=arr.length-1;

            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];

                if(sum>0){
                    k--;
                }else if(sum<0){
                    j++;
                }else{
                    List<Integer> temp  = new ArrayList<>();                    
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    result.add(temp);
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1]) j++;
                    while(j<k && arr[k]==arr[k+1]) k--;

                }

            }

        }


        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};  
        List<List<Integer>> result = findThreesum(arr);
        System.out.println(result);
    }
}
