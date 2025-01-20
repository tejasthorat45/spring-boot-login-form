package com.practice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.practice.entity.LoginData;

import jakarta.validation.Valid;

@Controller
public class MyController {

    @GetMapping("/form")
    public String openForm(Model model) {
        System.out.println("Opening form");
        model.addAttribute("loginData", new LoginData()); // Consistent attribute name
        return "form"; // Matches form.html
    }

    // Handler for processing form
    @PostMapping("/process")
    public String processForm(@Valid @ModelAttribute("loginData") LoginData loginData,BindingResult result) {
    	if (result.hasErrors()) {
    		System.out.println(result);
    		 return "form"; // Redirects to success.html

	
		}
        System.out.println("Form submitted: " + loginData);
        //if error not occured
        return "success";
        
       
    }
}
