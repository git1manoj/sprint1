package com.capgemini.beans;
public class Product {
private int suplierId;
private int distributorId;
public int getSuplierId() {
	return suplierId;
}
public void setSuplierId(int suplierId) {
	this.suplierId = suplierId;
}
public int getDistributorId() {
	return distributorId;
}
public void setDistributorId(int distributorId) {
	this.distributorId = distributorId;
}
public String getDeliveryStatus() {
	return deliveryStatus;
}
public void setDeliveryStatus(String deliveryStatus) {
	this.deliveryStatus = deliveryStatus;
}
private String deliveryStatus; 
}
