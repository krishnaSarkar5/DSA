
// find the occurance of a sorted array

public class Frequency {

 public static void findFrequency(int[] arr){
        int i = 1;
        int freq = 1;
        while(i<arr.length){
            while(i<arr.length && arr[i]==arr[i-1]){
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+ " has frquency "+freq);
            freq=1;
            i++;
        }

        if(arr[arr.length-1]!=arr[arr.length-2]){
            System.out.println(arr[i-1]+ " has frquency "+1);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,5,5};
       findFrequency(arr);
    }

}
