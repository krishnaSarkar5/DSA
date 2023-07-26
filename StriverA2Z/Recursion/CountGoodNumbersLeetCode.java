public class CountGoodNumbersLeetCode{


public static int countGoodNumbers(long n) {

        long noOfOddPositions = n/2; 
        // long noOfEvenPostions = n-noOfOddPositions;

        long result = n%2==0?1:5;        

       long value = calculatePower(20, n/2, 1);

      

        // return Integer.parseInt(String.valueOf(value1*value2));
        return (int)((value*result)%1000000007);
        // return findAndCountAllGoodNumbers( start, end);

    }


      static long calculatePower(long number,long power,long result){


        if(power<=0){
            return result;
        }

        // number = number%1000000007;
        
        if(power%2==0){
           
            number=(number*number)%1000000007;
            power=power/2;
           
        }else{
            result=(result*number)%1000000007;
            power--;
        }
        // number=number%1000000007;
         return calculatePower(number, power, result);

    }


    // static int findAndCountAllGoodNumbers(long start,long end){

    //     int count = 0;

    //     start=start%1000000007;
    //     end=end%1000000007;

    //     for(long i=start;i<=end;i++){
    //         if(checkForGoodNumber(0,String.valueOf(i))){
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    // static boolean checkForGoodNumber(int i,String number ){
    //     if(i>=number.length()){
    //         return true;
    //     }

    //     int value = (int) number.charAt(i) - (int)'0';
    //     if(i%2==0 && value%2!=0){
    //         return false;
    //     }else if(i%2!=0 && (value!= 2 && value!= 3 && value!= 5 && value!= 7)){
    //         return false;
    //     }
    //     return checkForGoodNumber(i+1,number);
    // }



    public static void main(String[] args) {
        System.out.println(countGoodNumbers(1924));
        // System.out.println(calculatePower(2, 8, 1));
    }
}