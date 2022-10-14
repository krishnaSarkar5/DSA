public class PrintNTo1 {
    
    public static void NToOne(int n){

        if(n==0)
            return;
        System.out.print(n+" ");
        NToOne(n-1);
    }

    public static void main(String[] args) {
        System.out.println("Print N to 1 using Recursion: ");
        NToOne(5);
    }
}
