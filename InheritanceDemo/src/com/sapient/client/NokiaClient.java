package com.sapient.client;

import com.sapient.service.NokiaLumia;

public class NokiaClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NokiaLumia mobile = new NokiaLumia();
		mobile.doConverse();
		mobile.browseNet();
		mobile.captureImage();
		mobile.sendSms();
	}

}
