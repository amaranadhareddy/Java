package com.sapient.serial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializeDemo extends ObjectOutputStream {

	protected SerializeDemo() throws IOException, SecurityException {
		super();
	}

	@Override
	protected void writeStreamHeader() throws IOException {
		// TODO Auto-generated method stub
		reset();
	}

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("employee.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Emp emp1 = new Emp(1001,"ram",5000);
		Emp emp2 = new Emp(1002,"sam",4000);
		Emp emp3 = new Emp(1003,"tam",3000);
		oos.writeObject(emp1);
		oos.writeObject(emp2);
		oos.writeObject(emp3);
		oos.close();
		fos.close();
		System.out.println("serailized");
	}

}
