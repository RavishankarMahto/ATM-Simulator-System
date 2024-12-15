package Loop;

import java.util.Scanner;

// take non-negative input from user,
// if user enter negative value, exit to program and calculate the total sum previously they entered.

public class javaBasic1 {
    public static void main(String[] args){
        int sum = 0;
        boolean keepGoing = true;
        while(keepGoing){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number (negative number to exit) --> ");
            int n = sc.nextInt();
            if(n < 0) {
                keepGoing = false;
            }else
            {
                sum = sum + n;
            }
        }
        System.out.println("Sum of numbers is: "+sum);
    }
}
