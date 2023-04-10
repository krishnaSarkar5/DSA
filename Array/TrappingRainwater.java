

public class TrappingRainwater {

    // public static int findTrapperWater(int[] arr){

    //     int firstBar=arr[0], gap=0 , substactedVolume = 0, trappedwater=0,isInc=0;

    //     for(int i=1;i<arr.length;i++){

    //         if(arr[i]>arr[i-1]){
    //             isInc=1;
    //         }else if(arr[i]<arr[i-1]){
    //             isInc=-1;
    //         }else{
    //             isInc=0;
    //         }



    //         if(arr[i]<firstBar && isInc<=0){
    //             gap++;
    //             substactedVolume=substactedVolume+arr[i];
    //         }
    //         else if(arr[i]<firstBar && isInc>0){
    //             gap++;
    //             substactedVolume=substactedVolume+arr[i];
    //         }

    //         else if(arr[i]>=firstBar && gap!=0){
    //             trappedwater=trappedwater+((firstBar*gap)-substactedVolume);
    //             firstBar=arr[i];
    //             gap=0;
    //             substactedVolume=0;
    //         }
    //         else if(arr[i]>firstBar && gap==0){
    //             firstBar=arr[i];
    //         }
    //     }

    //     return trappedwater;
    // }

    public static int findTrapperWater(int[] arr){

        int trappedwater = 0;

        int [] lMax = new int[arr.length];
        int [] rMax = new int[arr.length];

        lMax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
           lMax[i]= max(arr[i], lMax[i-1]);
        }

        rMax[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
           rMax[i]= max(arr[i], rMax[i+1]);
        }

        for(int i=0;i<arr.length;i++){
            trappedwater=trappedwater+min(lMax[i], rMax[i])-arr[i];
        }


        return trappedwater;

    }


    public static int max(int a , int b){
        return b>a? b:a;
    }

    public static int min(int a , int b){
        return b>a? a:b;
    }

    public static void main(String[] args) {
        int [] arr = {3,2,1,2};
        System.out.println(findTrapperWater(arr));
    }
}
