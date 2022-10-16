public class RopeCuttingIterative {


    

    public static int cutRope(int len, int [] options) {
 
        int maxCut = 0;
        int cut, extra;



        for(int i=0;i<options.length;i++){
            cut = len / options[i];
            extra = len %  options[i];
            if (cut != 0 && extra != 0) {
                cut = cut + cutRope(extra, options);
                System.out.println("+++ cut: "+cut);
            } else if (cut == 0) {
                maxCut = 0;
                cut = 0;
                extra = 0;
            }
    
            if (maxCut < cut)
                maxCut = cut;
        }




        // cut = len / a;
        // extra = len % a;
        // if (cut != 0 && extra != 0) {
        //     cut = cut + cutRope(extra, a, b, c);
        // } else if (cut == 0) {
        //     maxCut = 0;
        //     cut = 0;
        //     extra = 0;
        // }

        // if (maxCut < cut)
        //     maxCut = cut;

        // cut = len / b;
        // extra = len % b;
        // if (cut != 0 && extra != 0) {
        //     cut = cut + cutRope(extra, a, b, c);
        // } else if (cut == 0) {
        //     maxCut = 0;
        //     cut = 0;
        //     extra = 0;
        // }

        // if (maxCut < cut)
        //     maxCut = cut;

        // cut = len / c;
        // extra = len % c;
        // if (cut != 0 && extra != 0) {
        //     cut = cut + cutRope(extra, a, b, c);
        // } else if (cut == 0) {
        //     maxCut = 0;
        //     cut = 0;
        //     extra = 0;
        // }
        // if (maxCut < cut)
        //     maxCut = cut;

        return maxCut == 0 ? -1 : maxCut;
    }

    public static void main(String[] args) {
        int[] options = {2,2,2};
        System.out.println("++++++ max cut : " + cutRope(9, options));
    }
}
