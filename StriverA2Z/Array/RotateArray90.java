public class RotateArray90 {
    
    static void rotate(int[][] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[i].length;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
            reverse(arr, i);
        }

    }

    static void reverse(int[][] arr,int row){
        for(int i=0;i<arr[row].length/2;i++){
            int temp = arr[row][i];
            arr[row][i]=arr[row][arr[row].length-1-i];
            arr[row][arr[row].length-1-i]=temp;
        }
    }


    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
