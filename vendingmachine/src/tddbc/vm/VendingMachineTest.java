package tddbc.vm;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {

	private VendingMachine vm;

	@Before
	public void setUp() {
		vm = new VendingMachine();
	}

	@Test
	public void testAmountWhenInitialized() {
		assertEquals(0, vm.amount());
	}

	@Test
	public void testDrinkName() {
		assertEquals("コーラ", vm.getDrinkName());
	}

	@Test
	public void testDrinkPrice() {
		assertEquals(120, vm.getDrinkPrice());
	}

	@Test
	public void testDrinkQuantity() {
		assertEquals(5, vm.getDrinkQuantity());
	}

	@Test
	public void testPay100() {
		vm.pay(100);
		assertEquals(100, vm.amount());
	}

	@Test
	public void testPayRegular() {
		vm.pay(10);
		vm.pay(10);
		assertEquals(20, vm.amount());
		vm.pay(50);
		vm.pay(50);
		assertEquals(120, vm.amount());
		vm.pay(100);
		vm.pay(100);
		assertEquals(320, vm.amount());
		vm.pay(500);
		vm.pay(500);
		assertEquals(1320, vm.amount());
		vm.pay(1000);
		vm.pay(1000);
		assertEquals(3320, vm.amount());
	}

	@Test
	public void testPayIrregular() {
		vm.pay(1);
		vm.pay(5);
		vm.pay(2000);
		vm.pay(5000);
		vm.pay(10000);
		assertEquals(0, vm.amount());
	}

	@Test
	public void testRepay() {
		vm.pay(100);
		assertEquals(100, vm.repay());
		assertEquals(0, vm.amount());
	}

	@Test
	public void testConstructor() {
		vm = new VendingMachine("コーラ", 120, 1);
		assertEquals(1, vm.getDrinkQuantity());
	}

	@Test
	public void testOrder() {
		assertEquals(0, vm.totalAmount());
		assertEquals(5, vm.getDrinkQuantity());

		vm.pay(100);
		vm.pay(50);
		vm.order();
		assertEquals(120, vm.totalAmount());
		assertEquals(30, vm.amount());
		assertEquals(4, vm.getDrinkQuantity());

		vm.pay(500);
		vm.order();
		assertEquals(240, vm.totalAmount());
		assertEquals(3, vm.getDrinkQuantity());
	}

	@Test
	public void testCantBuyWhenLessAmount() {
		vm.pay(100);
		vm.order();
		assertEquals(100, vm.amount());
		assertEquals(0, vm.totalAmount());
	}

	@Test
	public void testCantBuyWhenZeroDrinkQuantity() {
		vm = new VendingMachine("コーラ", 120, 0);
		vm.pay(500);
		vm.order();
		assertEquals(0, vm.getDrinkQuantity());
		assertEquals(500, vm.amount());
		assertEquals(0, vm.totalAmount());
	}
}
