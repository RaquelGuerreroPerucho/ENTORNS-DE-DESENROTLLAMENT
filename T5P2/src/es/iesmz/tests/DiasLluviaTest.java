package es.iesmz.tests;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiasLluviaTest {



    @BeforeEach
    public void mostrarMensaje(){
        System.out.println("EXECUTE PROVA");
    }

    @Test
    void registroDia() {

        DiasLluvia d1= new DiasLluvia();

        boolean resultadoReal =d1.registroDia(19,3,true);
        boolean resultadoReal1 =d1.registroDia(2,3,false);
        boolean resultadoReal2 =d1.registroDia(3,19,false);

        assertEquals(resultadoReal,true);
        assertEquals(resultadoReal1,true);
        assertNotEquals(resultadoReal2,true);
    }

    @Test
    void consultarDia() {

        DiasLluvia d1= new DiasLluvia();

        d1.registroDia(19,3,true);
        d1.registroDia(2,3,false);

        boolean resultadoReal =d1.consultarDia(19,3);
        boolean resultadoReal1 =d1.consultarDia(2,3);
        boolean resultadoReal2 =d1.consultarDia(66,1);

        assertEquals(resultadoReal,true);
        assertEquals(resultadoReal1,false);
        assertNotEquals(resultadoReal2,true);
    }

    @Test
    void contarDiasLluviosos() {

        DiasLluvia d1= new DiasLluvia();
        DiasLluvia d2= new DiasLluvia();
        DiasLluvia d3= new DiasLluvia();

        d1.registroDia(19,3,true);
        d1.registroDia(2,3,true);
        d1.registroDia(15,7,true);
        d1.registroDia(12,11,true);
        d1.registroDia(19,8,true);

        int resultadoReal =d1.contarDiasLluviosos();
        assertEquals(resultadoReal,5);

        d2.registroDia(19,3,true);
        d2.registroDia(2,3,true);
        d2.registroDia(15,7,false);

        int resultadoReal1 =d2.contarDiasLluviosos();
        assertEquals(resultadoReal1,2);


        d3.registroDia(2,3,true);
        d3.registroDia(15,7,true);
        d3.registroDia(12,11,false);
        d3.registroDia(19,8,true);

        int resultadoReal2 =d3.contarDiasLluviosos();
        assertNotEquals(resultadoReal2,4);

    }

    @Test
    void trimestreLluvioso() {

        DiasLluvia d1= new DiasLluvia();
        DiasLluvia d2= new DiasLluvia();
        DiasLluvia d3= new DiasLluvia();

        d1.registroDia(19,3,true);
        d1.registroDia(2,3,true);
        d1.registroDia(1,12,true);
        d1.registroDia(12,3,true);
        d1.registroDia(19,8,true);

        int resultadoReal =d1.trimestreLluvioso();
        assertEquals(resultadoReal,1);

        d2.registroDia(19,3,true);
        d2.registroDia(2,4,true);
        d2.registroDia(15,4,true);

        int resultadoReal1 =d2.trimestreLluvioso();
        assertEquals(resultadoReal1,2);


        d3.registroDia(2,3,true);
        d3.registroDia(15,8,true);
        d3.registroDia(12,8,true);
        d3.registroDia(19,8,true);

        int resultadoReal2 =d3.trimestreLluvioso();
        assertNotEquals(resultadoReal2,4);
    }

    @Test
    void primerDiaLluvia() {
        DiasLluvia d1= new DiasLluvia();
        DiasLluvia d2= new DiasLluvia();
        DiasLluvia d3= new DiasLluvia();

        d1.registroDia(19,3,true);
        d1.registroDia(20,3,true);
        d1.registroDia(1,5,true);

        int resultadoReal =d1.primerDiaLluvia();
        assertEquals(resultadoReal,79);

        d2.registroDia(19,8,true);
        d2.registroDia(2,4,true);
        d2.registroDia(15,4,true);

        int resultadoReal1 =d2.primerDiaLluvia();
        assertEquals(resultadoReal1,92);

        d3.registroDia(19,3,true);
        d3.registroDia(20,3,true);
        d3.registroDia(1,5,true);

        int resultadoReal2 =d1.primerDiaLluvia();
        assertNotEquals(resultadoReal2,78);
    }
}