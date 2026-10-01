/*
Question: How to find the sum of digits of a positive integer number using recursion

Let, num = 413
4+1+3 = 8
output = 8

General Form : num%10 + sumOfDigits(num/10)

Base Case: if(num < 10) return num%10;
unintentional case: if(n<0) return 0;
---

DRY RUN

SumOfDigits(413) = 3 + sumOfDigits(41)

sumOfDigits(41) = 1 + sumOfDigits(4)

sumOFDigits(4) = 4

sumOfDigits(41) = 1 + 4 = 5

sumOfDigits(413) = 3 + 5 = 8

output: 8

---

Time Complexity

No of recursive call in method = 1

time complexity= O(no. of digits)

*/

public class Q6_SumOfDigits{

    public static void main(String args[]){

        Q6_SumOfDigits run = new Q6_SumOfDigits();

        int num = 0;
        System.out.println(run.sumOfDigits(num));
    }

    public int sumOfDigits(int num){

        if(num<=0) return 0;

        else if(num < 10) return num%10;

        else{

            return num%10 + sumOfDigits(num/10);
        }
    }
}