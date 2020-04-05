package komplex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class LengthValidatorTest {

	LengthValidator lv = new LengthValidator();
	
	@Test
	public void isValidShortTest() {
		User user = mock(User.class);
		
		when(user.getName()).thenReturn("rovid");
		
		assertFalse(lv.isValid(user));
	}

	@Test
	public void isValidLongTest() {
		User user = mock(User.class);
		
		when(user.getName()).thenReturn("nagyonhosszu");
		
		assertTrue(lv.isValid(user));
	}
}
