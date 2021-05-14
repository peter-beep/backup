import java.io.*;

import java.util.*;

public class Test {
	public static void main(String args[]) 
	{
//		int tf = 5;
//		
//		if((tf = 4*6/3-7) == 6)
//			System.out.println(tf);
//		else
//			System.out.println(tf);
		
		
		
		
		Test t = new Test();
		System.out.println(t.autoPay(500, 10));
	}
	
	public int autoPay(int amount, int numOfDays)
	{
		int balance = 10000;
		int numberOfPayments=0;
		
		int totalNumberOfPayments= balance/amount;
		
//		for (numberOfPayments=1; numberOfPayments <= totalNumberOfPayments; numberOfPayments++)
//			
//		{
//			balance= balance-amount;
//			System.out.println("You made " +numberOfPayments+ " payments");
//			
//		}
		
		numberOfPayments=1;
		
		int i = 10;
		while(i < 100)
		{
			if(i%2 == 0)
				i++;
			else
				i+=5;
			
			if(i == 50)
			{
				break;
			}
			System.out.println("hi");
		}
		
//		while(numberOfPayments <= totalNumberOfPayments)
//		{
//			
//			balance= balance-amount;
//			System.out.println("You made " +numberOfPayments+ " payments");
//			
//			
//			
//			numberOfPayments++;
//		}
		
//		for (balance = 10000; balance>=amount; balance-=amount)	
//		{			
//			numberOfPayments++;
//			
//			System.out.println("You made " +numberOfPayments+ " payments");
//			
//		}
			
		
		
	
		return balance;
		
		
	}

}