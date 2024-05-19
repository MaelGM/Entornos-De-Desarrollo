package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividirFactorialTest {
    @Test
    void test1(){
        DividirFactorial divFac = new DividirFactorial(5, 3);
        assertEquals(20, divFac.divisio(), 0.001);
    }

}