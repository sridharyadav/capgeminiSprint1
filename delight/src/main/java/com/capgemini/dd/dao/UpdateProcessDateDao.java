package com.capgemini.dd.dao;


import java.time.LocalDate;
import java.util.*;

import com.capgemini.dd.dto.UpdateStock;


import com.capgemini.dd.util.StockRepository;

public class UpdateProcessDateDao {
	
	Scanner sc= new Scanner(System.in);
	Set<UpdateStock> list=new LinkedHashSet<UpdateStock>();
	
	
	public static  String date(String s,LocalDate processDate) {
		 Map<String, UpdateStock> map=StockRepository.getStockRepository();
		
		for(Map.Entry<String, UpdateStock> object:map.entrySet()) 
		{
			if(object.getKey().contentEquals(s))
			{
				UpdateStock up=object.getValue();
				up.setProcessDate(processDate);
			   map.put(object.getKey(), up);
			   return "Data inserted";
		    }
		}
	
		return "Not inserted";
		
	}
	

}