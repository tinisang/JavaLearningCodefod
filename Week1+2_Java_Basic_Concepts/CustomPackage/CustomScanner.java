package CustomPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomScanner {
    static{
        System.out.println("Hi");

    };

    public static void scannerProgram(){
        Scanner sc = new Scanner(System.in);
        try {

            int age = sc.nextInt();
            System.out.println("So your age is: " + age);

        } catch (InputMismatchException e){
            System.out.println("Invalid value, re-enter your age: ");

            scannerProgram();
        };

        sc.close();

    };
    public static  void mainScanner() {

        System.out.println("Enter your age:");

        scannerProgram();


    }
}
