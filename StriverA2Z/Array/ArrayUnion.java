import java.util.ArrayList;
import java.util.List;

public class ArrayUnion {
    



    static List<Integer> merge(int[] a,int[] b){

        int i=0,j=0,k=0;

        List<Integer> result= new ArrayList<>();

        while(i<a.length && j<b.length){

            if(a[i]<b[j]){

                if(i>0 && a[i]==a[i-1]){
                    i++;
                    continue;
                }

                result.add(a[i]);
                i++;
            }
            else if(a[i]>b[j]){

                if(j>0 && b[j]==b[j-1]){
                    j++;
                    continue;
                }

                result.add(b[j]);
                j++;
            }else{

                if(result.get(result.size()-1)==a[i]){
                    i++;
                    j++;
                    continue;
                }

                result.add(a[i]);
                i++;
                j++;
            }

        }

        while(i<a.length){
            if(a[i]==a[i-1]){
                i++;
                continue;
            }
            result.add(a[i]);
            i++;
        }
        while(j<b.length){

            if(b[j]==b[j-1]){
                j++;
                continue;
            }

            result.add(b[j]);
            j++;
        }

        System.out.println(result);

       return result;

    }


    public static void main(String[] args) {
        
        int[] a = {3,3,4,5,6,7,8,9,9,9};
        int[] b = {2,4,10,10};

        merge(a, b);

    }
}
