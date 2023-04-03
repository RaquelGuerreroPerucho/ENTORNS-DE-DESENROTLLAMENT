package es.iesmz.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumerosTest {

    @BeforeEach
    public void mostrarMensaje(){
        System.out.println("EXECUTE PROVA");
    }
    @Test
    void sonIguales() {
        int resultado = Numeros.sonIguales(4,55,7);
        assertEquals( 2 ,resultado);
    }
    @Test
    void sonIguales1() {
        int resultado = Numeros.sonIguales(14,23,27);
        assertEquals( 2 ,resultado);
    }
    @Test
    void sonIguales2() {
        int resultado = Numeros.sonIguales(14,55,14);
        assertEquals( 1 ,resultado);
    }
    @Test
    void sonIguales3() {
        int resultado = Numeros.sonIguales(14,14,33);
        assertEquals( 1 ,resultado);
    }
    @Test
    void sonIguales4() {
        int resultado = Numeros.sonIguales(32,55,55);
        assertEquals( 1 ,resultado);
    }
    @Test
    void sonIguales5() {
        int resultado = Numeros.sonIguales(329,329,329);
        assertEquals( 0 ,resultado);
    }
}

class VocalesTest{
    @BeforeEach
    public void mostrarMensaje(){
        System.out.println("EXECUTE PROVA");
    }
    @Test
    void contarvocales2() {
        int resultado = Vocales.contarvocales("Hola Mundo");
        assertEquals( 4 ,resultado);
    }
    @Test
    void contarvocales() {
        int resultado = Vocales.contarvocales("Esto Es una cadenA");
        assertEquals( 8 ,resultado);
    }
    @Test
    void contarvocales1() {
        int resultado = Vocales.contarvocales("Java mola MogollOn");
        assertEquals( 7 ,resultado);
    }

    @Test
    void contarvocales3() {
        int resultado = Vocales.contarvocales("4h0r4 s0n num3r0s");
        assertEquals( 1 ,resultado);
    }
    @Test
    void contarvocales4() {
        int resultado = Vocales.contarvocales("Cadena S1n Vocales");
        assertEquals( 6 ,resultado);
    }
}

class Vocales2Test {
    @BeforeEach
    public void mostrarMensaje() {
        System.out.println("EXECUTE PROVA");
    }

    @Test
    void sinvocales() {
        String resultado = Vocales2.sinvocales("Hola Mundo");
        assertEquals("Hl Mnd", resultado);
    }

    @Test
    void sinvocales1() {
        String resultado = Vocales2.sinvocales("Esto Es una cadenA");
        assertEquals("st s n cdn", resultado);
    }

    @Test
    void sinvocales2() {
        String resultado = Vocales2.sinvocales("Java mola MogollOn");
        assertEquals("Jv ml Mglln", resultado);
    }

    @Test
    void sinvocales3() {
        String resultado = Vocales2.sinvocales("4h0r4 s0n num3r0s");
        assertEquals("4h0r4 s0n nm3r0s", resultado);
    }

    @Test
    void sinvocales4() {
        String resultado = Vocales2.sinvocales("Cadena Sin Vocales");
        assertEquals("Cdn Sn Vcls", resultado);
    }
}

class VectorTest{
    @BeforeEach
    public void mostrarMensaje(){
        System.out.println("EXECUTE PROVA");
    }

    @Test
    void reverso1() {
        int v[]={1,2,3,4,5,6};
        int [] resultadoEsperado = Vector.reverso(v);
        int [] resultadoObtenido  = {6,5,4,3,2,1};
        assertArrayEquals(resultadoObtenido,resultadoEsperado);
    }

    @Test
    void reverso2() {
        int v[]={10,12,5,221,6,7};
        int [] resultadoEsperado = Vector.reverso(v);
        int [] resultadoObtenido  = {7,6,221,5,12,10};
        assertArrayEquals(resultadoObtenido,resultadoEsperado);
    }

    @Test
    void reverso3() {
        int v[]={5};
        int [] resultadoEsperado = Vector.reverso(v);
        int [] resultadoObtenido  = {5};
        assertArrayEquals(resultadoObtenido,resultadoEsperado);
    }

    @Test
    void reverso4() {
        int v[]={5,10,20};
        int [] resultadoEsperado = Vector.reverso(v);
        int [] resultadoObtenido  = {20,10,5};
        assertArrayEquals(resultadoObtenido,resultadoEsperado);
    }
}

class TimeTest{
    @Test
    void nextSecond() {
        Time t1 = (new Time(12,14,15));
        Time resultado = t1.nextSecond();
        Time resultadoEsperado = (new Time(12,14,16));

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    void nextSecond1() {
        Time t1 = (new Time(12,59,44));
        Time resultado = t1.nextSecond();
        Time resultadoEsperado = (new Time(12,59,45));

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    void nextSecond2() {
        Time t1 = (new Time(1,9,59));
        Time resultado = t1.nextSecond();
        Time resultadoEsperado = (new Time(1,10,0));

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    void nextSecond3() {
        Time t1 = (new Time(17,59,59));
        Time resultado = t1.nextSecond();
        Time resultadoEsperado = (new Time(18,0,0));

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    void nextSecond4() {
        Time t1 = (new Time(23,59,59));
        Time resultado = t1.nextSecond();
        Time resultadoEsperado = (new Time(0,0,0));

        assertEquals(resultadoEsperado, resultado);
    }
}

