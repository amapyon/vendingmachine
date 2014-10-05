package tddbc.vm;

import static org.junit.Assert.*;

import org.junit.Test;

public class VendingMachineTest {

	@Test
	public void testAmountWhenInitialized() {
		VendingMachine vm = new VendingMachine();
		assertEquals(0, vm.amount());
	}

	@Test
	public void testPay100() throws Exception {
		VendingMachine vm = new VendingMachine();
		vm.pay(100);
		assertEquals(100, vm.amount());
	}
}
