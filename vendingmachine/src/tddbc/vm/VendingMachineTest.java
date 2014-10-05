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
	public void testPay100() throws Exception {
		vm.pay(100);
		assertEquals(100, vm.amount());
	}

	public void testPays() throws Exception {
	}
}
