package komplex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NeptunCodeGeneratorTest {

	@Test
	public void getNextCounterTest() {
		NeptunCodeGenerator ncg = new NeptunCodeGenerator();
		
		assertEquals(0, ncg.getNextCounter());
		
		ncg.getNextCounter();
		
	}

}
