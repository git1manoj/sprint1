package com.capegemini.client;

import com.capgemini.daos.SupplierIdRepository;
import com.capgemini.services.DeliveryStatus;

public class Main {

	public static void main(String[] args) {
		SupplierIdRepository.list();
		 DeliveryStatus.deliveryStatus();
		 SupplierIdRepository.display();
		 
		 

	}

}

