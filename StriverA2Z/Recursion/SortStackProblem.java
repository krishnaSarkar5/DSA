import java.util.ListIterator;
import java.util.Stack;

public class SortStackProblem {
    

    public static void stackInsert(Integer x , Stack<Integer> s){

        if(s.empty() || x<=s.peek()){
            s.push(x);
            return;
        }

        Integer temp = s.pop();

        stackInsert(x, s);

        s.push(temp);

       

    }



    static void stackPop(Stack<Integer> s){
        
        if(!s.empty()){
          Integer x =  s.pop();

          stackPop(s);

          stackInsert(x, s);
        }

    }

static void printStack(Stack<Integer> s)
    {
        ListIterator<Integer> lt = s.listIterator();
 
        // forwarding
        while (lt.hasNext())
            lt.next();
 
        // printing from top to bottom
        while (lt.hasPrevious())
            System.out.print(lt.previous() + " ");
    }




    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);

        stackPop(s);

        printStack(s);

    }






}
