package com.pack2;

public class Emp implements Comparable<Emp>{
	private int empId;
	private String eName;
	private double sal;
	public Emp(int empId, String eName, double sal) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.sal = sal;
	}
	public int getEmpId() {
		return empId;
	}
	public String geteName() {
		return eName;
	}
	public double getSal() {
		return sal;
	}
	@Override
	public String toString() {
		return empId+" "+eName+" "+sal;
	}
	@Override
	public int compareTo(Emp emp) {
		Integer e1 = this.empId;
		Integer e2 = emp.empId;
		return e1.compareTo(e2);
	}
	
}
