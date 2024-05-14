import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZappingTest {
    @Test
    public void test_MismosCanales(){
        assertEquals(0, Zapping.cambiarCanal(1,1));
    }

    @Test
    public void test_RestarCanal(){
        assertEquals(1, Zapping.cambiarCanal(2,1));
    }

    @Test
    public void test_SumarCanal(){
        assertEquals(20, Zapping.cambiarCanal(10,30));
    }

    @Test
    public void test_SobrepasarCanal1(){
        assertEquals(2, Zapping.cambiarCanal(2,99));
    }

    @Test
    public void test_CambiarCanalEficiente(){
        assertEquals(41, Zapping.cambiarCanal(5,63));
    }

    @Test
    public void test_CambiarCanalDeLaMismaManera(){
        assertEquals(41, Zapping.cambiarCanal(63,5));
    }

    @Test
    public void test_MinimizarCambiosDeCanal(){
        assertEquals(49, Zapping.cambiarCanal(1,51));
    }
}