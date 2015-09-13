
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArithmeticTest {

	@Test
	public void testSum() {
		Arithmetic obj  = new Arithmetic();
		int result = obj.sum(3,5);
		assert(result == 8);
		
	}

}
