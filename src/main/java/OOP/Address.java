package OOP;

public class Address {
    private String street;
    private String city;
    private int postalCode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (!street.isEmpty()){
            this.street = street;
        } else {
            System.out.println("Error: Invalid Street Address");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (!city.isEmpty()){
            this.city = city;
        }else {
            System.out.println("Error: Invalid City Address");
        }
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        if(postalCode > 99){
            this.postalCode = postalCode;
        } else {
            System.out.println("Error: Invalid Postal Code");
        }

    }
    //constructor
    public Address(String street, String city, int postalCode) {
        setStreet(street);
        setCity(city);
        setPostalCode(postalCode);
    }
    @Override
    public String toString() {
        return " Street : " + street + ", City : " + city + ", PostalCode : " + postalCode;
    }
}
