package Recursion;

public class NumberInc {  //print number in increasing order
    public static void printInc(int n){
        if(n == 10){       // this is the not good way
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printInc(n + 1);
    }
    public static void main(String args[]){
        printInc(1);
    }
}