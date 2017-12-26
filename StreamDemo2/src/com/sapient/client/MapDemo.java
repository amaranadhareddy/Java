package com.sapient.client;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.sapient.util.EmpUtil;
import com.sapient.vo.Emp;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Emp> lst = new ArrayList<Emp>();
		lst.add(new Emp(1007,"ram",23000));
		lst.add(new Emp(1009,"ram",53000));
		lst.add(new Emp(2002,"anand",13000));
		lst.add(new Emp(2005,"vikas",28000));
		lst.add(new Emp(1003,"rajesh",23000));
		
		Stream<Emp> s = lst.stream().map(e->{e.setEsal(e.getEsal()+0.1*e.getEsal());return e;});
		s.forEach(EmpUtil::display);
		
		
	}

}
