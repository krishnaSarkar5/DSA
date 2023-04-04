import java.util.Arrays;

public class MoveZeroToEnd {
    
    // Time complexity = Theta(n)
    public static void moveZero(int[] arr){
        int j=0;
        int zeroCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
            else {
                zeroCount++;
            }
        }
        for(int i=arr.length-zeroCount;i<arr.length;i++){
            arr[i]=0;
        }
    
    }

// Time complexity = Theta(n)
    public static void moveZeroAlternative(int[] arr){

        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[count];
                 arr[count] = arr[i];
                 arr[i] = temp;
                 count++;
            }
        }

    }

    public static void main(String[] args) {
        int [] arr = {8,5,0,10,0,20};
        moveZeroAlternative(arr);
        System.out.println(Arrays.toString(arr));
    }
}
