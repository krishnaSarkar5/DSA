import java.util.Arrays;

public class NextPermutation {
    
    static int[] nextPermutation(int[] arr){

        int i = arr.length-2;
        int min = arr[arr.length-1];
        boolean flag = false;
        while(i>=0){
            // min=Math.min(arr[i], min);
            if(arr[i]<arr[i+1]){

                if(arr[i]<min){
                    rightRotate(arr, i);
                    sort(arr,i);
                    flag=true;
                    break;
                }else{
                    leftRotate(arr, i);
                    flag=true;
                    break;
                }                
            }
            i--;
        }

        if(!flag ){
            for(int j=0;j<arr.length/2;j++){
                swap(arr, j, arr.length-1-j);
            }
        }
        return arr;
    }

    static void leftRotate(int[] arr , int index){
        int temp = arr[index];
        int i=index+1;
        while(i<arr.length){
            arr[i-1]=arr[i];
            i++;
        }
        arr[i-1]=temp;
    }

    static void rightRotate(int[] arr , int index){
        int temp = arr[arr.length-1];
        int i=arr.length-1;
        while(i>index){
            arr[i]=arr[i-1];
            i--;
        }
        arr[i]=temp;
    }

    static void swap(int[] arr, int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    static void sort(int[] arr ,int index){
        int[] temp = new int[arr.length-index];
        for(int i=index+1;i<arr.length;i++){
            temp[i-index]=arr[i];
        }
        Arrays.sort(temp);
        for(int i=index+1;i<arr.length;i++){
            arr[i]=temp[i-index];
        }

    }



    public static void main(String[] args) {
        int[] arr = {1,2};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
