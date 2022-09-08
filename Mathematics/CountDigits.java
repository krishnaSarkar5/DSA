public class CountDigits{


    public static int countDigit(Long n){
        int noOfDigits =0;
        while(n>0){
            noOfDigits++;
            n=n/10;
        }
        return noOfDigits;
    }


    public static void main(String[] args) {
        Long number=1549786542301256987L;
        System.out.println("No of digits in "+number+" is: "+ countDigit(number));
    }
}


// Time complexity : Theta(no of digits present in given number)
// auxiliary space  : Theta(1)