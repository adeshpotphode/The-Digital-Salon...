package com.example.salon.beans;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Salon_pro")
public class Buy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String contacts;
    private String pincode;
    private String locality;
    private String address;
    private String city;
    private String state;
    private String landmark;
    private String altPhone;

    private String product;
    private Integer quantity;
    private Double price_per_unit;
    private Double total_price;


    private LocalDateTime orderDate;


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getContacts() {
        return contacts;
    }


    public void setContacts(String contacts) {
        this.contacts = contacts;
    }


    public String getPincode() {
        return pincode;
    }


    public void setPincode(String pincode) {
        this.pincode = pincode;
    }


    public String getLocality() {
        return locality;
    }


    public void setLocality(String locality) {
        this.locality = locality;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
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


    public String getLandmark() {
        return landmark;
    }


    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }


    public String getAltPhone() {
        return altPhone;
    }


    public void setAltPhone(String altPhone) {
        this.altPhone = altPhone;
    }


    public String getProduct() {
        return product;
    }


    public void setProduct(String product) {
        this.product = product;
    }


    public Integer getQuantity() {
        return quantity;
    }


    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    public Double getPrice_per_unit() {
        return price_per_unit;
    }


    public void setPrice_per_unit(Double price_per_unit) {
        this.price_per_unit = price_per_unit;
    }


    public Double getTotal_price() {
        return total_price;
    }


    public void setTotal_price(Double total_price) {
        this.total_price = total_price;
    }


    public LocalDateTime getOrderDate() {
        return orderDate;
    }


    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }


    @Override
    public String toString() {
        return "Buy [id=" + id + ", name=" + name + ", contacts=" + contacts + ", pincode=" + pincode + ", locality="
                + locality + ", address=" + address + ", city=" + city + ", state=" + state + ", landmark=" + landmark
                + ", altPhone=" + altPhone + ", product=" + product + ", quantity=" + quantity + ", price_per_unit="
                + price_per_unit + ", total_price=" + total_price + ", orderDate=" + orderDate + "]";
    }


}