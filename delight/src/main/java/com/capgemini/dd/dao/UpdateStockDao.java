package com.capgemini.dd.dao;

import java.time.LocalDate;
import java.util.*;

import com.capgemini.dd.dto.UpdateStock;

import com.capgemini.dd.exception.InvalidDatesException;
import com.capgemini.dd.exception.InvalidStringException;
import com.capgemini.dd.util.StockRepository;

public class UpdateStockDao  {
	
	//Map<String ,UpdateStock> obj1=StockRepository.getStockRepository();
	
	Scanner sc= new Scanner(System.in);
	Set<UpdateStock> list=new LinkedHashSet<UpdateStock>();
	
	
	public static String date(String s,LocalDate deliveryDate,LocalDate manufacture,LocalDate expiry) {
		String result="";
		// StockRepository obj=new StockRepository();
		 Map<String, UpdateStock> map=StockRepository.getStockRepository();
		
		for(Map.Entry<String, UpdateStock> object:map.entrySet()) 
		{
			if(object.getKey().contentEquals(s))
			{
				UpdateStock up=object.getValue();
				up.setDeliveryDate(deliveryDate);
			   
			   up.setExpireDate(expiry);
			   up.setManufactureDate(manufacture);
			   map.put(object.getKey(), up);
			   result ="Data inserted";
		    }
		}
	
		return result;
		
	}
	

}
