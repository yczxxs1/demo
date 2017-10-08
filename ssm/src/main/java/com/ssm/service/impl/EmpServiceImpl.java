package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.EmpDAO;
import com.ssm.entity.Emp;
import com.ssm.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpDAO empDAO;
	
	public List<Emp> getEmpList() {
		System.out.println(empDAO.hashCode());
		return empDAO.selectByPrimaryKey();
	}

}
