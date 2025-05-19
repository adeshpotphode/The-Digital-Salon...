package com.example.salon.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.salon.beans.Salon;

public interface SalonRepository extends JpaRepository <Salon, Long> {
    
}
