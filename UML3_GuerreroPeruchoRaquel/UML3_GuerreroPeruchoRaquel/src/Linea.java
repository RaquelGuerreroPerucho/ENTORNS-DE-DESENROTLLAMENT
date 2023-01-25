public class Linea {

    private int id;

    private Punto[] formageometrica = new Punto[2];

    public Linea(int id, Punto p1, Punto p2) {
        this.id = id;
        this.formageometrica[0] = p1;
        this.formageometrica[1] = p2;
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
