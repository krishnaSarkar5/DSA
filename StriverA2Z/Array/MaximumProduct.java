public class MaximumProduct {
    

    static int maxProduct(int[] arr){

        int p =1 ,s=1,m=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            p *= arr[i];
            s *= arr[arr.length-1-i];

            if(p>m) m=p;

            if(s>m) m=s;

            if(arr[i]==0) p = 1;
            if(arr[arr.length-1-i]==0) s = 1;
        }

        return m;

    }

    public static void main(String[] args) {

        int[] arr = {1,2,-3,0,-4,-5};
        System.out.println(maxProduct(arr));
        
    }
}
