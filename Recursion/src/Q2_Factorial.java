public class Q2_Factorial {

    public static void main(String[] agrs){

        Q2_Factorial run = new Q2_Factorial();

        int n = 4;
        System.out.println(run.factorial(n));
    }

    private int factorial(int n){

        if(n<=1) return 1;

        else return n*factorial(n-1);
    }
}
