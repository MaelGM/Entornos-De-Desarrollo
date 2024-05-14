package calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTDDTest {
    @Test
    public void test_InputVacio(){
        assertEquals(0, OperacionesTDD.suma(""));
    }

    @Test
    public void test_Calcula1(){
        assertEquals(1, OperacionesTDD.suma("1"));
    }

    @Test
    public void test_CalculaSuma(){
        assertEquals(3, OperacionesTDD.suma("1,2"));
    }

    @Test
    public void test_CalculaSumaMultiple(){
        assertEquals(4, OperacionesTDD.suma("1,1,2"));
    }

    @Test
    public void test_RevisaFalloComa(){
        assertEquals(-1, OperacionesTDD.suma("1,2,"));
    }

    @Test
    public void test_RevisaFalloNegativo(){
        assertEquals(-1, OperacionesTDD.suma("1,2,-2"));
    }

    @Test
    public void test_RevisaNumeroMaximo(){
        assertEquals(5, OperacionesTDD.suma("5,1002"));
    }

}