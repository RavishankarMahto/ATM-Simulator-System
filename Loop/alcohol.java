package Loop;

import java.util.Scanner;

public class alcohol {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        do{
            System.out.println("Your age are " + age + " You can take alcohol");

            System.out.println("Enter your age --> ");
            age = sc.nextInt();
        }while(age >= 18);
    }
}
