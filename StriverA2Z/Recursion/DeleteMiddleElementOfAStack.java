import java.util.Iterator;
import java.util.Stack;

public class DeleteMiddleElementOfAStack {
    





    static void deleteMiddleElement( Stack<Integer> s,int target){

       

        if(target>1){
            int temp = s.pop();

            deleteMiddleElement( s, target-1);

            s.push(temp);
            return;
        }else{
            s.pop();
            return;
        }



    }


    static void printStack(Stack<Integer> s){
       Iterator<Integer> itr = s.iterator();

       while(itr.hasNext()){
            System.out.println(itr.next());
       }
    }


    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        printStack(s);

        System.out.println("--------------- Before delete middle element ------------- ");
        

        int middle = (s.size()/2) + 1;

        deleteMiddleElement(s, middle);

        printStack(s);

    }
}
