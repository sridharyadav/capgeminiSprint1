package com.capgemini.dd.service;

import java.time.LocalDate;
import org.apache.commons.lang3.StringUtils;


import com.capgemini.dd.dao.UpdateProcessDateDao;



public class UpdateProcessDateService  {
	
	
	
	
	static public boolean dateValidate(String date)
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
	
	
	
	public static String service(String s,LocalDate processDate){
		
		String s1="A1";
		String s2="A2";
		String s3="A3";
		if(s.contentEquals(s1) || s.contentEquals(s2) || s.contentEquals(s3)) 
		{
			if(processDate.isBefore(LocalDate.now())) {
			
				return UpdateProcessDateDao.date(s,processDate);
			}
			else {
				return "process date is after current date";
			}
		}
		else {
			 return "not a valid String";
		}
		
	
	}
}