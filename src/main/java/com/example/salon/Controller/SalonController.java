package com.example.salon.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.salon.Service.SalonService;
import com.example.salon.beans.Salon;

@Controller
public class SalonController {

    @Autowired
    SalonService ss;

    @GetMapping("/")
    public String index()
    {
        return"/1stbean/index";
    }

    @GetMapping("/AdminPage")
    public String admin()
    {
        return"/1stbean/admin";
    }

    

    @GetMapping("/AppointmentListAdmin")
    public String data(Model model)
    {
        model.addAttribute("allSalonList", ss.getAllSalon());
        return "/1stbean/appointmentlist";
    }


    @GetMapping("/Services")
    public String service()
    {
        return"/1stbean/services";
    }


    @GetMapping("/Appointment")
    public String addnewcustomer(Model model)
    {
        Salon salon = new Salon();
        model.addAttribute("salon", salon);
        return "1stbean/appointment";
    }

    @PostMapping("/Save")
    public String saveSalon(@ModelAttribute("salon") Salon salon)
    {
        ss.save(salon);
        return"redirect:/";
    }

    @GetMapping("/ShowUpdateForm/{id}")
    public String updateForm(@PathVariable(value = "id") long id, Model model)
    {
        Salon salon = ss.getById(id);
        model.addAttribute("salon", salon);
        return "/1stbean/update";
    }

    @GetMapping("/Delete/{id}")
    public String deleteId(@PathVariable(value = "id") long id)
    {
        ss.deletekaroId(id);
        return "redirect:/AllData";
    }
}


