public class TowerOfHanoi {
    

    static void move(int n ,String source,String destination,String help){

        if(n==0){
            // System.out.println("move disc "+ n +" from "+source+" to "+destination);
            return;
        }

        move(n-1, source, help, destination);
        System.out.println("move disc "+ n +" from "+source+" to "+destination);
        move(n-1, help, destination, source);

    }

    public static void main(String[] args) {
        move(4, "A", "C", "B");
    }

}
