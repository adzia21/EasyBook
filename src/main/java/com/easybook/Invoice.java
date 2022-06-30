package com.easybook;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Invoice {
    private String invoiceNumber;
    private Date dateOfCreation;
    private Date dateOfSell;
    private Date dateOfPayment;
    private String placeOfSell;
    private long id;
    private int amountOfServiceOrProduct;
    private BigDecimal advance;
    private String notes;
    private String priceToPayInWords;
    private List<ProductOrService> productOrServices;
    private TypesOfPayment typesOfPayment;
    private BankAccountDetails bankAccountDetails;

    public Invoice(String invoiceNumber, Date dateOfCreation, Date dateOfSell, Date dateOfPayment, String placeOfSell, long id, int amountOfServiceOrProduct, BigDecimal advance, String notes, String priceToPayInWords, List<ProductOrService> productOrServices, TypesOfPayment typesOfPayment, BankAccountDetails bankAccountDetails) {
        this.invoiceNumber = invoiceNumber;
        this.dateOfCreation = dateOfCreation;
        this.dateOfSell = dateOfSell;
        this.dateOfPayment = dateOfPayment;
        this.placeOfSell = placeOfSell;
        this.id = id;
        this.amountOfServiceOrProduct = amountOfServiceOrProduct;
        this.advance = advance;
        this.notes = notes;
        this.priceToPayInWords = priceToPayInWords;
        this.productOrServices = productOrServices;
        this.typesOfPayment = typesOfPayment;
        this.bankAccountDetails = bankAccountDetails;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Date getDateOfSell() {
        return dateOfSell;
    }

    public void setDateOfSell(Date dateOfSell) {
        this.dateOfSell = dateOfSell;
    }

    public Date getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(Date dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public String getPlaceOfSell() {
        return placeOfSell;
    }

    public void setPlaceOfSell(String placeOfSell) {
        this.placeOfSell = placeOfSell;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAmountOfServiceOrProduct() {
        return amountOfServiceOrProduct;
    }

    public void setAmountOfServiceOrProduct(int amountOfServiceOrProduct) {
        this.amountOfServiceOrProduct = amountOfServiceOrProduct;
    }

    public BigDecimal getAdvance() {
        return advance;
    }

    public void setAdvance(BigDecimal advance) {
        this.advance = advance;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPriceToPayInWords() {
        return priceToPayInWords;
    }

    public void setPriceToPayInWords(String priceToPayInWords) {
        this.priceToPayInWords = priceToPayInWords;
    }

    public List<ProductOrService> getProductOrServices() {
        return productOrServices;
    }

    public void setProductOrServices(List<ProductOrService> productOrServices) {
        this.productOrServices = productOrServices;
    }

    public TypesOfPayment getTypesOfPayment() {
        return typesOfPayment;
    }

    public void setTypesOfPayment(TypesOfPayment typesOfPayment) {
        this.typesOfPayment = typesOfPayment;
    }

    public BankAccountDetails getBankAccountDetails() {
        return bankAccountDetails;
    }

    public void setBankAccountDetails(BankAccountDetails bankAccountDetails) {
        this.bankAccountDetails = bankAccountDetails;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceNumber='" + invoiceNumber + '\'' +
                ", dateOfCreation=" + dateOfCreation +
                ", dateOfSell=" + dateOfSell +
                ", dateOfPayment=" + dateOfPayment +
                ", placeOfSell='" + placeOfSell + '\'' +
                ", id=" + id +
                ", amountOfServiceOrProduct=" + amountOfServiceOrProduct +
                ", advance=" + advance +
                ", notes='" + notes + '\'' +
                ", priceToPayInWords='" + priceToPayInWords + '\'' +
                ", productOrServices=" + productOrServices +
                ", typesOfPayment=" + typesOfPayment +
                ", bankAccountDetails=" + bankAccountDetails +
                '}';
    }

    //TODO calc method which counts VAT depends on what user picked (gross value)
    //TODO calc sum of vat and product/service amount and cost






}
