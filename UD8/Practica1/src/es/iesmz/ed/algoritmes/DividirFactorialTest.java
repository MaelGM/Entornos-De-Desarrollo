package es.iesmz.ed.algoritmes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DividirFactorialTest {
    @ParameterizedTest
    @CsvSource({
            "5, 3, 20",
            "10, 7, 720",
            "3, 5, 0.05",
            "7, 7, 1"
    })
    void test1(String num, String den, String expected){
        DividirFactorial divFac = new DividirFactorial(Integer.parseInt(num), Integer.parseInt(den));
        assertEquals(Float.parseFloat(expected), divFac.divisio(), 0.001);
    }

}