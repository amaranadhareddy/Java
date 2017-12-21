package com.sapient.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sapient.exception.IdException;
import com.sapient.exception.NotFoundException;
import com.sapient.vo.Emp;

public class EmpMemDao implements IDao{

		public static Map<Integer, Emp> emap;
		static{
			emap = new HashMap<Integer, Emp>();
			emap.put(1001, new Emp(1001, "ram", 45000, 1, LocalDate.of(2014, 7, 21)));
			emap.put(1005, new Emp(1005, "tom", 55000, 1, LocalDate.of(2015, 9, 17)));
			emap.put(1003, new Emp(1003, "sam", 33000, 1, LocalDate.of(2013, 7, 13)));
		}
		@Override
		public List<Emp> viewEmployee() {
			List<Emp> lst = new ArrayList<Emp>();
			
			lst.addAll(emap.values());
			return lst;
		}
		@Override
		public Emp viewEmployee(int eid) throws NotFoundException {
			if(!emap.containsKey(eid))
				throw new NotFoundException("employee not found");
			Emp emp = emap.get(eid);
			return emp;
		}
		@Override
		public int addEmployee(Emp emp) throws IdException {
			if(emap.containsKey(emp.getEmpId()))
				throw new IdException("Id already exists");
			emap.put(emp.getEmpId(), emp);
			return 1;
		}
		@Override
		public int removeEmployee(int eId) throws NotFoundException {
			// TODO Auto-generated method stub
			return 0;
		}
		@Override
		public int updateSalary(int eId, int eNmae, double sal) throws NotFoundException {
			// TODO Auto-generated method stub
			return 0;
		}
		
}
