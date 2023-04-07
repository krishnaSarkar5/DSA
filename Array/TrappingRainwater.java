

public class TrappingRainwater {

    public static int findTrapperWater(int[] arr){

        int firstBar=arr[0], gap=0 , substactedVolume = 0, trappedwater=0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]<firstBar){
                gap++;
                substactedVolume=substactedVolume+arr[i];
            }

            else if(arr[i]>=firstBar && gap!=0){
                trappedwater=trappedwater+((firstBar*gap)-substactedVolume);
                firstBar=arr[i];
                gap=0;
            }
            else if(arr[i]>firstBar && gap==0){
                firstBar=arr[i];
            }
        }

        return trappedwater;
    }

    public static void main(String[] args) {
        int [] arr = {3,4,2};
        System.out.println(findTrapperWater(arr));
    }
}
