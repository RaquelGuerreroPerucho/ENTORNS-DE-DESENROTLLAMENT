public class Person {
    private String name;
    private int phoneNumber;
    private String emailAddress;
    private Address address;
    private AddressBook adressbook;

    public Person(String name, int phoneNumber, String emailAddress, Address address, AddressBook adressbook) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
        this.adressbook = adressbook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public AddressBook getAdressbook() {
        return adressbook;
    }

    public void setAdressbook(AddressBook adressbook) {
        this.adressbook = adressbook;
    }

    public void purchaseParkingPass(){
        System.out.println("ESTO ES UNA FUNCIÓN");
    }
}
