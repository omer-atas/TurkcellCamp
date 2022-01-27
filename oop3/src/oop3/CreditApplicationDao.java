package oop3;

public interface CreditApplicationDao {
	
	void add(CreditApplication krediApplication, double amount);

	void update(CreditApplication krediApplication, double amount);

	void delete(CreditApplication krediApplication);
}
