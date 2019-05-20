import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FrancTest {
	
	//Testes ultrapassados, cheque MoneyTest
	
	@Test
	public void testFrancMultiplication() {
		   Franc five = new Franc(5);
		   assertEquals(new Franc(10), five.times(2));
		   assertEquals(new Franc(15), five.times(3));
	}
	
	@Test
	public void testEquality() {
		   assertTrue(new Franc(5).equals(new Franc(5)));
		   assertFalse(new Franc(5).equals(new Franc(6)));
		   assertFalse(new Franc(5).equals(new Dollar(5)));
	}
}
