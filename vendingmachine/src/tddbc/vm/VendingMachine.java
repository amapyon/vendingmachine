package tddbc.vm;

public class VendingMachine {

	private int amount;
	private String drinkName;
	private int drinkPrice;
	private int drinkQuantity;

	public VendingMachine() {
		amount = 0;
		drinkName = "コーラ";
		drinkPrice = 120;
		drinkQuantity = 5;
	}

	public VendingMachine(String drinkName, int dinrkPrice, int drinkQuantity) {
		// TODO 自動生成されたコンストラクター・スタブ
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

}
