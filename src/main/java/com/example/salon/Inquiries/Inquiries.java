package com.example.salon.Inquiries;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "academy_list")
public class Inquiries {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String firstName;
    String lastName;
    Long contacts;
    String email;
    String city;
    String Address;
    String massage;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Long getContacts() {
        return contacts;
    }
    public void setContacts(Long contacts) {
        this.contacts = contacts;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public String getMassage() {
        return massage;
    }
    public void setMassage(String massage) {
        this.massage = massage;
    }
    @Override
    public String toString() {
        return "Inquiries [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", contacts=" + contacts
                + ", email=" + email + ", city=" + city + ", Address=" + Address + ", massage=" + massage + "]";
    }
    
}