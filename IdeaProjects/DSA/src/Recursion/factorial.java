package Recursion;

public class factorial {      // find factorial using recursive function
    public static int fact(int n){
        // base case
        if(n == 1){
            return 1;
        }
        int fnmr = fact(n - 1);
        int fn = n * fnmr;
        return fn;
    }

    public static void main(String[] args) {
        System.out.println(fact(10));
    }
}
