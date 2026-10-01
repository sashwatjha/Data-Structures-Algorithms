//Dry Run
//case: fib(3)
// fib(3) = fib(2) + fib(1)

// fib(2) = fib(1) + fib(0)

// fib(2) = 1 + 0 = 1

// fib(3) = 1 + 1 = 2

//output: 2

//Recursion Tree
//fib(3)
//fib(2) fib(1)

//fib(2)
//fib(1) fib(0)

//base case:
//fib(1) = 1
//fib(0) = 0

public class Q3_Fibonacci {

    public static void main(String[] agrs){

        Q3_Fibonacci run = new Q3_Fibonacci();

        int n = 4;

        System.out.println(run.fib(n));
    }

    //n = 0 based indexing
    private int fib(int n){

        if(n<0) return -1;

        else if(n == 0 || n == 1) return n;

        else return fib(n-1)+fib(n-2);
    }
}
