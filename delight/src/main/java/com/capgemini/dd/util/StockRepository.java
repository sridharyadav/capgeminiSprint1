package com.capgemini.dd.util;

import java.time.LocalDate;
import java.util.*;

import com.capgemini.dd.dto.UpdateStock;


public  class StockRepository {
	
	public static Map<String,UpdateStock> obj1=new HashMap<String, UpdateStock>();
	//private UpdateStock put;
//	String orderId, String name, double pricePerUnit, String quantityUnit, double price,
//	String wareHouseId, LocalDate deliveryDate, LocalDate manufactureDate, LocalDate expireDate,
//	String quantityCheck, LocalDate processDate
	
		static {
		
			
		    obj1.put("A1",new UpdateStock("A1","Cock",20.0,"40",800.0,"jalandhar01",null,null,null,"good",null));
			obj1.put("A2",new UpdateStock("A2","Maza",20.0,"40",800.0,"jalandhar01",null,null,null,"good",null));
			obj1.put("A3",new UpdateStock("A3","Cock",90.0,"50",4500.0,"jalandhar01",null,null,null,"good",null));
			
		}
	public static Map<String,UpdateStock> getStockRepository() {
		return obj1; 
	}
	


		
}
