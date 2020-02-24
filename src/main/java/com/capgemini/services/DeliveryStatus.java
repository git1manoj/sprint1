package com.capgemini.services;


import java.util.HashMap;
import java.util.Scanner;

import com.capgemini.daos.SupplierIdRepository;
public class DeliveryStatus {
	public static void deliveryStatus() {
		
		String str1="yes";
		String str2="no";
		Scanner s= new Scanner(System.in);
		System.out.println("do you want your delivery status (yes/no)\n");
		String str=s.next();
		if(str.equalsIgnoreCase(str1)) {
			
			}
		else if(str.equalsIgnoreCase(str2)) {
			System.out.println("thankyou for your response ");
			System.exit(0);
			}
			else {
				System.out.println("please enter valid input");
				deliveryStatus();
			}
		
		
	}
	}


