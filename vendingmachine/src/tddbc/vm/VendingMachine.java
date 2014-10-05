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
		switch (amount) {
		case 10:
		case 50:
		case 100:
		case 500:
		case 1000:
			this.amount += amount;
		}
	}

	public int repay() {
		int repay = amount;
		amount = 0;
		return repay;
	}

	public String getDrinkName() {
		return "";
	}

}
