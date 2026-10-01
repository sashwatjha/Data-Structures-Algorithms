//Q: How to find the sum of elements in an Array using recursion

/*
DRY RUN

Let, arr = {11, 12, 13} n = 3

General form : sumOfDigits(arr, n) = arr[n-1] + sumOfDigits(arr, n-1)

Base case: if(n==1) return arr[n-1]
unintentional case: if(n==0) return 0;

sumOfDigits(arr, 3) = 13 + sumOfDigits(arr, 2)

sumOfDigits(arr, 2) = 12 + sumOfDigits(arr, 1)

sumOfDigits(arr, 1) = 11

sumOfDigits(arr, 2) = 12 + 11 = 23

sumOfDigits(arr, 3) =  13 + 23 = 36

output: 36

----

Time Complexity

No. of recursive call = 1 * n
Workdone in each recursive call = O(1)

total time complexity = O(n)
*/

public class Q5_SumOfArray {

    public static void main(String args[]){

        Q5_SumOfArray run = new Q5_SumOfArray();

        int[] arr = {11, 12, 13};
        System.out.println(run.sumOfArray(arr, arr.length));
    }

    public int sumOfArray(int[] arr, int n){

        //edge case when arr empty
        if(n == 0) return 0;

        //edge case when only one digit
        else if(n==1) return arr[n-1];

        else return arr[n-1] + sumOfArray(arr, n-1);
    }
}