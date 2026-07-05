package springcore;

public class Address {

    private String city;
    private int pincode;

    public Address() {
    }

    public Address(String city, int pincode) {
        this.city = city;
        this.pincode = pincode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public int getPincode() {
        return pincode;
    }

}