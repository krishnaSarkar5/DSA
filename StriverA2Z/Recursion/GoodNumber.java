import java.util.ArrayList;
import java.util.Arrays;

public class GoodNumber{

    static boolean checkForGoodNumber(int i,int number,int lastSum,int digit){

        if(number<=0){
            return true;
        }

        int rem = number%10;

        if(rem==digit){
            return false;
        }

        if(rem>lastSum){
            if(lastSum==-1){
                lastSum=0;
            }
            lastSum=lastSum+rem;
        }else{
            return false;
        }

         number = number/10;
        return checkForGoodNumber(i+1, number, lastSum, digit);
    }

       static ArrayList<Integer> goodNumbers(int L, int R, int D, ArrayList<Integer> result){


        for(int i=L ;i<=R; i++){
            if(checkForGoodNumber(0, i, -1, D)){
                    result.add(i);
                }
        }

            return result;

    }



// Recursive solution
    // static ArrayList<Integer> goodNumbers(int L, int R, int D, ArrayList<Integer> result){




    //     if(L>R){
    //         return result;
    //     }

    //     if(checkForGoodNumber(0, L, -1, D)){
    //         result.add(L);
    //     }
        
    //    return goodNumbers(L+1, R, D, result);

    // }


 



    public static void main(String[] args) {
        ArrayList<Integer> result  = new ArrayList<>();

        int L=200,R=700,D=4;

        goodNumbers(L, R, D, result);
        

        System.out.println(result);
    }
}