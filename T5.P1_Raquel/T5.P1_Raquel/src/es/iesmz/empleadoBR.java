package es.iesmz;

public class empleadoBR {
    public static float calculaSalariBruto(TipoEmpleado tipus, float ventasMes, float horasExtra ){
        float sb;
        final float precioHorasEstra=20;
        float cantHorasExtra = horasExtra * 20;

        if(tipus == TipoEmpleado.venedor){
            sb = 1000;
        }else {
            sb = 1500;
        }

        if(ventasMes >= 1500){
            sb += 200;
        }else if (ventasMes >= 1000){
            sb += 100;
        }

        if(horasExtra < 0  || ventasMes < 0 ||tipus == null){
            sb = -1;
        }else{
            sb = sb + cantHorasExtra;
        }
        return sb;
    }

    public static float calculaSalarioNeto(float salarioBruto){
        float retencion = 0;

        if (salarioBruto < 0){
            return -1;
        }

        if(salarioBruto >= 1500){
           retencion = 18;
        }else if(salarioBruto >= 1000){
            retencion = 16;
        }
        return salarioBruto - salarioBruto * (retencion/100);
    }
}
