package com.ssm.service;

import java.util.List;

import com.ssm.entity.Emp;
import com.ssm.exception.EmpException;

public interface EmpService {
	public List<Emp> getEmpList() throws EmpException;

}
