package com.ssm.dao;

import java.util.List;

import com.ssm.entity.Emp;

public interface EmpDAO {
    int deleteByPrimaryKey(Short empno);

    int insert(Emp record);

    int insertSelective(Emp record);

    List<Emp> selectByPrimaryKey();

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}