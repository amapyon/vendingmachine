package tddbc.vm;

public class VendingMachine {

	private int amount;
	private String drinkName;
	private int drinkPrice;
	private int drinkQuantity;

	public VendingMachine() {
		this("コーラ", 120, 5);
	}

	public VendingMachine(String drinkName, int drinkPrice, int drinkQuantity) {
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

	public int order() {
		return amount - drinkPrice;
	}

	public int totalAmount() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

}
