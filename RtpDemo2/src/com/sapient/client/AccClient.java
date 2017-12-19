package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Acc;
import com.sapient.service.LoanAcc;
import com.sapient.service.SavingsAcc;

public class AccClient {
	private static Acc[] arr = new Acc[2];
	static{
		arr[0] = new SavingsAcc(1001,"ram",5000);
		arr[1] = new LoanAcc(1002, "amith", 25000);
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String opt="null";
		int accType = 0;
		double amt=0;
		do{
			System.out.println("enter account type 0--savings 1--loan");
			accType = scan.nextInt();
			if(accType <0 && accType>1)
				System.out.println("invalid acc type");
			else{
				System.out.println("enter the amt to deposit");
				amt = scan.nextDouble();
				System.out.println(arr[accType].deposit(amt));
				arr[accType].display();
			}
			System.out.println("press y to continue");
			opt = scan.next();
		}while(opt.equals("y"));
		scan.close();
	}
}
