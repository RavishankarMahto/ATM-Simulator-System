package Function;

import java.util.Scanner;

public class sum {
    public static void calculateSum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum is :"+sum);
        sc.close(); //close the scanner always
    }
    public static void main(String[] args){
        calculateSum();
    }
}

// public static void calculateSum(){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int sum = a + b;
//     System.out.println("Sum is :"+sum);
// }
// public static void main(String[] args){
//     calculateSum();
// }