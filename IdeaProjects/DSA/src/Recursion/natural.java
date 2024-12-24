package Recursion;

public class natural {   // print sum of first n natural number
    public static int sumOfNat(int n){
        // Base case
        if(n == 0){
            return 1;
        }
        int Nubnmr = sumOfNat(n - 1);
        int Nub = n + Nubnmr;
        return Nub;
    }

    public static void main(String[] args) {
        System.out.println(sumOfNat(5));
    }
}
