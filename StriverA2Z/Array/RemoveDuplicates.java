import java.util.Arrays;

public class RemoveDuplicates {
    

    static int remove(int[] arr){

       int pos = 0;

        for(int i=1;i<arr.length;i++){

            if(arr[i]!=arr[pos]){
                arr[pos+1]=arr[i];
                pos++;
            }

        }

        System.out.println(Arrays.toString(arr));


        return pos+1;
    }

    public static void main(String[] args) {
        
        int[] arr = {1,1,1};

        System.out.println(remove(arr));

    }
}
