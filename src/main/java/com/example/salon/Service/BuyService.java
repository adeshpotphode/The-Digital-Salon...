package com.example.salon.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.salon.Repository.BuyRepository;
import com.example.salon.beans.Buy;

@Service
public class BuyService {
    
    @Autowired
    BuyRepository br;

    public List<Buy> getAllBuy()
    {
        return br.findAll();
    }

    public void save(Buy buy)
    {
        br.save(buy);
    }
}