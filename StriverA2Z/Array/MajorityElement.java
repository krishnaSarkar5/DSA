import java.util.*;

public class MajorityElement{


    static int findMajorityElementBruteForce(int[] arr){

        // time complexity O(n2) space complexity O(1)

        int target = arr.length/2;

        int result=-1;

        for(int i=0;i<arr.length;i++){

            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }

            }
            if(count>target){
                result=arr[i];
                break;
            }
        }
        return result;

    }

    static int  findMajorityElementBetterWithHashing(int[] arr){
         // time complexity O(nlogn) space complexity O(n)
        
        Map<Integer,Integer> map = new HashMap();

        int target = arr.length/2;

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                 map.put(arr[i],+1);
            }
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){

            if(entry.getValue()>target){
                return entry.getKey();
            }
        }
        return -1;
    }

    static int findMajorityElementOptimal(int[] arr){

        int count= 0;
        int element = -1;

        for(int i=0;i<arr.length;i++){

            if(count==0){
                element=arr[i];
                count=1;
            }else if(arr[i]==element){
                count++;
            }else if(arr[i] != element){
                count--;
            }

        }
        return element;

    }


    public static void main(String[] args) {
        
        int[] arr = {3,2,3};

        System.out.println(findMajorityElementBruteForce(arr));
        System.out.println(findMajorityElementBetterWithHashing(arr));
        System.out.println(findMajorityElementOptimal(arr));

    }
}