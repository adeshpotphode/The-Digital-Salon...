package com.example.salon.Controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.salon.Service.BuyService;
import com.example.salon.beans.Buy;


@Controller
public class BuyController {
    
    @Autowired
    BuyService bs;

    @GetMapping("/Shop")
    public String shop()
    {
        return "2ndbean/shopping";
    }

    @GetMapping("/Login")
    public String login()
    {
        return "2ndbean/login";
    }
    @GetMapping("/Signup")
    public String signup()
    {
        return "2ndbean/signup";
    }


    @GetMapping("/buy")
    public String showBuyForm(Model model,
                              @RequestParam(value="product", required=false) String product,
                              @RequestParam(value="quantity", required=false) Integer quantity,
                              @RequestParam(value="price", required=false) Double price) {
        
        Buy buy = new Buy();
    
        if (product != null) buy.setProduct(product);
        if (quantity != null) buy.setQuantity(quantity);
        if (price != null) buy.setPrice_per_unit(price);
    
        if (price != null && quantity != null) {
            buy.setTotal_price(price * quantity);
        } else {
            buy.setTotal_price(0.0); // या null छोड़ सकते हैं
        }
    
        model.addAttribute("buy", buy);
        return "2ndbean/buy";
    }


    @PostMapping("/SaveBuy")
    public String savebuy(@ModelAttribute("buy") Buy buy)
    {
        buy.setOrderDate(LocalDateTime.now());
        bs.save(buy);
        return "redirect:/Shop";
    }

}