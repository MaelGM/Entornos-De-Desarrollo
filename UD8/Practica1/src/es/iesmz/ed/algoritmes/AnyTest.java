package es.iesmz.ed.algoritmes;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnyTest {
    @Test
    void test_NumerosDiferentes(){
        Any x = new Any(1425);
        assertEquals(4, x.digitsDiferents());
    }

    @Test
    void test_NumeroRepetido(){
        Any x = new Any(1111);
        assertEquals(1, x.digitsDiferents());
    }

    @Test
    void test_NumerosMezclados(){
        Any x = new Any(152844599);
        assertEquals(6, x.digitsDiferents());
    }

}