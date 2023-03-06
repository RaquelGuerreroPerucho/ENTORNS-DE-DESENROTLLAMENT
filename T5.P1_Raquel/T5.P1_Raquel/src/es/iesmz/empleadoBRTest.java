package es.iesmz;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static es.iesmz.TipoEmpleado.encarregat;
import static es.iesmz.TipoEmpleado.venedor;
import static org.junit.jupiter.api.Assertions.*;

class empleadoBRTest {

    @BeforeEach
        public void mostrarMensaje(){
        System.out.println("EXECUTE PROVA");
    }
    @Test
        public void testCalcularSalarioNeto(){
        float resultadoReal =empleadoBR.calculaSalarioNeto(2000);
        float resultadoEsperado = 1640;

        assertEquals(resultadoReal,resultadoEsperado,0.01);
    }

    @Test
        public void testCalcularSalarioNeto1(){

        float resultadoReal =empleadoBR.calculaSalarioNeto(1500);
        float resultadoEsperado = 1230;

        assertEquals(resultadoReal,resultadoEsperado,0.01);
    }

    @Test
        public void testCalcularSalarioNeto2(){

        float resultadoReal =empleadoBR.calculaSalarioNeto(1499.99f);
        float resultadoEsperado = 1259.9916f;

        assertEquals(resultadoReal,resultadoEsperado,0.01);
    }

    @Test
        public void testCalcularSalarioNeto3(){

        float resultadoReal =empleadoBR.calculaSalarioNeto(1250f);
        float resultadoEsperado = 1050f;

        assertEquals(resultadoReal,resultadoEsperado,0.01);
    }

    @Test
    public void testCalcularSalarioNeto4(){

        float resultadoReal =empleadoBR.calculaSalarioNeto(1000f);
        float resultadoEsperado = 840f;

        assertEquals(resultadoReal,resultadoEsperado,0.01);
    }


    @Test
    public void testCalcularSalarioNeto5(){

        float resultadoReal =empleadoBR.calculaSalarioNeto(999.99f);
        float resultadoEsperado = 999.99f;

        assertEquals(resultadoReal,resultadoEsperado,0.01);
    }

    @Test
    public void testCalcularSalarioNeto6(){

        float resultadoReal =empleadoBR.calculaSalarioNeto(500f);
        float resultadoEsperado = 500f;

        assertEquals(resultadoReal,resultadoEsperado,0.01);
    }

    @Test
    public void testCalcularSalarioNeto7(){

        float resultadoReal =empleadoBR.calculaSalarioNeto(0f);
        float resultadoEsperado = 0f;

        assertEquals(resultadoReal,resultadoEsperado,0.01);
    }

    @Test
    public void testCalcularSalarioNeto8(){

        float resultadoReal =empleadoBR.calculaSalarioNeto(-1f);
        float resultadoEsperado = -1f;

        assertEquals(resultadoReal,resultadoEsperado,0.01);
    }

    @Test
    public void testCalcularSalarioBruto(){

        float resultadoReal =empleadoBR.calculaSalariBruto(venedor, 2000f, 8f);
        float resultadoEsperado = 1360f;

        assertEquals(resultadoReal,resultadoEsperado,0.01);
    }

    @Test
    public void testCalcularSalarioBruto1(){

        float resultadoReal =empleadoBR.calculaSalariBruto(venedor, 1500f, 3f);
        float resultadoEsperado = 1260f;

        assertEquals(resultadoReal,resultadoEsperado,0.01);
    }

    @Test
    public void testCalcularSalarioBruto2(){

        float resultadoReal =empleadoBR.calculaSalariBruto(venedor, 1499.99f, 0f);
        float resultadoEsperado = 1100f;

        assertEquals(resultadoReal,resultadoEsperado,0.01);
    }

    @Test
    public void testCalcularSalarioBruto3(){

        float resultadoReal =empleadoBR.calculaSalariBruto(encarregat, 1250f, 8f);
        float resultadoEsperado = 1760f;

        assertEquals(resultadoReal,resultadoEsperado,0.01);
    }

    @Test
    public void testCalcularSalarioBruto4(){

        float resultadoReal =empleadoBR.calculaSalariBruto(encarregat, 1000f, 0f);
        float resultadoEsperado = 1600f;

        assertEquals(resultadoReal,resultadoEsperado,0.01);
    }

    @Test
    public void testCalcularSalarioBruto5(){

        float resultadoReal =empleadoBR.calculaSalariBruto(encarregat, 999.99f, 3f);
        float resultadoEsperado = 1560f;

        assertEquals(resultadoReal,resultadoEsperado,0.01);
    }

    @Test
    public void testCalcularSalarioBruto6(){

        float resultadoReal =empleadoBR.calculaSalariBruto(encarregat, 500f, 0f);
        float resultadoEsperado = 1500f;

        assertEquals(resultadoReal,resultadoEsperado,0.01);
    }

    @Test
    public void testCalcularSalarioBruto7(){

        float resultadoReal =empleadoBR.calculaSalariBruto(encarregat, 0, 8f);
        float resultadoEsperado = 1660f;

        assertEquals(resultadoReal,resultadoEsperado,0.01);
    }

    @Test
    public void testCalcularSalarioBruto8(){

        float resultadoReal =empleadoBR.calculaSalariBruto(venedor, -1f, 8f);
        float resultadoEsperado = -1f;

        assertEquals(resultadoReal,resultadoEsperado,0.01);
    }

    @Test
    public void testCalcularSalarioBruto9(){

        float resultadoReal =empleadoBR.calculaSalariBruto(venedor, 1500f, -1f);
        float resultadoEsperado = -1f;

        assertEquals(resultadoReal,resultadoEsperado,0.01);
    }

    @Test
    public void testCalcularSalarioBruto10(){

        float resultadoReal =empleadoBR.calculaSalariBruto(null, 1500f, 8f);
        float resultadoEsperado =-1f;

        assertEquals(resultadoReal,resultadoEsperado,0.01);
    }
}