package com.example.salon.Inquiries;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InquiriesService {
    
    @Autowired
    InquiriesRepository ir;

    public void save(Inquiries academy) {
        ir.save(academy);
    }

    public List<Inquiries> getAllInquiries() {
        return ir.findAll();
    }

    public void savefranchise(Inquiries franchise){
        ir.save(franchise);
    }

    public List<Inquiries> getAllfranchise() {
        return ir.findAll();
    }
    
}
