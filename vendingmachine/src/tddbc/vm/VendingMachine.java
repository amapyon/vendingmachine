package tddbc.vm;

public class VendingMachine {

	private int amount;

	public VendingMachine() {
		amount = 0;
	}

	public int amount() {
		return amount;
	}

	public void pay(int amount) {
		this.amount += amount;
	}

	public int repay() {
		int repay = amount;
		amount = 0;
		return repay;
	}

}
