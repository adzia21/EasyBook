package com.easybook;

public class Entity {
    private String entityName;
    private String addressStreet;
    private String addressHomeNumber;
    private String addressApartmentNumber;
    private String zipCode;
    private String city;
    private String nip;
    private String country;
    private String regon;
    private boolean isInvoiceSender;
    private boolean isInvoiceRecipient;

    public Entity(String entityName, String addressStreet, String addressHomeNumber, String addressApartmentNumber, String zipCode, String city, String nip, String country, String regon, boolean isInvoiceSender, boolean isInvoiceRecipient) {
        this.entityName = entityName;
        this.addressStreet = addressStreet;
        this.addressHomeNumber = addressHomeNumber;
        this.addressApartmentNumber = addressApartmentNumber;
        this.zipCode = zipCode;
        this.city = city;
        this.nip = nip;
        this.country = country;
        this.regon = regon;
        this.isInvoiceSender = isInvoiceSender;
        this.isInvoiceRecipient = isInvoiceRecipient;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
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

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegon() {
        return regon;
    }

    public void setRegon(String regon) {
        this.regon = regon;
    }

    public boolean isInvoiceSender() {
        return isInvoiceSender;
    }

    public void setInvoiceSender(boolean invoiceSender) {
        isInvoiceSender = invoiceSender;
    }

    public boolean isInvoiceRecipient() {
        return isInvoiceRecipient;
    }

    public void setInvoiceRecipient(boolean invoiceRecipient) {
        isInvoiceRecipient = invoiceRecipient;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "entityName='" + entityName + '\'' +
                ", addressStreet='" + addressStreet + '\'' +
                ", addressHomeNumber='" + addressHomeNumber + '\'' +
                ", addressApartmentNumber='" + addressApartmentNumber + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", nip='" + nip + '\'' +
                ", country='" + country + '\'' +
                ", regon='" + regon + '\'' +
                ", isInvoiceSender=" + isInvoiceSender +
                ", isInvoiceRecipient=" + isInvoiceRecipient +
                '}';
    }
}