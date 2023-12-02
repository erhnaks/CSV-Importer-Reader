package com.donal.csv_reader.csvimporter.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_details")
public class CustomerDetails {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "customer_reference")
    private String customerReference;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "address_line_one")
    private String addressLineOne;
    @Column(name = "address_line_two")
    private String addressLineTwo;
    @Column(name = "town")
    private String town;
    @Column(name = "county")
    private String county;
    @Column(name = "country")
    private String country;
    @Column(name = "postcode")
    private String postCode;

    public CustomerDetails() {
    }

    public CustomerDetails(long id, String customerReference, String customerName,
                           String addressLineOne, String addressLineTwo, String town,
                           String county, String country, String postCode) {
        this.id = id;
        this.customerReference = customerReference;
        this.customerName = customerName;
        this.addressLineOne = addressLineOne;
        this.addressLineTwo = addressLineTwo;
        this.town = town;
        this.county = county;
        this.country = country;
        this.postCode = postCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustomerReference() {
        return customerReference;
    }

    public void setCustomerReference(String customerReference) {
        this.customerReference = customerReference;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddressLineOne() {
        return addressLineOne;
    }

    public void setAddressLineOne(String addressLineOne) {
        this.addressLineOne = addressLineOne;
    }

    public String getAddressLineTwo() {
        return addressLineTwo;
    }

    public void setAddressLineTwo(String addressLineTwo) {
        this.addressLineTwo = addressLineTwo;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "CustomerDetails{" + "id=" + id + ", customerReference='" + customerReference + '\'' + ", customerName='" + customerName + '\'' + ", addressLineOne='" + addressLineOne + '\'' + ", addressLineTwo='" + addressLineTwo + '\'' + ", town='" + town + '\'' + ", county='" + county + '\'' + ", country='" + country + '\'' + ", postCode='" + postCode + '\'' + '}';
    }
}