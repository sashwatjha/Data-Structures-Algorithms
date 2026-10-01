//Question: How to calculate power of a number using recursion
/*

sample input: x = 2, n = 3
2 * (2^2)
2 * 2 * (2^1)
2 * 2 * 2 = 8

---

General form = x * power(x, n-1)
Base condition = if(n==0) return 1
unintentional case = if(n<0) return 0

---

DRY RUN

power(2, 3) = 2 * power(2, 2)
power(2, 2) = 2 * power(2, 1)
power(2, 1) = 2 * power(2, 0)
power(2, 0) = 1
power(2, 1) = 2 * 1
power(2, 2) = 2 * 2
power(2, 3) = 2 * 4

output : 8

*/
public class Q7_PowerOfANumber{

    public static void main(String[] args){

        Q7_PowerOfANumber run = new Q7_PowerOfANumber();
        System.out.println(run.power(2, -2));
    }

    public int power(int x, int n){

        if(n<0) return 0; //if input is invalid

        else if(n==0) return 1; //base case

        else return x * power(x, n-1);
    }
}