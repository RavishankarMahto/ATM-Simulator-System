package Loop;

import java.util.Scanner;
public class doWhile1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // randomly takes users input and print same output
        // if input are divisible by 10 then automatically exit from program.
        do{
            System.out.println("Enter your number: ");
            int n = sc.nextInt();
            if(n % 10 == 0) {
                break;
            }
            System.out.println(n);
        }while(true);
    }
}

