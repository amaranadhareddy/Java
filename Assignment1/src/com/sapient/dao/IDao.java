package com.sapient.dao;

import java.util.List;

import com.sapient.exception.IdException;
import com.sapient.exception.NotFoundException;
import com.sapient.vo.Emp;

public interface IDao {
	
	List<Emp> viewEmployee();
	Emp viewEmployee(int eid) throws NotFoundException;
	int addEmployee(Emp emp) throws IdException;
	int removeEmployee(int eId) throws NotFoundException;
	int updateSalary(int eId ,int eNmae, double sal) throws NotFoundException;
}
