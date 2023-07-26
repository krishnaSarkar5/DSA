public class FindMissingInSortedARray {
    
    public static int find(int[] arr){
        
        int count =1;
        int result=0;

        if(arr.length==1){
            return arr[0];
        }

      
            int i;
        for( i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1] && count==1){
                count++;
            }else if(arr[i]!=arr[i-1] && count==2){
                count=1;
            }else{
                break;
            }
        }

    

        return arr[i-1];

    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3};
        System.out.println(find(arr));
    }
}
