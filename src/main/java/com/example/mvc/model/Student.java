package com.example.mvc.model;

import javax.validation.constraints.*;

import com.example.mvc.validation.CourseCode;
import lombok.Data;
import java.util.LinkedHashMap;

@Data
public class Student {

    @NotNull(message = "(Name is Required)")
    @Size(min=1, message = "(Name is Required)")
    private String name;

    @NotNull(message = "email is Required")
    private String email;

    @NotNull(message = "(Age is Required)")
    @Min(value=16, message = "Enter age above 16")
    @Max(value=65, message = "Enter age below 65")
    private Integer age;

    @NotNull(message = "(Pin code is Required)")
    @Pattern(regexp = "^[0-9]{6}", message = "Enter six digit postcode of your area")
    private String pincode;

    @CourseCode
    private String classcode;

    private String dept;
    private String gender;
    private String[] hobby;

    private LinkedHashMap<String, String> deptOptions;

    public Student(){
        deptOptions = new LinkedHashMap<>();

        deptOptions.put("Computer Science & Engineering","CSE");
        deptOptions.put("Electrical Engineering", "EE");
        deptOptions.put("Electronic Engineering", "EC");
        deptOptions.put("Mechnical Engineering", "ME");
        deptOptions.put("Civil Engineering", "CL");
        deptOptions.put("Instrumentation & Control", "IC");
    }
}
