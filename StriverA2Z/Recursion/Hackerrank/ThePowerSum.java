package Hackerrank;

import java.util.ArrayList;
import java.util.List;

public class ThePowerSum {
    

    // static int findWays(int index,long target,int power, int result){

    //    long value = (long) Math.pow(index, power);

    //    if(target==0){
    //      result++;
    //     return result;
    //    }else if(target<0){
    //         return 0;
    //    }

    //    if(value<=target){

    //         result = result + findWays(index+1, target-value, power, result);
    //         result = result + findWays(index+1, target, power, result);
    //         return result;
    //    }

    //    return 0;
    // }


   static void findWays(int index,long target,int power, int result,List<Integer> ds ,List<List<Integer>> ans){

       long value = (long) Math.pow(index, power);

       if(target==0){
         ans.add(new ArrayList<>(ds));
        return;
       }

       if(value<=target){

            ds.add(index);

          findWays(index+1, target-value, power, result,ds,ans);
          ds.remove(ds.size()-1);
          findWays(index+1, target, power, result,ds,ans);
        
       }
 return;
    }


//  static int findWays(int index,long target,int power, int result){

//        long value = (long) Math.pow(index, power);

//        if(target==0){
//         result++;
//         return result;
//        }

//        if(value<=target){

         

//           result = findWays(index+1, target-value, power, result);
          
//           result = findWays(index+1, target, power, result);
        
//          return result;
//        }
//        return 0;
//     }


    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();

     findWays(1, 100, 2, 0,new ArrayList<>(),ans);
        System.out.println(ans);
    }
}
