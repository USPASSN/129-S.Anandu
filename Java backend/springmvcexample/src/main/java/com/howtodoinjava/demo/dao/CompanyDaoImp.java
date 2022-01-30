package com.howtodoinjava.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.howtodoinjava.demo.model.CompanyVo;


@Repository
@Scope("singleton")
public class CompanyDaoImp implements CompanyDao {

	@Override
	public List<CompanyVo> getAllCompanyNames() {
		// TODO Auto-generated method stub
		
		List<CompanyVo> companies = new ArrayList<CompanyVo>();
		
		CompanyVo company1=new CompanyVo();
		company1.setCompanyName("IBM");
		companies.add(company1);
		
		CompanyVo company2=new CompanyVo();
		company2.setCompanyName("Cognizant");
		companies.add(company2);
		
		CompanyVo company3=new CompanyVo();
		company3.setCompanyName("TCS");
		companies.add(company3);
		
		return companies;
		
		
	}

}