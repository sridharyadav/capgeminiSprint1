package com.capgemini.delight.service;

import com.capgemini.dd.service.UpdateProcessDateService;
import com.capgemini.dd.service.UpdateStockService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class TestUpdateStockService {
	UpdateStockService object=new UpdateStockService();
	@Test
	public void testUpdateStockManufactureDate() {
		String result="manufacture date is after current date";
		LocalDate manufactureDate=LocalDate.of(2020, 04, 01);
		LocalDate today=LocalDate.now();
		assertEquals(result,object.service("A1", today, manufactureDate, LocalDate.of(2020, 03, 02)));
	}
	@Test
	public void testUpdateStockForId() {
		String result= "not valid id";
		assertEquals(result,object.service("A6", LocalDate.of(2020, 03, 02), LocalDate.of(2020, 02, 19), LocalDate.of(2021, 02, 03)));
	}
	@Test
	public void testUpdateStockForExpiryDate() {
		String result="expiry date is before manufacture date";
		assertEquals(result,object.service("A1", LocalDate.now(), LocalDate.of(2020, 01, 03), LocalDate.of(2019, 03, 02)));
	}
	@Test
	public void testUpdateStockForDeliveryDate() {
		String result="delivery date is before manufacture date";
		assertEquals(result,object.service("A1",LocalDate.of(2019, 01, 02),LocalDate.of(2019, 03, 02),LocalDate.of(2021, 12, 03)));
	}
	@Test
	public void TestUpdateStockForDate() {
		assertTrue(object.dateValidate("2020-02-02"));
	}
	@Test
	public void TestUpdateStockForDateFalse() {
		assertFalse(object.dateValidate("20-02-2020"));
	}

}
