import java.util.Arrays;

public class Sort012 {
    

    static void sortBetter(int[] arr){

        int zero=0,one=0,two=0;

        for(int i=0;i<arr.length;i++){
            
            if(arr[i]==0)
                zero++;
            else if(arr[i]==1)
                one++;
            else if(arr[i]==2)
                two++;
        }

        for(int i=0;i<arr.length;i++){
            if(zero>0){
                arr[i]=0;
                zero--;
            }else if(one>0){
                arr[i]=1;
                one--;
            }else if(two>0){
                arr[i]=2;
                two--;
            }
        }



    }

    static void sortOptimal(int[] arr){

        int low=0,mid=0,high=arr.length-1;

        while(mid<=high){
            if(arr[mid]==0){
                swap(arr, low, mid);
                low++;
                mid++;
            }else if(arr[mid]==2){
                swap(arr, mid, high);
                high--;
            }else{
                mid++;
            }
        }

    }

    static void swap(int[] arr ,int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,2,2,0,0,1,0};
        sortOptimal(arr);
        System.out.println(Arrays.toString(arr));
    }
}
