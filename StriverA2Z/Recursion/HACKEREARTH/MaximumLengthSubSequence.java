package HACKEREARTH;

public class MaximumLengthSubSequence {
    


    public static void main(String[] args) {
        
        int[] arr = {1, 9, 14, 2, 17, 14, 5, 18};
        int maxCount = 0;

        for(int i=0;i<arr.length;i++){

            int maxValue = arr[i]+10;
            int count=0;

            for(int j=0;j<arr.length;j++){
                if(arr[j]<=maxValue && arr[j]>=arr[i]){
                    count++;

                    if(count>maxCount){
                        maxCount=count;
                    }
                }
            }
        }

        System.out.println("Max Length: "+maxCount);

    }
}
