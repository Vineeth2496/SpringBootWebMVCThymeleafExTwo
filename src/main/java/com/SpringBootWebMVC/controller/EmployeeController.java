package com.SpringBootWebMVC.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SpringBootWebMVC.model.Employee;

@Controller
//@RequestMapping()
public class EmployeeController {
	@GetMapping("/data")
	public String showData() {
		return "EmpData";
	}
	@GetMapping("/msg")
	public String showmsg(Model model) {
		Employee e=new Employee(102, "VIKRAM", 5500.00);
		model.addAttribute("title", "VINEETH - IT");
		model.addAttribute("eob", e); //new Employee(101, "AJAY", 2500.00));
		
		List<Employee> emps=Arrays.asList(
				new Employee(103, "JAY", 1500.00),
				new Employee(104, "SYED", 2500.00),
				new Employee(105, "VINAY", 3500.00)
				);
		model.addAttribute("list", emps);
		return "EmpMessage";
	}
}
