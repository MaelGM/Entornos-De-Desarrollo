package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HyperparTest {
    @Test
    void test1(){
        Hyperpar num = new Hyperpar(1234567);
        assertFalse(num.esHyperPar());
    }

}