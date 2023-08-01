import java.util.HashSet;
import java.util.Set;

public class SetMatrixZero {
    

    static void setZero(int[][] arr){

        Set<Integer> columns = new HashSet<>();
        for(int i=0;i<arr.length;i++){
 
            boolean zero = false;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==0){
                    zero=true;
                    columns.add(j);
                }
            }

            if(zero){
                for(int j=0;j<arr[i].length;j++){
                    arr[i][j]=0;
                }
            }
            zero=false;
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){

                if(columns.contains(j)){
                    arr[i][j]=0;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZero(arr);
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
