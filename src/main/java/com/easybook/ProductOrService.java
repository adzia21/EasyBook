package com.easybook;

import java.math.BigDecimal;

public class ProductOrService {
    private String name;
    private boolean isService;
    private boolean isProduct;
    private BigDecimal netPrice;
    private VatValue vatValue;

    public ProductOrService(String name, boolean isService, boolean isProduct, BigDecimal netPrice, VatValue vatValue) {
        this.name = name;
        this.isService = isService;
        this.isProduct = isProduct;
        this.netPrice = netPrice;
        this.vatValue = vatValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isService() {
        return isService;
    }

    public void setService(boolean service) {
        isService = service;
    }

    public boolean isProduct() {
        return isProduct;
    }

    public void setProduct(boolean product) {
        isProduct = product;
    }

    public BigDecimal getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(BigDecimal netPrice) {
        this.netPrice = netPrice;
    }

    public VatValue getVatValue() {
        return vatValue;
    }

    public void setVatValue(VatValue vatValue) {
        this.vatValue = vatValue;
    }

    @Override
    public String toString() {
        return "ProductOrService{" +
                "name='" + name + '\'' +
                ", isService=" + isService +
                ", isProduct=" + isProduct +
                ", netPrice=" + netPrice +
                ", vatValue=" + vatValue +
                '}';
    }
}
