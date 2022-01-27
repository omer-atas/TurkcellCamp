package oop3;

public class JdbcCreditiApplicationDao implements CreditApplicationDao {

	@Override
	public void add(CreditApplication krediApplication, double amount) {
		System.out.println("Jdbc eklendi : " + krediApplication.getCredit().getName());

	}

	@Override
	public void update(CreditApplication krediApplication, double amount) {
		System.out.println("Jdbc güncellendi : " + krediApplication.getCredit().getName());

	}

	@Override
	public void delete(CreditApplication krediApplication) {
		System.out.println("Jdbc silindi : " + krediApplication.getCredit().getName());

	}

}
