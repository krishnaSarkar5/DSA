public class FindMissingNumber {
  public static  int missingNumber(int array[], int n) {
        // Your Code Here
        int i;
        int total = 0;
        int temp = 0;
        for( i=1;i<n;i++){
            temp=temp^array[i-1];
            total=total^i;
        }
        
        return total^temp^i;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,5};
        System.out.println("   mhvcas+ "+missingNumber(arr, 5));
    }
}
