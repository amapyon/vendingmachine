package tddbc.vm;

import static org.junit.Assert.*;

import org.junit.Test;

public class VendingMachineTest {

	@Test
	public void testAmount() {
		VendingMachine vm = new VendingMachine();
		assertEquals(0, vm.amount());
	}

}
