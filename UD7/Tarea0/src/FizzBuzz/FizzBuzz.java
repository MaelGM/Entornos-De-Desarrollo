package FizzBuzz;

public class FizzBuzz {
    public static String juego(int num){
        String output = String.valueOf(num);
        if (num % 3 == 0) output = "Fizz";
        if (num % 5 == 0) output = "Buzz";
        if (num % 3 == 0 && num % 5 == 0) output = "FizzBuzz";
        return output;
    }
}
