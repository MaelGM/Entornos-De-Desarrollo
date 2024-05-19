package es.iesmz.ed.algoritmes;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnyTest {
    @Test
    void test1(){
        Any x = new Any(1425);
        assertEquals(4, x.digitsDiferents());
    }

}