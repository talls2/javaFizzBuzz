package executor;


public class AutoFizzBuzz {
    public static void autoexec(){
        String n;
        for (int t = 1; t <= 100; t++){
            if(t % 3 == 0 && t % 5 == 0){
                n = "fizzbuzz";
                System.out.println(n);
            }
            if (t % 3 == 0){
                n = "fizz";
                System.out.println(n);
            }
            if (t % 5 == 0){
                n = "Buzz";
                System.out.println(n);
            }
            if (t % 3 != 0 && t % 5 != 0){
                System.out.println(t);
            }
        }
        System.out.println("Tests from 1 to 100 finished.");
    }
}
