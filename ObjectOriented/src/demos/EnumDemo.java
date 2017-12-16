package demos;

import java.util.Scanner;

public class EnumDemo {
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		System.out.println("enter two values");
		int v1 = scn.nextInt();
		int v2 = scn.nextInt();
		System.out.println("choose 1--add\n 2--subtract\n 3--multiply");
		String str = scn.next();
		Menu menu = Menu.valueOf(str.toUpperCase());
		switch(menu){
		case ADD:
			System.out.println("add "+(v1+v2));
			break;
		case SUB:
			System.out.println("subtraction"+(v1-v2));
			break;
		case MULTIPLY:
			System.out.println("multiplication"+(v1*v2));
			break;
		default:
			System.out.println("invalid menu option");
		}
	}
}

enum Menu{
	ADD, SUB, MULTIPLY
}