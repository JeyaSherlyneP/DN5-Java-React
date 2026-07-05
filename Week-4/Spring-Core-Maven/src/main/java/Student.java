package springcore;

public class Student {

    private String name;
    private Address address;

    public Student() {
    }

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void display() {

        System.out.println("Student Name : " + name);

        System.out.println("City : " + address.getCity());

        System.out.println("Pincode : " + address.getPincode());

    }

}