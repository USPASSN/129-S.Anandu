package com.howtodoinjava.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.howtodoinjava.demo.dao.CompanyDao;
import com.howtodoinjava.demo.model.CompanyVo;

@Service
@Scope("singleton")
public class CompanyManagerImp implements CompanyManager {

	@Autowired
	CompanyDao companyDao;
	
	public CompanyManagerImp(CompanyDao companyDaoConstructor)
	{
		this.companyDao=companyDaoConstructor;
	}
	
	public CompanyManagerImp()
	{
		
	}
	public void setCompanyDao(CompanyDao companyDao)
	{
		this.companyDao=companyDao;
	}
	@Override
	public List<CompanyVo> getAllCompanyNames() {
		// TODO Auto-generated method stub
		return companyDao.getAllCompanyNames();
	}

}