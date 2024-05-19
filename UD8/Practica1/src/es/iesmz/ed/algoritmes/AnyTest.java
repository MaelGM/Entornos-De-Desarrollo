package es.iesmz.ed.algoritmes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class AnyTest {

    @ParameterizedTest
    @CsvSource({
            "1425, 4",
            "1115, 2",
            "152844599, 6",
            "1542847621587, 7"
    })
    void test_NumerosDiferentes(String number, String expected){
        Any x = new Any(Long.parseLong(number));
        assertEquals(Integer.parseInt(expected), x.digitsDiferents());
    }

}