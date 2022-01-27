package oop3;

public class Credit {
	
	private int id;
	private String name;
	private double minAmount;
	private double maxAmount;

	public Credit() {
		super();
	}

	public Credit(int id, String name, double minAmount, double maxAmount) {
		super();
		this.id = id;
		this.name = name;
		this.minAmount = minAmount;
		this.maxAmount = maxAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMinAmount() {
		return minAmount;
	}

	public void setMinAmount(double minAmount) {
		this.minAmount = minAmount;
	}

	public double getMaxAmount() {
		return maxAmount;
	}

	public void setMaxAmount(double maxAmount) {
		this.maxAmount = maxAmount;
	}
}
