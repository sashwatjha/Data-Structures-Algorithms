/*DRY RUN
sample input: arr[11, 5, 17] n=3

findLargest(arr, 3) = max(17, findLargest(arr, 2))

findLargest(arr, 2) = max(5, findLargest(arr, 1))

findLargest(arr, 1) =  11

findLargest(arr, 2)  = max(5, 11) = 11

findLargest(arr, 3) = max(17, 11) = 17

output: 17
*/


public class Q4_FindLargest {

    public static void main(String[] args){

        Q4_FindLargest run = new Q4_FindLargest();

        int[] arr = {11, 4, 12, 7};
        System.out.println(run.findLargestInArray(arr, arr.length));
    }

    public int findLargestInArray(int[] arr, int n){

        if(n == 0) return -1; //unintentional case

        else if(n==1) return arr[n-1]; //Base case

        else{

            return Math.max(arr[n-1], findLargestInArray(arr, n-1));
        }
    }
}
