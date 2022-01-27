package oop3;

public class HibernateCreditApplicationDao implements CreditApplicationDao {

	@Override
	public void add(CreditApplication krediApplication, double amount) {
		System.out.println("Hibernate ile " + krediApplication.getCredit().getName() + " adlý kredisi eklendi.." );

	}

	@Override
	public void update(CreditApplication krediApplication, double amount) {
		System.out.println("Hibernate güncellendi : " + krediApplication.getCredit().getName());

	}

	@Override
	public void delete(CreditApplication krediApplication) {
		System.out.println("Hibernate silindi : " + krediApplication.getCredit().getName());

	}

}
