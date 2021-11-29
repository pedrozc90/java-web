package models;

public class Costumer {

    private Long id;

    // info
    private String cpf;
    private String name;
    private String phone;
    private String email;

    // address
    private String address;
    private String number;
    private String complement;
    private String reference;
    private String zip_code;
    private String district;
    private String city;
    private String state;
    private String country;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getZipCode() {
        return zip_code;
    }

    public void setZipCode(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Costumer merge(final Costumer c) {
        //this.setId(c.getId());
        this.setCpf(c.getCpf());
        this.setName(c.getName());
        this.setPhone(c.getPhone());
        this.setEmail(c.getEmail());
        this.setAddress(c.getAddress());
        this.setNumber(c.getNumber());
        this.setComplement(c.getComplement());
        this.setReference(c.getReference());
        this.setZipCode(c.getZipCode());
        this.setDistrict(c.getDistrict());
        this.setCity(c.getCity());
        this.setState(c.getState());
        this.setCountry(c.getCountry());
        return this;
    }

}
