package com.example.salon.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.salon.beans.Buy;

public interface BuyRepository extends JpaRepository <Buy, Long>{
    
}
