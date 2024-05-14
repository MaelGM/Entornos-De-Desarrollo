package es.iesmz.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Vocales2Test {
    @ParameterizedTest
    @CsvSource({
            "vrflw, Overflow",
            "lbndgs, Albondigas",
            "tstCntrVcls, testContarVocales"
    })
    public void pruebaVocales_enCodigo(String sinV, String conV) {
        assertEquals(sinV, Vocales.sinvocales(conV));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/prueba.csv")
    public void pruebaVocales_enFile(String sinV, String conV) {
        assertEquals(sinV, Vocales.sinvocales(conV));
    }


}