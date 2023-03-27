package test;
import clases.Cuenta;
import org.junit.Test;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testCartera {
    @Test
    public void testAlCrearCuentaElSaldoEsCero(){
        Cuenta c1= new Cuenta();

        double resultadoEsperado = 0;
        double resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado,resultadoReal);
    }

    @Test
    public void ingresarDinero100(){
        Cuenta c1= new Cuenta();
        c1.ingresar(100);

        double resultadoEsperado = 100;
        double resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado,resultadoReal);
    }

    @Test
    public void ingresarDinero3000(){
        Cuenta c1= new Cuenta();
        c1.ingresar(3000);

        double resultadoEsperado = 3000;
        double resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado,resultadoReal);
    }

    @Test
    public void ingresarDinero3000EnCuentaConDinero(){
        Cuenta c1= new Cuenta();
        c1.ingresar(100);
        c1.ingresar(3000);

        double resultadoEsperado = 3100;
        double resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado,resultadoReal);
    }

    @Test
    public void ingresarDineroMenos100(){
        Cuenta c1= new Cuenta();
        c1.ingresar(-100);

        double resultadoEsperado = 0;
        double resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado,resultadoReal);
    }

    @Test
    public void ingresarDinero10045(){
        Cuenta c1= new Cuenta();
        c1.ingresar(100.45f);

       float resultadoEsperado = 100.45f;
       float resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado,resultadoReal,0.01f);
    }

    @Test
    public void ingresarDinero60000(){
        Cuenta c1= new Cuenta();
        c1.ingresar(6000.00F);

        double resultadoEsperado = 6000.00F;
        double resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado,resultadoReal);
    }

    @Test
    public void ingresarDinero60001(){
        Cuenta c1= new Cuenta();
        c1.ingresar(6000.01F);

        double resultadoEsperado = 0;
        double resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado,resultadoReal);
    }

    @Test
    public void retirar100(){
        Cuenta c1= new Cuenta();
        c1.ingresar(500);
        c1.retirar(100);

        double resultadoEsperado = 400;
        double resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado,resultadoReal);
    }

    @Test
    public void retirar500(){
        Cuenta c1= new Cuenta();
        c1.ingresar(200);
        c1.retirar(500);

        double resultadoEsperado = 200;
        double resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado,resultadoReal);
    }

    @Test
    public void retirarNegativo100(){
        Cuenta c1= new Cuenta();
        c1.ingresar(500);
        c1.retirar(-100);

        double resultadoEsperado = 500;
        double resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado,resultadoReal);
    }

    @Test
    public void retirar10045(){
        Cuenta c1= new Cuenta();
        c1.ingresar(500);
        c1.retirar(100.45F);

        double resultadoEsperado = 399.55F;
        double resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado,resultadoReal);
    }

    @Test
    public void retirar6000(){
        Cuenta c1= new Cuenta();
        c1.ingresar(6000);
        c1.ingresar(1000);
        c1.retirar(6000);

        double resultadoEsperado = 1000;
        double resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado,resultadoReal);
    }

    @Test
    public void retirar6001(){
        Cuenta c1= new Cuenta();
        c1.ingresar(6000);
        c1.ingresar(1000);
        c1.retirar(6000.01F);

        double resultadoEsperado = 7000;
        double resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado,resultadoReal);
    }

    @Test
    public void transferencia(){
        Cuenta c1= new Cuenta();
        Cuenta c2= new Cuenta();

        c1.ingresar(500);
        c2.ingresar(50);
        c1.transferencia(100,c2);

        double resultadoEsperadoc1 = 400;
        double resultadoEsperadoc2 = 150;
        double resultadoRealc1 = c1.getSaldo();
        double resultadoRealc2 = c2.getSaldo();

        assertEquals(resultadoEsperadoc1,resultadoRealc1);
        assertEquals(resultadoEsperadoc2,resultadoRealc2);
    }

    @Test
    public void transferenciaEJER2(){
        Cuenta c1= new Cuenta();
        Cuenta c2= new Cuenta();

        c1.ingresar(500);
        c2.ingresar(50);
        c1.transferencia(-100,c2);

        double resultadoEsperadoc1 = 500;
        double resultadoEsperadoc2 = 50;
        double resultadoRealc1 = c1.getSaldo();
        double resultadoRealc2 = c2.getSaldo();

        assertEquals(resultadoEsperadoc1,resultadoRealc1);
        assertEquals(resultadoEsperadoc2,resultadoRealc2);
    }

    @Test
    public void transferenciaEJER3(){
        Cuenta c1= new Cuenta();
        Cuenta c2= new Cuenta();

        c1.ingresar(3500);
        c2.ingresar(50);
        c1.transferencia(3000,c2);

        double resultadoEsperadoc1 = 500;
        double resultadoEsperadoc2 = 3050;
        double resultadoRealc1 = c1.getSaldo();
        double resultadoRealc2 = c2.getSaldo();


        assertEquals(resultadoEsperadoc1,resultadoRealc1);
        assertEquals(resultadoEsperadoc2,resultadoRealc2);
    }

    @Test
    public void transferenciaEJER32(){
        Cuenta c1= new Cuenta();
        Cuenta c2= new Cuenta();

        c1.ingresar(3500);
        c2.ingresar(50);
        c1.transferencia(3000.01f,c2);

        float resultadoEsperadoc1 = 3500;
        float resultadoEsperadoc2 = 50;
        float resultadoRealc1 = c1.getSaldo();
        float resultadoRealc2 = c2.getSaldo();


        assertEquals(resultadoEsperadoc1,resultadoRealc1,0.01f);
        assertEquals(resultadoEsperadoc2,resultadoRealc2,0.01f);
    }
}
