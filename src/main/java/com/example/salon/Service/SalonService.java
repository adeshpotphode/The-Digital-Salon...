package com.example.salon.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.salon.Repository.SalonRepository;
import com.example.salon.beans.Salon;

@Service
public class SalonService {
    
    @Autowired
    SalonRepository sr;

    public List<Salon> getAllSalon()
    {
        return sr.findAll();
    }

    public void save(Salon salon)
    {
        sr.save(salon);
    }

    public Salon getById(long id)
    {
        Optional<Salon> optional = sr.findById(id);
        Salon salon = null;
        if (optional.isPresent()) {
            salon = optional.get();
        }
        else
        throw new RuntimeException("Salon not found for id : " + id);
        return salon;
    }

    public void deletekaroId(long i)
    {
        sr.deleteById(i);
    }
}