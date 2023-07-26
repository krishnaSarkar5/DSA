import java.util.*;

public class JoshephusProblem {
    

    static void findSafePlace(int index,int k,List<Integer> list){

            if(list.size()<=1){
                return;
            }

            int deletePos =  index+k-1;

            while(deletePos>=list.size()){
                deletePos=deletePos-list.size();
            }

            list.remove(deletePos);

            findSafePlace(deletePos, k, list);

    }



    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        

        findSafePlace(0, 2, l);

        System.out.println(l);
        
    }
}
