package com.example.salon.Inquiries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class InquiriesController {
    
    @Autowired
    InquiriesService is;


    @GetMapping("/Academy")
    public String addNewInquiries(Model model)
    {
        Inquiries inquiries = new Inquiries();
        model.addAttribute("inquiries", inquiries);
        return "/1stbean/academy";
    }


    @PostMapping("/SaveInquiries")
    public String saveInquiries(@ModelAttribute("inquiries") Inquiries inquiries)
    {
        is.save(inquiries);
        return"redirect:/Academy";
    }


    @GetMapping("/InquiriesListAdmin")
    public String data(Model model)
    {
        model.addAttribute("allInquiriesList", is.getAllInquiries());
        return "/1stbean/inquirieslist";
    }


    
    
    @GetMapping("/Franchise")
    public String addNewfranchise(Model model)
    {
        Inquiries franchise = new Inquiries();
        model.addAttribute("franchise", franchise);
        return"/1stbean/franchise";
    }

    @PostMapping("/SaveFranchise")
    public String savefranchise(@ModelAttribute("franchise") Inquiries franchise)
    {
        is.save(franchise);
        return"redirect:/Franchise";
    }

    @GetMapping("/FranchiseListAdmin")
    public String datafranchise(Model model)
    {
        model.addAttribute("allfranchiseList", is.getAllfranchise());
        return "/1stbean/franchiselist";
    }

}
