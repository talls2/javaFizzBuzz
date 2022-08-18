package executor;

import java.util.Scanner;

public class FizzBuzz {
    public static void exec(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer number to play");
        int t = input.nextInt();

        if(t % 3 == 0 && t % 5 == 0){
            System.out.println("fizzbuzz");
            exec();
        }
        if (t % 3 == 0 && t % 5 != 0){
            System.out.println("fizz");
            exec();
        }
        if (t % 3 != 0 && t % 5 == 0){
            System.out.println("Buzz");
            exec();
        }
        if (t % 3 != 0 && t % 5 != 0){
            System.out.println(t);
            exec();
        }
    }

}
