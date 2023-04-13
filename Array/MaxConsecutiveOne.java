
public class MaxConsecutiveOne {

    public static int findMaxConsecutive(int [] arr){

        int count = 0,maxCount=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==1){
                count++;
            }else if(arr[i]==0){
                if(count>maxCount){
                    maxCount=count;
                    count=0;
                }
                    
            }
        }
        
        return maxCount>count?maxCount:count;
    }

    public static void main(String[] args) {
        int[] arr ={0,0,0};

        System.out.println(findMaxConsecutive(arr));
    }
}
