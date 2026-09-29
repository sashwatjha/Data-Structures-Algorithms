public class Q1_RussianDoll {

    public static void main(String[] args){

        openRussianDoll(10);
    }

    static void openRussianDoll(int n){

        if(n<=1){
            System.out.println("All Dolls are open !!");
        }
        else{

            System.out.println("Doll size ["+n+"] opened !!");
            openRussianDoll(n-1);
        }
    }
}
