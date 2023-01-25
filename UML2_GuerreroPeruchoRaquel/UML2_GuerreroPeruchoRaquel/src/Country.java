public class Country {
    private int id;
    private String name;
    private int State;

    public Country(int id, String name, int state) {
        this.id = id;
        this.name = name;
        State = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getState() {
        return State;
    }

    public void setState(int state) {
        State = state;
    }
}
