package hu.me.krz.haladojava;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LabegysegImplTest {

	@Test
	public void mozgas() {
		assertEquals(50, new LabegysegImp().mozgas(560));
	}

}
