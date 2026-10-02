//Question: How to find GCD (Greatest Common Divisor) of two number
/*
Largest positive number that divides the numbers without a reminder
Example:
gcd(8, 12) = 4
8 = 2 * 2 * 2
12 = 2 * 2 * 3

gcd(a, 0) = a

General Form: gcd(a, b) -> gcd(a, a%b) , given : a<b
base case: gcd(a, 0) = a

---

DRY RUN

gcd(12, 18) -> gcd(12, 18%12)
gcd(12, 6) -> gcd(6, 12%6)
gcd(6, 0) -> 6

output : 6

*/

public class Q8_GCD {

    public static void main(String[] args){

        Q8_GCD run = new Q8_GCD();
        System.out.println(run.gcd(12, 18));
    }

    public int gcd(int a, int b){

        if(b == 0) return a;

        else return gcd(b, b%a);
    }
}
