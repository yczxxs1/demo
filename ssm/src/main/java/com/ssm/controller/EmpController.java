package com.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssm.dto.JsonResult;
import com.ssm.entity.Emp;
import com.ssm.service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	 @Resource
	private ModelMapper modelMapper;
	 
	 
	
	@GetMapping("/emps")
	public JsonResult<List<Emp>> getEmps(){
		//modelMapper.map(Emp, JsonDTO.class)
		
		try {
			System.out.println(empService.hashCode());
			List<Emp> list = empService.getEmpList();
			return new JsonResult<List<Emp>>(list);
		} catch (Exception e) {
			e.printStackTrace();
			return new JsonResult<List<Emp>>(e);
		}
	}
	

}
