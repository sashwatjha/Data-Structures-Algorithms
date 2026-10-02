public class Q9_FindBinary {

    public static void main(String[] args){

        Q9_FindBinary run = new Q9_FindBinary();
        System.out.println(run.binary(10));
    }

    public String binary(int n){

        if(n==0) return "";

        StringBuilder out = new StringBuilder();

        return out.append(binary(n/2)).append(n%2).toString();
    }
}
