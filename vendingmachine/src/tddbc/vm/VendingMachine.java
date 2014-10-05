package tddbc.vm;

public class VendingMachine {

	private int totalAmount;
	private int amount;
	private String drinkName;
	private int drinkPrice;
	private int drinkQuantity;

	public VendingMachine() {
		this("コーラ", 120, 5);
	}

	public VendingMachine(String drinkName, int drinkPrice, int drinkQuantity) {
		totalAmount = 0;
		amount = 0;
		this.drinkName = drinkName;
		this.drinkPrice = drinkPrice;
		this.drinkQuantity = drinkQuantity;
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
		return drinkName;
	}

	public int getDrinkPrice() {
		return drinkPrice;
	}

	public int getDrinkQuantity() {
		return drinkQuantity;
	}

	public void order() {
		if (!canOrder()) return;

		totalAmount += drinkPrice;
		amount -= drinkPrice;
		drinkQuantity--;
	}

	public int totalAmount() {
		return totalAmount;
	}

	public boolean canOrder() {
		if (amount < drinkPrice) return false;
		if (drinkQuantity == 0) return false;
		return true;
	}

}
