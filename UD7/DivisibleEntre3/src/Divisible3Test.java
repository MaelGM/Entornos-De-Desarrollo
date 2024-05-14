import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Divisible3Test {
    @Test
    public void test_Numero_12_Divisible(){
        assertEquals("SI", Divisible3.revisarDivision(2));
    }

    @Test
    public void test_Numero_123456_Divisible(){
        assertEquals("SI", Divisible3.revisarDivision(6));
    }

    @Test
    public void test_Numero_1234_NoDivisible(){
        assertEquals("NO", Divisible3.revisarDivision(4));
    }

    @Test
    public void test_Numero_12345_Divisible(){
        assertEquals("SI", Divisible3.revisarDivision(5));
    }

    @Test
    public void test_Numero_1_NoDivisible(){
        assertEquals("NO", Divisible3.revisarDivision(1));
    }

    @Test
    public void test_Numero_12345678_Divisible(){
        assertEquals("SI", Divisible3.revisarDivision(8));
    }

    @Test
    public void test_Numero_1234567_NoDivisible(){
        assertEquals("NO", Divisible3.revisarDivision(7));
    }
}