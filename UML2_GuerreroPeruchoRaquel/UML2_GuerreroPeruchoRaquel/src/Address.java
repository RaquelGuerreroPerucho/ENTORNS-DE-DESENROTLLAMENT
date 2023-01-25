import java.lang.reflect.Array;
import java.util.ArrayList;

public class Address {
    private String street;
    private String city;
    private int postalCode;
    private State state;

    private ArrayList<Person> persons;

    public Address(String street, String city, int postalCode, Person person, State state) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.state = state;
        this.persons = new ArrayList<Person>();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public State getState() { return state; }

    public void setState(State state) {
        this.state = state;
    }

    public void anyadirPersona(Person p1){
        this.persons.add(p1);
    }
}
