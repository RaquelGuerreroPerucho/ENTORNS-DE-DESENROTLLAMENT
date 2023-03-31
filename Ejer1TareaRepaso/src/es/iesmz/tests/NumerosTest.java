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