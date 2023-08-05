import java.lang.reflect.Array;
import java.util.Arrays;

public class MergSortedArray {
    
    static void merge(int[] arr1,int[] arr2){

        int i=0,j=0;
        int n1 = arr1.length;
        int n2 = arr2.length;

        while(i<n2){
            j=0;
            while(j<n1){

                if(arr1[j]>arr2[i]){
                    int temp = arr1[j];
                    arr1[j]=arr2[i];
                    arr2[i]=temp;
                }
                j++;
            }
            i++;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println("arr1 : "+Arrays.toString(arr1) );
        System.out.println("arr2 : "+Arrays.toString(arr2) );

    }


    static void mergeLeetcode(int[] nums1,int m ,int[] nums2,int n){


        int i=m-1,j=n-1,k=nums1.length-1;

        

        if(m==0){
            for(int l=0;l<nums1.length;l++){
                nums1[l]=nums2[l];
            }
        }else{

                while(i>=0 && j>=0){

                    if(nums1[i]>=nums2[j]){
                        nums1[k] = nums1[i];
                        i--;
                    }else{
                        nums1[k] = nums2[j];
                        j--;
                    }
                    k--;

                }

               while(i>=0){
                nums1[k]=nums1[i];
                i--;
                k--;
               }

               while(j>=0){
                nums1[k]=nums2[j];
                j--;
                k--;
               }



        }
        

        System.out.println(Arrays.toString(nums1));

    }

    public static void main(String[] args) {
        
        int[] arr1 = {2,0};
        int m = 1 ,n=1;
        int[] arr2 = {1};
        // merge(arr1, arr2);
        mergeLeetcode(arr1,m, arr2,n);
    }
}
