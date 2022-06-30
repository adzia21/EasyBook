package com.easybook;

public class BankAccountDetails {
    private String name;
    private String addressStreet;
    private String addressHomeNumber;
    private String addressApartmentNumber;
    private String zipCode;
    private String city;
    private String country;
    private String accountNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressHomeNumber() {
        return addressHomeNumber;
    }

    public void setAddressHomeNumber(String addressHomeNumber) {
        this.addressHomeNumber = addressHomeNumber;
    }

    public String getAddressApartmentNumber() {
        return addressApartmentNumber;
    }

    public void setAddressApartmentNumber(String addressApartmentNumber) {
        this.addressApartmentNumber = addressApartmentNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccountDetails(String name, String addressStreet, String addressHomeNumber, String addressApartmentNumber, String zipCode, String city, String country, String accountNumber) {
        this.name = name;
        this.addressStreet = addressStreet;
        this.addressHomeNumber = addressHomeNumber;
        this.addressApartmentNumber = addressApartmentNumber;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
        this.accountNumber = accountNumber;


    }

    @Override
    public String toString() {
        return "BankAccountDetails{" +
                "name='" + name + '\'' +
                ", addressStreet='" + addressStreet + '\'' +
                ", addressHomeNumber='" + addressHomeNumber + '\'' +
                ", addressApartmentNumber='" + addressApartmentNumber + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
