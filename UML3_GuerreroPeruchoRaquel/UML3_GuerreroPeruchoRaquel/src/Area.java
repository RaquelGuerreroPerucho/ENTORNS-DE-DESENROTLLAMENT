import java.util.ArrayList;

public class Area {
    private int id;
    private Punto[] formageometrica = new Punto [3];

    public Area(int id, Punto p1, Punto p2, Punto p3 ) {
        this.id = id;
        this.formageometrica[0] = p1;
        this.formageometrica[1] = p2;
        this.formageometrica[2] = p3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Punto[] getFormageometrica() {
        return formageometrica;
    }

    public void setFormageometrica(Punto[] formageometrica) {
        this.formageometrica = formageometrica;
    }
}
