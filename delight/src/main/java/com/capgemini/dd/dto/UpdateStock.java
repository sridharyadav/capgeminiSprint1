package com.capgemini.dd.dto;

import java.sql.Date;
import java.time.LocalDate;

public class UpdateStock {
	private String orderId;
	private String name;
	private double pricePerUnit;
	private String quantityUnit;
	private double Price;
	private String wareHouseId;
	private LocalDate deliveryDate;
	private LocalDate manufactureDate;
	private LocalDate expireDate;
	private String quantityCheck;
	private LocalDate processDate;










	public LocalDate getProcessDate() {
		return processDate;
	}


	public void setProcessDate(LocalDate processDate) {
		this.processDate = processDate;
	}


	




	


	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public UpdateStock(String orderId, String name, double pricePerUnit, String quantityUnit, double price,
			String wareHouseId, LocalDate deliveryDate, LocalDate manufactureDate, LocalDate expireDate,
			String quantityCheck, LocalDate processDate) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.pricePerUnit = pricePerUnit;
		this.quantityUnit = quantityUnit;
		Price = price;
		this.wareHouseId = wareHouseId;
		this.deliveryDate = deliveryDate;
		this.manufactureDate = manufactureDate;
		this.expireDate = expireDate;
		this.quantityCheck = quantityCheck;
		this.processDate = processDate;
	}


	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public String getQuantityUnit() {
		return quantityUnit;
	}
	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public String getWareHouseId() {
		return wareHouseId;
	}
	public void setWareHouseId(String wareHouseId) {
		this.wareHouseId = wareHouseId;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public LocalDate getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public LocalDate getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}
	public String getQuantityCheck() {
		return quantityCheck;
	}
	public void setQuantityCheck(String quantityCheck) {
		this.quantityCheck = quantityCheck;
	}


	@Override
	public String toString() {
		return " [orderId=" + orderId + ", name=" + name + ", pricePerUnit=" + pricePerUnit
				+ ", quantityUnit=" + quantityUnit + ", Price=" + Price + ", wareHouseId=" + wareHouseId
				+ ", deliveryDate=" + deliveryDate + ", manufactureDate=" + manufactureDate + ", expireDate="
				+ expireDate + ", quantityCheck=" + quantityCheck + ", processDate=" + processDate + "]\n";
	}

}
