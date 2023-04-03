package es.iesmz.tests;

import java.util.Objects;

public class Time {
    private int hora, minuto, segundo;

    public Time(int hora, int minuto, int segundo) {

        if(segundo >= 60){
            minuto ++;
            segundo = 0;
        }this.segundo = segundo;

        if(minuto >= 60){
            hora ++;
            minuto = 0;
        } this.minuto = minuto;

        if(hora>=24){
            hora=0;
        }this.hora = hora;

    }

    @Override
    public String toString() {
        return "Time{" +
                "hora=" + hora +
                ", minuto=" + minuto +
                ", segundo=" + segundo +
                '}';
    }

    public Time nextSecond(){
        segundo++;
        return new Time(hora, minuto, segundo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hora == time.hora && minuto == time.minuto && segundo == time.segundo;
    }

}
