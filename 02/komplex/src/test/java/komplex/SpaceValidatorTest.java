package komplex;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SpaceValidatorTest {
	
	SpaceValidator sv = new SpaceValidator();

	@Test
	public void isValidWithSpaceTest() {
		User user = mock(User.class);
		
		when(user.getName()).thenReturn(" vanbenne");
		
		assertFalse(sv.isValid(user));
	}
	
	@Test
	public void isValidWithoutSpaceTest() {
		User user = mock(User.class);
		
		when(user.getName()).thenReturn("nincsbenne");
		
		assertTrue(sv.isValid(user));
	}

}
