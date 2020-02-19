    package com.capgemini.dd.ui;



import java.time.LocalDate;
import java.util.*;


import com.capgemini.dd.service.UpdateProcessDateService;
import com.capgemini.dd.service.UpdateStockService;


public class UpdateStockMain  {
	public static void main(String[] args) {
		UpdateStockService obj=new UpdateStockService();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter 1 for delivery && manufacture Date && expiry date ");
			System.out.println("enter 2 for process date ");
			System.out.println("enter 3 to break");
			int n=sc.nextInt();
			
			switch(n) {
			case 1:
				System.out.println("Enter a String as A1, A2,A3");  
				String s=sc.next();
				while(true) {
				System.out.println("Enter manufactureDate in format(yyyy-mm-dd)");  
				String manufacture=sc.next();
				
				
				System.out.println("Enter deliveryDate in format(yyyy-mm-dd) ");  
				String delivery=sc.next();
				
				System.out.println("Enter expiryDate in format(yyyy-mm-dd)");  
				String expiry =sc.next();
				
				if(obj.dateValidate(manufacture)) {
					LocalDate manufactureDate=LocalDate.parse(manufacture);
					if(obj.dateValidate(expiry)) {
						LocalDate expiryDate=LocalDate.parse(expiry);
						if(obj.dateValidate(delivery)) {
							LocalDate deliveryDate=LocalDate.parse(delivery);
							String result=obj.service(s,deliveryDate,manufactureDate,expiryDate);
							System.out.println(result);
							break;
						}
						else {
							System.out.println("enter the delivery date in same format");
						}
						
					}
					else {
						System.out.println("enter the expiry date in same format");
					}
				}
				else {
					System.out.println("enter the manufacture date in same format");
				}
				}
				
				
				
				continue;
				
			case 2:
				System.out.println("Enter a String as A1, A2,A3");
				String d=sc.next();
				while(true)
				{
				System.out.println("Enter processDate in format(yyyy-mm-dd) "); 
				String process=sc.next();
				if(UpdateProcessDateService.dateValidate(process))
				{
					LocalDate processDate=LocalDate.parse(process);
					System.out.println(UpdateProcessDateService.service(d, processDate));
					break;
					
				}
				else
				{
					System.out.println("enter the date in same format");
				}
				}
				
				continue;
			
			case 3:
				break;
				
			}
	
			break;
		
		
			
		}

	sc.close();
	}


	


}
