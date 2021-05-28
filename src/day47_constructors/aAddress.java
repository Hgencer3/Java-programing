package day47_constructors;

public class aAddress {

    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country = "USA";

    //constructors method automaticly called
    public aAddress() {
        System.out.println("Address constructor");
        street = "123 unknown st";
        city = "unknown";
        state = "unknown";
        zipCode = "00000";
    }
    public aAddress(String street, String city, String state, String zipCode) {
       setStreet(street);//reuse the code in the setter method
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }
    public String getStreet() {return street; }
    public void setStreet(String street) {
        if (street.isEmpty() || street.length() > 50) {
            System.out.println("ERROR invalid street");
        } else {
            this.street = street;
        }
    }
    public String getCity() {return city; }
    public void setCity(String city) {this.city = city; }
    public String getState() {return state; }
    public void setState(String state) {this.state = state;}
    public String getZipCode() { return zipCode;}
    public void setZipCode (String zipCode){ this.zipCode = zipCode; }
    public String getCountry () {return country; }
    public void setCountry (String country){this.country = country;}
    }

