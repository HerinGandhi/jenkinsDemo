package com.example.mvc;

import com.example.mvc.model.Student;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/form")
public class FormDemoController {

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){

        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }

    @RequestMapping("/show")
    public String showForm(Model model){

        Student student = new Student();
        model.addAttribute("student", student);
        return "form";
    }

    @RequestMapping("/process")
    public String processform(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult){
        System.out.println("Student: " +student.getName()+ " \n Email : " + student.getEmail() + " \n Department : " + student.getDept());
        for(String temp:student.getHobby())
            System.out.print(temp + " ");

        System.out.println(bindingResult.hasErrors());
        if(bindingResult.hasErrors())
            return "form";
        else
            return "formsubmit";
    }

}
