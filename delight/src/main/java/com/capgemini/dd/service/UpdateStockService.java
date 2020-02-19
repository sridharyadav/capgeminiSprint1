package com.capgemini.dd.service;

import java.time.LocalDate;

import com.capgemini.dd.dao.UpdateStockDao;

public class UpdateStockService {
	UpdateStockDao s=new UpdateStockDao();
	 public boolean dateValidate(String date)
	{
		
		if(date.matches("\\d{4}-\\d{2}-\\d{2}"))
		{
			
			return true;
			
		}
		else
		{
			
			return false;
		}
			
		
	}
	public String service(String s,LocalDate deliveryDate,LocalDate manufacture,LocalDate expiry){
		String s1="A1";
		String s2="A2";
		String s3="A3";
		if(s.contentEquals(s1) || s.contentEquals(s2) || s.contentEquals(s3)) {
				if(manufacture.isBefore(LocalDate.now())) {//expiry.isAfter(manufacture)
					if(manufacture.isBefore(deliveryDate)) {//manufacture.isBefore(LocalDate.now())
						if(expiry.isAfter(manufacture)) {
							return UpdateStockDao.date(s,deliveryDate,manufacture, expiry);
						}
						else {
							return "expiry date is before manufacture date";
						}
					}
					else {
						return "delivery date is before manufacture date";
					}
				}
				else {
					return "manufacture date is after current date";
				}
				
		}
		else {
			return "not valid id";
		}

	}
}


