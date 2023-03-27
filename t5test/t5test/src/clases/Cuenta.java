package clases;

public class Cuenta {
    private float saldo;

    public Cuenta() {
        this.saldo = 0;
    }

    public float getSaldo() {
        return saldo;
    }

    public void ingresar(float ingreso) {
        if(ingreso > 0 && ingreso <= 6000){
            saldo = saldo +(((float) Math.round(ingreso * 100f)/100f));
        }
    }

    public void retirar(float retirada) {
        if(retirada < 0 || retirada > 6000 || retirada >saldo){
            retirada=0;
        }
        saldo = saldo - retirada;
    }

    public void transferencia(float cantidad, Cuenta c2){
        if(cantidad <= 3000){
            retirar(cantidad);
            c2.ingresar (cantidad);
        }
    }
}
