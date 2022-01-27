package oop3;

import java.util.ArrayList;

public class CreditApplicationManager implements CreditApplicatinService {
	
	private CreditApplicationDao krediApplicationDao;
	private ArrayList<Logger> logger;

	public CreditApplicationManager(CreditApplicationDao krediApplicationDao, ArrayList<Logger> logger) {
		super();
		this.krediApplicationDao = krediApplicationDao;
		this.logger = logger;
	}

	@Override
	public void add(CreditApplication creditApplication, double amount) {
		if (creditApplication.getCredit().getMinAmount() < amount
				&& amount < creditApplication.getCredit().getMaxAmount()) {
			System.out.println(creditApplication.getCustomer().getCustomerNumber() + " numarasýna sahip müþterinin " +
					creditApplication.getCredit().getName() + " adlý kredi baþvurusu baþarýlý bir þekilde tanýmlanmýþtýr..");
			this.krediApplicationDao.add(creditApplication, amount);
			creditApplication.setCreditAmount(amount);
			
			for (Logger logger2 : logger) {
				logger2.log();
			}

		} else {
			System.out.println("Þartlar saðlanamadý.");
		}

	}

	@Override
	public void update(CreditApplication creditApplication, double amount) {
		if (creditApplication.getCredit().getMinAmount() < amount
				&& amount < creditApplication.getCredit().getMaxAmount()) {
			this.krediApplicationDao.update(creditApplication, amount);
			for (Logger logger2 : logger) {
				logger2.log();
			}
		} else {
			System.out.println("Þartlar saðlanamadý.");
		}

	}

	@Override
	public void delete(CreditApplication creditApplication) {
		this.krediApplicationDao.delete(creditApplication);
		System.out.println(" Silindi" + creditApplication.getCredit().getName());
		for (Logger logger2 : logger) {
			logger2.log();
		}

	}
}
