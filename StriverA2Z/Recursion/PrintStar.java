public class PrintStar{



    // public static void print(int i , int n){

    //     if(i>=n)
    //         return;

    //     System.out.print("* ");

    //     print(i+1, n);
    // }


    // public static void printPattern(int i , int n){

    //     if(i>=n)
    //         return;

    //     print(0, i);

    //     System.out.println("");

    //     printPattern(i+1, n);
    // }



    public static void print(int i , int n){

        if(i>=n)
            return;

        System.out.print("* ");

        print(i+1, n);
    }


    public static void printPattern(int i , int n){

        if(n<=0)
            return;

        print(i,n);

        System.out.println("");

        printPattern(0, n-1);
    }


    public static void main(String[] args) {
        int n=5;

        printPattern(0, n);

    }
}