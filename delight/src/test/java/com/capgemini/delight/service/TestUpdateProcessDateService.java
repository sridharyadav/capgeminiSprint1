package com.capgemini.delight.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.capgemini.dd.service.UpdateProcessDateService;

public class TestUpdateProcessDateService {
	
	@Test
	public void testUpdateStockForId() {
		String result= "not a valid String";
		assertEquals(result,UpdateProcessDateService.service("A6", LocalDate.of(2020, 03, 02)));
	}
	@Test
	public void testUpdateStockForProcessDate() {
		String result="process date is after current date";
		assertEquals(result,UpdateProcessDateService.service("A1", LocalDate.of(2020, 03, 02)));
	}
	@Test
	public void TestUpdateStockProcessDateForAllCorrect() {
		String result="Data inserted";
		assertEquals(result,UpdateProcessDateService.service("A1", LocalDate.of(2020,01,03)));
	}
	@Test
	public void TestUpdateStockForDate() {
		assertTrue(UpdateProcessDateService.dateValidate("2020-02-02"));
	}
	@Test
	public void TestUpdateStockForDateFalse() {
		assertFalse(UpdateProcessDateService.dateValidate("20-02-2020"));
	}


}
