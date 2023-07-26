import java.util.ArrayList;
import java.util.List;

public class KthSymbolInGrammer {
    


    static void getMatrix(int n,int k,List<List<Integer>> matrix){

        if(n==1){
             List<Integer> temp = new ArrayList<>();
             temp.add(0);
            matrix.add(new ArrayList<>(temp));
            return;
        }

        getMatrix(n-1, k, matrix);

       

        List<Integer> temp = new ArrayList<>();

        for(int i=0;i<matrix.get(n-2).size();i++){
            

            if(matrix.get(n-2).get(i)==0){
                temp.add(0);
                temp.add(1);
            }else if(matrix.get(n-2).get(i)==1){
                temp.add(1);
                temp.add(0);
            }
        }
        matrix.add(temp);

    } 

    public static void main(String[] args) {
        
        List<List<Integer>> matrix = new ArrayList<>();


        int n=4,k=3;

        getMatrix(n, k, matrix);

         System.out.println(matrix);

        System.out.println(matrix.get(n-1).get(k-1));

    }
}
