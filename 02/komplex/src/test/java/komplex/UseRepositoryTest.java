package komplex;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;



import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

class UseRepositoryTest {
	

	@Test
	public void saveTest() {
		
		UseRepository ur = new UseRepository();
		User user = mock(User.class);
		
		when(user.getName()).thenReturn("Test");
		
		ur.save(user);
		
		assertEquals(user, ur.findAll().get(0));
		assertEquals(1, ur.findAll().size());
	}
	
	@Test
	public void getByNektunKodTest() {
		
		UseRepository ur = new UseRepository();
		User user = mock(User.class);
		
		ur.save(user);
		
		when(user.getNeptunkod()).thenReturn("true");
		
		assertEquals(user, ur.getByNektunKod("true"));
		assertEquals(null, ur.getByNektunKod("false"));
	}
	
	@Test
	public void findByEnabledIsTrueTest() {
		
		UseRepository ur = new UseRepository();
		User user1 = mock(User.class);
		User user2 = mock(User.class);
		
		ur.save(user1);
		ur.save(user2);
		
		when(user1.isEnabled()).thenReturn(true);
		when(user2.isEnabled()).thenReturn(false);
		
		assertEquals(user1, ur.findByEnabledIsTrue().get(0));
		assertEquals(1, ur.findByEnabledIsTrue().size());
	}
	

}
