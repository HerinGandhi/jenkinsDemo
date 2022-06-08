package com.example.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class DemoController {

    @RequestMapping("/show")
    public String showMethod(){
        return "main-menu";
    }

    /*@RequestMapping("/process")
    public String processMethod(HttpServletRequest request, Model model){
        String nameStr = request.getParameter("name");
        nameStr = "Yo! " + nameStr.toUpperCase();
        model.addAttribute("message", nameStr);
        return "thank-you";
    }*/

    @RequestMapping("/process")
    public String processMethod(@RequestParam String name, Model model){
        String nameStr = "Yo! " + name.toUpperCase();
        model.addAttribute("message", nameStr);
        return "thank-you";
    }

}
