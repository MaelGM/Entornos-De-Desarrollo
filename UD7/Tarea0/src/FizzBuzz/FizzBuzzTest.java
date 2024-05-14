package FizzBuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 2",
            "Fizz, 3",
            "4, 4",
            "Buzz, 5",
            "Fizz, 6",
            "7, 7",
            "8, 8",
            "Fizz, 9",
            "Buzz, 10",
            "11, 11",
            "Fizz, 12",
            "13, 13",
            "14, 14",
            "FizzBuzz, 15",

    })
    public void testFizzBuzz(String output, String input){
        assertEquals(output, FizzBuzz.juego(Integer.parseInt(input)));
    }
}