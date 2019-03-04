package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 */
public class Address {



    public Address() {
    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */

     private String addressLine1 = "";
     private String addressLine2 = "";
     private String city = "";
     private String state = "";
     private String zipcode = "";

    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getAddressLine1() {
        return this.addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return this.addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
//        System.out.println("xxxxx");
//        System.out.println(o);

//        if (o == this.city){
//            return true;
//        }
        Address a = (Address) o;
        Boolean addressLine1 = this.addressLine1.equals(a.addressLine1);
        Boolean addressLine2 = this.addressLine2.equals(a.addressLine2);
        Boolean city = this.city.equals(a.city);
        Boolean state = this.state.equals(a.state);
        Boolean zipcode = this.zipcode == a.zipcode;

//        System.out.println( addressLine1 + " " + addressLine2 + " " + city + " " + state + " " + zipcode );

        return addressLine1 && addressLine2 && city && state & zipcode;
//        return (Boolean)null;
    }
}
