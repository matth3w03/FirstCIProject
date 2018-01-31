import static org.junit.Assert.*;

import org.junit.Test;

public class TestRentalCalculator {

	@Test
	//TC1 : First timer, Honda Fit, 1 Day, expect $61.75
	public void testTC1() {
		assertEquals("TC1 failed", RentalCalculator.carRental("Honda Fit", 1, true), 61.75, 0.00);
	}
	
	@Test
	//TC2 : First timer, Toyota Wish, 1 Day, expect $76.00
	public void testTC2() {
		assertEquals("TC2 failed", RentalCalculator.carRental("Toyota Wish", 1, true), 76.00, 0.00);
	}
	
	@Test
	//TC3 : Not First timer, HondaFit, 5 Days, expect $292.50
	public void testTC3() {
		assertEquals("TC3 failed", RentalCalculator.carRental("Honda Fit", 5, false), 292.50, 0.00);
	}
	
	@Test
	//TC4 : Not First timer, Toyota Wish, 5 Days, expect $360.00
	public void testTC4() {
		assertEquals("TC4 failed", RentalCalculator.carRental("Toyota Wish", 5, false), 360.00, 0.00);
	}
	
	@Test
	//TC5 : Not First timer, HondaFit, 3 Days, expect $195.00
	public void testTC5() {
		assertEquals("TC5 failed", RentalCalculator.carRental("Honda Fit", 3, false), 195.00, 0.00);
	}
	
	@Test
	//TC6 : First timer, Toyota Wish, 3 Days, expect $240.00
	public void testTC6() {
		assertEquals("TC6 failed", RentalCalculator.carRental("Toyota Wish", 3, false), 240.00, 0.00);
	}

}
