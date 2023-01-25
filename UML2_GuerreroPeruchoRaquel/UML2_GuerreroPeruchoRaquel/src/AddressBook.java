public class AddressBook {
    private int code;
    private Person person;

    public AddressBook(int code, Person person) {
        this.code = code;
        this.person = person;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
