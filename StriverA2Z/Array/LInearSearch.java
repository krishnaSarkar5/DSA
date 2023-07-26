public class LInearSearch {
    
    static int find(int[] arr , int value){

        int result = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                result=i;
                break;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};

        System.out.println(find(arr, 3));

    }
}
