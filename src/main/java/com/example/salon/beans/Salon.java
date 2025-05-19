package com.example.salon.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "thesalon")
public class Salon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    Long contact; 
    String email;
    String ourService;
    String appointmentDate;
    String appointmentTime;
    String message;
   
    
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
    public Long getContact() {
        return contact;
    }
    public void setContact(Long contact) {
        this.contact = contact;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getOurService() {
        return ourService;
    }
    public void setOurService(String ourService) {
        this.ourService = ourService;
    }
    public String getAppointmentDate() {
        return appointmentDate;
    }
    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
    public String getAppointmentTime() {
        return appointmentTime;
    }
    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Salon [id=" + id + ", name=" + name + ", contact=" + contact + ", email=" + email + ", ourService="
                + ourService + ", appointmentDate=" + appointmentDate + ", appointmentTime=" + appointmentTime
                + ", message=" + message + "]";
    }
}