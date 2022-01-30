package com.howtodoinjava.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.howtodoinjava.demo.model.CompanyVo;

import com.howtodoinjava.demo.service.CompanyManager;

@Controller
@RequestMapping("/Comp")
public class CompanyController {
	
	@Autowired
	CompanyManager companyManager;
	
	@RequestMapping(value = "/getAllCompanyNames", method = RequestMethod.GET)
	public String getAllCompanyName(Model model)
	{
		List<CompanyVo> compList=companyManager.getAllCompanyNames();
		model.addAttribute("companies",compList );
		model.addAttribute("name","INDHAR");
		return "companyListDisplay";
	}
	
	

}