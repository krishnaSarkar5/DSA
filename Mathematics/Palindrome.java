public class Palindrome {
    
    public static boolean isPalindrom(int n){

        int res=0;
        int temp=n;

        while(temp>0){
            int lastDigit = temp%10;
            res = res*10+lastDigit;
            temp=temp/10;
        }
        if(res==n)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int n =21;
        System.out.printf("Is %d is palindrome is: %b",n,isPalindrom(n));
    }

}

// Time complexity : Theta(no of digits present in given number)
// auxiliary space  : Theta(1)