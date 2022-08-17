package executor;

import java.util.Scanner;

public class FizzBuzz {
    public static void exec(){
        Scanner input = new Scanner(System.in);
        String n;
        System.out.println("Enter a integer number");
        int t = input.nextInt();

        if(t % 3 == 0 && t % 5 == 0){
            n = "fizzbuzz";
            System.out.println(n);
            exec();
        }
        if (t % 3 == 0 && t % 5 != 0){
            n = "fizz";
            System.out.println(n);
            exec();
        }
        if (t % 3 != 0 && t % 5 == 0){
            n = "Buzz";
            System.out.println(n);
            exec();
        }
        if (t % 3 != 0 && t % 5 != 0){
            System.out.println(t);
            exec();
        }
    }

}
