import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordVerifyTest {

    @Test
    void test__false(){
        EsContrasenyaCorrecta msgTest1 = PasswordVerify.verify("");
        assertFalse(msgTest1.isError());
        assertEquals("""
                La contrasenya ha de tenir almenys 8 caràcters
                La contrasenya ha de contenir almenys 2 números
                La contrasenya ha de contenir almenys una lletra majúscula
                La contrasenya ha de contenir almenys un caràcter especial""", msgTest1.getMsgError());
    }

    @Test
    void test_hola_false(){
        EsContrasenyaCorrecta msgTest2 = PasswordVerify.verify("hola");
        assertFalse(msgTest2.isError());
        assertEquals("""
                La contrasenya ha de tenir almenys 8 caràcters
                La contrasenya ha de contenir almenys 2 números
                La contrasenya ha de contenir almenys una lletra majúscula
                La contrasenya ha de contenir almenys un caràcter especial""", msgTest2.getMsgError());
    }

    @Test
    void test_holacaracola_false(){
        EsContrasenyaCorrecta msgTest2 = PasswordVerify.verify("holacaracola");
        assertFalse(msgTest2.isError());
        assertEquals("""
                La contrasenya ha de contenir almenys 2 números
                La contrasenya ha de contenir almenys una lletra majúscula
                La contrasenya ha de contenir almenys un caràcter especial""", msgTest2.getMsgError());
    }

    @Test
    void test_hola12_false(){
        EsContrasenyaCorrecta msgTest2 = PasswordVerify.verify("hola12");
        assertFalse(msgTest2.isError());
        assertEquals("""
                La contrasenya ha de tenir almenys 8 caràcters
                La contrasenya ha de contenir almenys una lletra majúscula
                La contrasenya ha de contenir almenys un caràcter especial""", msgTest2.getMsgError());
    }

    @Test
    void test_holA_false(){
        EsContrasenyaCorrecta msgTest2 = PasswordVerify.verify("holA");
        assertFalse(msgTest2.isError());
        assertEquals("""
                La contrasenya ha de tenir almenys 8 caràcters
                La contrasenya ha de contenir almenys 2 números
                La contrasenya ha de contenir almenys un caràcter especial""", msgTest2.getMsgError());
    }

    @Test
    void test_11_false(){
        EsContrasenyaCorrecta msgTest2 = PasswordVerify.verify("hola!");
        assertFalse(msgTest2.isError());
        assertEquals("""
                La contrasenya ha de tenir almenys 8 caràcters
                La contrasenya ha de contenir almenys 2 números
                La contrasenya ha de contenir almenys una lletra majúscula""", msgTest2.getMsgError());
    }

    @Test
    void test_12_false(){
        EsContrasenyaCorrecta msgTest2 = PasswordVerify.verify("holA!");
        assertFalse(msgTest2.isError());
        assertEquals("""
                La contrasenya ha de tenir almenys 8 caràcters
                La contrasenya ha de contenir almenys 2 números""", msgTest2.getMsgError());
    }

    @Test
    void test_13_false(){
        EsContrasenyaCorrecta msgTest2 = PasswordVerify.verify("hola12!");
        assertFalse(msgTest2.isError());
        assertEquals("""
                La contrasenya ha de tenir almenys 8 caràcters
                La contrasenya ha de contenir almenys una lletra majúscula""", msgTest2.getMsgError());
    }

    @Test
    void test_hola12A_false(){
        EsContrasenyaCorrecta msgTest2 = PasswordVerify.verify("hola12A");
        assertFalse(msgTest2.isError());
        assertEquals("""
                La contrasenya ha de tenir almenys 8 caràcters
                La contrasenya ha de contenir almenys un caràcter especial""", msgTest2.getMsgError());
    }

    @Test
    void test_holacaracola12_false(){
        EsContrasenyaCorrecta msgTest2 = PasswordVerify.verify("holacaracola12");
        assertFalse(msgTest2.isError());
        assertEquals("""
                La contrasenya ha de contenir almenys una lletra majúscula
                La contrasenya ha de contenir almenys un caràcter especial""", msgTest2.getMsgError());
    }

    @Test
    void test_holacaracolaEspecial_false(){
        EsContrasenyaCorrecta msgTest2 = PasswordVerify.verify("holacaracola!");
        assertFalse(msgTest2.isError());
        assertEquals("""
                La contrasenya ha de contenir almenys 2 números
                La contrasenya ha de contenir almenys una lletra majúscula""", msgTest2.getMsgError());
    }

    @Test
    void test_holacaracolA_false(){
        EsContrasenyaCorrecta msgTest2 = PasswordVerify.verify("holacaracolA");
        assertFalse(msgTest2.isError());
        assertEquals("""
                La contrasenya ha de contenir almenys 2 números
                La contrasenya ha de contenir almenys un caràcter especial""", msgTest2.getMsgError());
    }

    @Test
    void test_ho12AEspecial_false(){
        EsContrasenyaCorrecta msgTest2 = PasswordVerify.verify("ho12A!");
        assertFalse(msgTest2.isError());
        assertEquals("""
                La contrasenya ha de tenir almenys 8 caràcters""", msgTest2.getMsgError());
    }

    @Test
    void test_holacaracola12Especial_false(){
        EsContrasenyaCorrecta msgTest2 = PasswordVerify.verify("holacaracola12!");
        assertFalse(msgTest2.isError());
        assertEquals("""
                La contrasenya ha de contenir almenys una lletra majúscula""", msgTest2.getMsgError());
    }

    @Test
    void test_holacaracola12A_false(){
        EsContrasenyaCorrecta msgTest2 = PasswordVerify.verify("holacaracola12A");
        assertFalse(msgTest2.isError());
        assertEquals("""
                La contrasenya ha de contenir almenys un caràcter especial""", msgTest2.getMsgError());
    }

    @Test
    void test_holacaracola12AEspecial_false(){
        EsContrasenyaCorrecta msgTest2 = PasswordVerify.verify("holacaracola12A!");
        assertTrue(msgTest2.isError());
        assertEquals("", msgTest2.getMsgError());
    }

    @Test
    void test_contrasenya_false(){
        EsContrasenyaCorrecta msgTest2 = PasswordVerify.verify("#P4blit0cl4v0uncl4vit0#");
        assertTrue(msgTest2.isError());
        assertEquals("", msgTest2.getMsgError());
    }

}