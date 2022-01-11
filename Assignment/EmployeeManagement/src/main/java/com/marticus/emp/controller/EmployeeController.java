package com.marticus.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marticus.emp.entity.EmployeeEntity;
import com.marticus.emp.repo.EmployeeRepo;
import com.marticus.emp.service.EmployeeService;

@Controller
@RequestMapping("/emp")
public class EmployeeController
{

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/")
	public String getEmployeeList(Model model) 
	{
		List<EmployeeEntity> employees = employeeService.getAllEmployeeList();
		model.addAttribute("empList", employees);

		return "emplist";
	}

	@GetMapping("/add")
	public String addEmployee()
	{

		return "addEmployee";
	}
	@GetMapping("/update/{id}")
	public String updateScreen(@PathVariable int id, Model model)
	{
		EmployeeEntity emp = employeeService.findEmployeesById(id);
		model.addAttribute("ID", emp.getId());
		model.addAttribute("NAME", emp.getEmpName());
		model.addAttribute("AGE", emp.getAge());
		model.addAttribute("SALARY", emp.getSalary());
		model.addAttribute("DEPARTMENT", emp.getDepartment());
		model.addAttribute("AADHAR", emp.getAadharNumber());

		return "update";
	}
	@GetMapping("/search")
	public String search(EmployeeEntity employeeEntity)
	{
		return "search";


	}
	@PostMapping("/add")
	public String saveEmpInDb(EmployeeEntity employeeEntity) 
	{
		employeeService.saveEmpInDB(employeeEntity);

		return "redirect:/emp/";

	
	
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) 
	{
		employeeService.deleteEmp(id);
		return "redirect:/emp/";

	
	}

	@PostMapping("/search")
	public String searchResults(String search, Model model)
	{
		List<EmployeeEntity> empList = employeeService.search(search);
		model.addAttribute("empList", empList);
		return "searchresult";

	
	}
	@PostMapping("/update")
    public String update(EmployeeEntity employeeEntity)
    {
	employeeService.update(employeeEntity);
	return "redirect:/emp/";

	
	}

}
