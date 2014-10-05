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

}
