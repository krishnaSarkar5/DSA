

public class Leader {
    

    // time complexity theta(n)
    public static void findLeaders(int[] arr ){

        int currentLeader = arr[arr.length-1];
        System.out.print(currentLeader+" ");
        for(int i=arr.length-1;i>=0;i--){
            if(currentLeader<arr[i]){
                currentLeader = arr[i];
                System.out.print(currentLeader+" ");
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {7,10,4,3,6,5,2};
        findLeaders(arr);
    }
}
