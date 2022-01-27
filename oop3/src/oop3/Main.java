package oop3;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		Credit credit = new Credit(1, "�ift�i Kredisi", 100.00, 500.00);
		
		IndividualCustomer individualCustomer = new IndividualCustomer(1, "123456", "ciftci@gmail.com", "�ift�i", "Emek�i", "123456789");
		
		CreditApplication creditApplication = new CreditApplication();
		creditApplication.setId(1);
		creditApplication.setCustomer(individualCustomer);
		creditApplication.setCredit(credit);
		
		ArrayList<Logger> logger = new ArrayList<Logger>();
		logger.add(new DatabaseLogger());
		logger.add(new FileLogger());
		
		CreditApplicationManager creditApplicationManager = new CreditApplicationManager(new HibernateCreditApplicationDao() , logger);
		creditApplicationManager.add(creditApplication, 400.00);
		
		System.out.println( "Al�nan kredi tutar� : " + creditApplication.getCreditAmount());
		
	
	}

}
