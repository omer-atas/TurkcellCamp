package oop3;

public class CorporateCustomer extends Customer {

	private String companyName;

	public CorporateCustomer() {
		super();
	}

	public CorporateCustomer(String companyName) {
		super();
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
