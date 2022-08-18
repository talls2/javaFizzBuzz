package executor;


public class AutoFizzBuzz {
    public static void autoexec(){
        for (int t = 1; t <= 100; t++){
            if(t % 3 == 0 && t % 5 == 0){
                System.out.println("fizzbuzz");
            }
            if (t % 3 == 0){
                System.out.println("fizz");
            }
            if (t % 5 == 0){
                System.out.println("Buzz");
            }
            if (t % 3 != 0 && t % 5 != 0){
                System.out.println(t);
            }
        }
        System.out.println("Tests from 1 to 100 finished.");
    }
}
