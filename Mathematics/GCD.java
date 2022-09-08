public class GCD {
    
    // Eucledian Algorithm
    public static Integer gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);

    }

    public static void main(String[] args) {
        int a= 4;
        int b= 8;
        System.out.printf("Greatest Common Divisor of %d and %d is: %d",a,b,gcd(a, b));
    }
}

// time complexity log(min(a,b))
