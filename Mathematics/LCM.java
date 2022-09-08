public class LCM {
    
     // Eucledian Algorithm
     public static Integer gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);

    }

    public static int findLCM(int a, int b){
        return (int)((a*b)/gcd(a, b));
    }

    public static void main(String[] args) {
        int a= 4;
        int b= 15;
        System.out.printf("Least Common Multiplier of %d and %d is: %d",a,b,findLCM(a, b));
    }
}
