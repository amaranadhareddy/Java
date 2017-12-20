package com.sapient.text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {
	public static void main(String [] args) throws IOException{
		FileWriter fw = new FileWriter("sap.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("sapientrazorfish campus training program\n");
		bw.write("sapient clients are audi and ferrari\n");
		
		bw.close();
		fw.close();
		System.out.println("file created...");
	}
}
