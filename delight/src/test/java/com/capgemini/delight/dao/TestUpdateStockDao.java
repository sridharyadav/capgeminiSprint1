package com.capgemini.delight.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.capgemini.dd.dao.UpdateProcessDateDao;

public class TestUpdateStockDao {
	@Test
	public void testDate() {
		
		String str="Data inserted";
		LocalDate processDate=LocalDate.now();
		assertEquals(str,UpdateProcessDateDao.date("A1", processDate));
	}
@Test
public void testDate1() {
	
	String str="Not inserted";
	LocalDate processDate=LocalDate.now();
	assertEquals(str,UpdateProcessDateDao.date("A5", processDate));
}


}
