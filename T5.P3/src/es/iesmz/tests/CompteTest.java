package es.iesmz.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompteTest {

    @BeforeEach
    public void mostrarMensaje(){
        System.out.println("EXECUTE PROVA");
    }


    @Test
    void generaIBAN() {

        Compte c1 = new Compte();

        String resultadoReal = c1.generaIBAN("0030","2053","09","1234567895");
        String resultadoReal1 =c1.generaIBAN("0049","2352","08","2414205416");
        String resultadoReal2 =c1.generaIBAN("2085","2066","62","3456789011");
        String resultadoReal3 =c1.generaIBAN("2085","2066","62","3456AE9011");
        String resultadoReal4 =c1.generaIBAN("208","2066","62","3456789011");
        String resultadoReal5 =c1.generaIBAN("2080","20A6","62","3456789011");
        String resultadoReal6 =c1.generaIBAN("2080","2086","6","3456789011");
        String resultadoReal7 =c1.generaIBAN("2080","2086","63","345678911");

        assertEquals(resultadoReal,"ES7100302053091234567895");
        assertEquals(resultadoReal1,"ES1000492352082414205416");
        assertEquals(resultadoReal2,"ES1720852066623456789011");
        assertNull(resultadoReal3);
        assertNull(resultadoReal4);
        assertNull(resultadoReal5);
        assertNull(resultadoReal6);
        assertNull(resultadoReal7);
    }

    @Test
    void compruebaIBAN() {
        Compte c2 = new Compte();

        Boolean resultadoReal = c2.compruebaIBAN("ES6621000418401234567891");
        Boolean resultadoReal1 =c2.compruebaIBAN("ES6000491500051234567892");
        Boolean resultadoReal2 =c2.compruebaIBAN("ES9420805801101234567891");
        Boolean resultadoReal3 =c2.compruebaIBAN("ES7600246912501234567891");
        Boolean resultadoReal4 =c2.compruebaIBAN("ES4721000418401234567891");
        Boolean resultadoReal5 =c2.compruebaIBAN("ES8200491500051234567892");

        assertEquals(resultadoReal,true);
        assertEquals(resultadoReal1,true);
        assertEquals(resultadoReal2,true);
        assertEquals(resultadoReal3,false);
        assertEquals(resultadoReal4,false);
        assertEquals(resultadoReal5,false);

    }
}