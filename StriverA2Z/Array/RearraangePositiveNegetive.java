import java.util.Arrays;

public class RearraangePositiveNegetive {
    
    static int[] rearrange(int[] arr){

        int[] result = new int[arr.length];

        int pos = 0, neg =1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                result[pos]=arr[i];
                pos=pos+2;
            }
            if(arr[i]<0){
                result[neg]=arr[i];
                neg=neg+2;
            }
        }
        return result;

    }

    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,-3,-1,-2,3};
        int[] result =rearrange(arr);
        System.out.println(Arrays.toString(result));
    }
}
