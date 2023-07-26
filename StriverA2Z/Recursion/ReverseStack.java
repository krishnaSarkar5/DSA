import java.util.ListIterator;
import java.util.Stack;

public class ReverseStack {
    

    static void reverse(int index,int length,Stack<Integer> stack){

        if(length>1){
            int temp = stack.pop();

        insert(index, temp, length, stack);

        reverse(index+1, length-1, stack);
        }

    }


    static void insert(int position ,int value,int length,Stack<Integer> stack){

        if(position==length){
            stack.push(value);
            return;
        }

        if(!stack.isEmpty()){
            int temp = stack.pop();

        insert(position, value, stack.size(), stack);

        stack.push(temp);
        }

    }

    static void printStack(Stack<Integer> s)
    {
        ListIterator<Integer> lt = s.listIterator();

        // System.out.println("size of stack "+s.size());
 
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

        System.out.println("-------Before reverse----------");
        printStack(s);
        System.out.println("\n-------After reverse----------");
        // System.out.println("size of stack "+s.size());

        reverse(0, s.size(), s);

        printStack(s);
    }
}
