package com.sapient.client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.sapient.dao.DaoFactory;
import com.sapient.dao.IDao;
import com.sapient.exception.IdException;
import com.sapient.exception.NotFoundException;
import com.sapient.vo.Emp;

public class EmpClient {
	static Scanner scan = new Scanner(System.in);
	static IDao dao = DaoFactory.getDaoInstance();
	public static void main(String[] args) {
		String strmenu = null;
		String opt = null;
		Menu emenu = null;
		do{
			System.out.println("choose : ADD\nEDIT\nREMOVE\nVIEW\nVIEWALL\n");
			strmenu =scan.next();
			try{
				emenu = Menu.valueOf(strmenu);
				processMenu(emenu);
			}catch(Exception ex){
				System.out.println("invalid menu option");
			}
			System.out.println("press y to continue");
			opt = scan.next();
		}while(opt.equals("y"));
		
	}
	
	public static void processMenu(Menu menu){
		switch(menu){
		case VIEWALL:
			viewall();
			break;
		case VIEW:
			viewById();
			break;
		case ADD:
			addEmp();
			break;
		}
	}

	public static void addEmp() {
		System.out.println("enter eid ename sal deptid ");
		int eid=scan.nextInt();
		String ename = scan.next();
		double sal = scan.nextDouble();
		int deptid = scan.nextInt();
		System.out.println("enter date(dd-MM-yyyy)");
		String strdt = scan.next();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate doj = LocalDate.parse(strdt, df);
		Emp emp = new Emp(eid,ename,sal,deptid,doj);
		try {
			int res = dao.addEmployee(emp);
			System.out.println("employee added");
			
		} catch (IdException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void viewById() {
		System.out.println("enter emp id");
		int eid = scan.nextInt();
		try {
			Emp emp = dao.viewEmployee(eid);
			System.out.println(emp);
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	public static void viewall() {
		List<Emp> lst = dao.viewEmployee();
		for(Emp emp:lst){
			System.out.println(emp);
		}
	}

}
