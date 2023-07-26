import java.util.Arrays;

public class MoveZeroToEnd {
    

    static void moveZero(int[] arr){

        int pos = 0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]!=0){
                arr[pos]=arr[i];
                pos++;
            }
        }

        for(int i=pos;i<arr.length;i++){
            arr[i]=0;
        }

        System.out.println(Arrays.toString(arr));


    }

    public static void main(String[] args) {
        
        int[] arr = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};

        moveZero(arr);

    }
}
