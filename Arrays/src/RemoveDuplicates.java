import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args){

        int[] arr = new int[]{-3,-1,0,0,0,3,3};

        Set<Integer> set = new HashSet<>();

        for(int i : arr) set.add(i);

        System.out.println(set.toString());

        int j = 0;
        for(int i : set){

            arr[j++] = i;
        }

        System.out.println(Arrays.toString(arr));
    }
}
