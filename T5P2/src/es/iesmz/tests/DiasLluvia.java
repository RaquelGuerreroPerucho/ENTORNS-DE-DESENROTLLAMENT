package es.iesmz.tests;

public class DiasLluvia {
    boolean[][] diasLluvia;

    public DiasLluvia() {
        this.diasLluvia = new boolean[12][30];
    }

    public boolean registroDia(int dia, int mes, boolean lluvia) {
        if (dia <= 0 || dia >= 31 || mes < 1 || mes > 12) {
            return false;

        } else {
            mes--;
            dia--;
            diasLluvia[mes][dia] = lluvia;
            return true;
        }
    }

    public boolean consultarDia(int dia, int mes) {
        if (dia <= 0 || dia >= 31 || mes < 1 || mes > 12) {
            System.out.println("Fecha no valida");
            return false;
        }
        mes--;
        dia--;
        return diasLluvia[mes][dia];

    }

    public int contarDiasLluviosos() {
        int totalDias = 0;
        for (int i = 0; i < diasLluvia.length; i++) {
            for (int j = 0; j < diasLluvia[i].length; j++) {
                if (diasLluvia[i][j]) {
                    totalDias++;
                }
            }
        }

        return totalDias;
    }

    public int trimestreLluvioso() {
        int totalDias1 = 0, totalDias2 = 0, totalDias3 = 0, totalDias4 = 0;

        //Se que es pot fer mes facil i en la mitat de linies pero ara mateixa no sé, perdon per el desastre :).

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < diasLluvia[i].length; j++) {
                if (diasLluvia[i][j]) {
                    totalDias1++;
                }
            }
        }

        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < diasLluvia[i].length; j++) {
                if (diasLluvia[i][j]) {
                    totalDias2++;
                }
            }
        }

        for (int i = 6; i < 9; i++) {
            for (int j = 0; j < diasLluvia[i].length; j++) {
                if (diasLluvia[i][j]) {
                    totalDias3++;
                }
            }
        }

        for (int i = 9; i < 12; i++) {
            for (int j = 0; j < diasLluvia[i].length; j++) {
                if (diasLluvia[i][j]) {
                    totalDias4++;
                }
            }
        }

        int numeroMayor = totalDias1, trimestre = 1;

        if (totalDias2 > numeroMayor) {
            numeroMayor = totalDias2;
            trimestre = 2;

        }

        if (totalDias3 > numeroMayor) {
            numeroMayor = totalDias3;
            trimestre = 3;
        }

        if (totalDias4 > numeroMayor) {
            numeroMayor = totalDias4;
            trimestre = 4;
        }
        return trimestre;
    }

    public int primerDiaLluvia() {
        int numdia = 0;

        for (int i = 0; i < diasLluvia.length; i++) {
            for (int j = 0; j < diasLluvia[i].length; j++) {
                if (diasLluvia[i][j]) {
                    numdia = i * 30 + (j+1);
                    return numdia;
                }
            }
        }
        return numdia;
    }
}
