package com.capgemini.daos;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class SupplierIdRepository { 
public static void list() {
HashMap<Integer,String> hm=new 	HashMap<Integer,String>();
hm.put(100,"Rahul");
hm.put(101,"Manoj");
hm.put(102,"Kunal");
hm.put(103,"Harshit");
hm.put(104,"Atal");
hm.put(105,"Hammad");
System.out.println("the supplier id and their names are :->");
for(Map.Entry m:hm.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());
	}
}
public static void display() {
	int[] a= {100,101,102,103,104,105};
	String str1="yes";
	String str2="no";
	Date d=new Date();
	System.out.println("enter the id of supplier from  data");
	Scanner s1= new Scanner(System.in);
	int id=s1.nextInt();
	

	
	switch(id) {
	case 100:
		System.out.println("delivery status is shipped order is supplied by Rahul at" +d );
		break;
	case 101:
		System.out.println("delivery status is shipped order is supplied by Manoj at" +d );
		break;
	case 102:
		System.out.println("delivery status is shipped order is supplied by Kunal at" +d );
		break;
	case 103:
		System.out.println("delivery status is shipped order is supplied by Harshit at" +d );
		break;
	case 104:
	System.out.println("delivery status is shipped order is supplied by Atal at" +d );
	break;
	case 105:
		System.out.println("delivery status is shipped order is supplied by Hammad at" +d );
		break;
		}

	if(id<100 && id>105) {
		System.out.println("please enter valid id of supplier");
		display();
	}

	
	
System.out.println("do you want to check the status of another supplier(yes/no)");
String str=s1.next();

if(str.equalsIgnoreCase(str1)) {
	display();
}
else if(str.equalsIgnoreCase(str2)) {
	System.out.println("thankyou for using our services \n please visit next time");
}
else {
	System.out.println("please enter valid input");
	}

}}

