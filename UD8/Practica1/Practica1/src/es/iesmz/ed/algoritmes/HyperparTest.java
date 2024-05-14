package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HyperparTest {
    @Test
    void test_CheckFalse(){
        Hyperpar num = new Hyperpar(1234567);
        assertFalse(num.esHyperPar());
    }

    @Test
    void test_CheckTrue(){
        Hyperpar num = new Hyperpar(846204284);
        assertTrue(num.esHyperPar());
    }

    @Test
    void test_CheckTrue2(){
        Hyperpar num = new Hyperpar(4000000);
        assertTrue(num.esHyperPar());
    }
}