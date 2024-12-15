package Function;

import java.util.Scanner;

public class product {
    public static int productOfNum(int num1, int num2){
        int product = num1 * num2;
        System.out.println("Product is :" + product );
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        productOfNum(a,b);
    }
}
